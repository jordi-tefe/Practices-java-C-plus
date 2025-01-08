/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Guesswithserver;

/**
 *
 * @author USER
 */




import java.io.*;
import java.net.*;
import java.util.*;

public class Server {
    private static final int PORT = 12345;
    private static Set<PrintWriter> clientWriters = new HashSet<>();
    private static int secretNumber;
    private static volatile boolean gameWon = false;

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Server is running. Waiting for clients...");
            secretNumber = new Random().nextInt(10) + 1;

            while (true) {
                new ClientHandler(serverSocket.accept()).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static class ClientHandler extends Thread {
        private Socket socket;
        private PrintWriter out;

        public ClientHandler(Socket socket) {
            this.socket = socket;
        }

        public void run() {
            try {
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                out = new PrintWriter(socket.getOutputStream(), true);
                synchronized (clientWriters) {
                    clientWriters.add(out);
                }

                out.println("Welcome to the guessing game! Try to guess the secret number (1-10)");

                while (true) {
                    String input = in.readLine();
                    if (input == null) {
                        break; // Client disconnected
                    }

                    int guess;
                    try {
                        guess = Integer.parseInt(input);
                    } catch (NumberFormatException e) {
                        out.println("Invalid input. Please enter a number.");
                        continue;
                    }

                    synchronized (clientWriters) {
                        if (gameWon) {
                            out.println("You loseeeee! The game has already been won.");
                        } else if (guess == secretNumber) {
                            gameWon = true;
                            out.println("Congratulations! You guessed it.");
                            broadcastToOthers("You lose! The game has already been won.", out);
                        } else if (guess < secretNumber) {
                            out.println("Try a higher number.");
                        } else {
                            out.println("Try a lower number.");
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                synchronized (clientWriters) {
                    clientWriters.remove(out);
                }
            }
        }

        private void broadcastToOthers(String message, PrintWriter excludeWriter) {
            synchronized (clientWriters) {
                for (PrintWriter writer : clientWriters) {
                    if (writer != excludeWriter) {
                        writer.println(message);
                    }
                }
            }
        }
    }
}


//import java.io.*;
//import java.net.*;
//import java.util.*;
//
//public class Server {
//    private static final int PORT = 12345;
//    private static Set<PrintWriter> clientWriters = new HashSet<>();
//    private static int secretNumber;
//
//    public static void main(String[] args) {
//        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
//            System.out.println("Server is running. Waiting for clients...");
//            secretNumber = new Random().nextInt(100) + 1;
//
//            while (true) {
//                new ClientHandler(serverSocket.accept()).start();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    private static class ClientHandler extends Thread {
//        private Socket socket;
//        private PrintWriter out;
//
//        public ClientHandler(Socket socket) {
//            this.socket = socket;
//        }
//
//        public void run() {
//            try {
//                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//                out = new PrintWriter(socket.getOutputStream(), true);
//                clientWriters.add(out);
//
//                out.println("Welcome to the guessing game! Try to guess the secret number (1-100).");
//
//                while (true) {
//                    String input = in.readLine();
//                    if (input == null) {
//                        break; // Client disconnected
//                    }
//                    int guess = Integer.parseInt(input);
//
//                    if (guess == secretNumber) {
//                        broadcast("Congratulations! You guessed it.");
//                        break;
//                    } else if (guess < secretNumber) {
//                        out.println("Try a higher number.");
//                    } else {
//                        out.println("Try a lower number.");
//                    }
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            } finally {
//                try {
//                    socket.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//                clientWriters.remove(out);
//            }
//        }
//
//        private void broadcast(String message) {
//            for (PrintWriter writer : clientWriters) {
//                writer.println(message);
//            }
//        }
//    }
//}
//
