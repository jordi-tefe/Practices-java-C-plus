/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guessing;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author USER
 */
public class GuessingGame {
    
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(50) + 1;
        int numberOfTries = 0;
        boolean hasGuessedCorrectly = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I've picked a number between 1 and 50. Try to guess it!");

        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            numberOfTries++;

            if (userGuess == numberToGuess) {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You guessed the correct number in " + numberOfTries + " tries.");
            } else if (userGuess < numberToGuess) {
                System.out.println("Too low! Try a higher number.");
            } else {
                System.out.println("Too high! Try a lower number.");
            }
        }

        scanner.close();
    }
    
}
