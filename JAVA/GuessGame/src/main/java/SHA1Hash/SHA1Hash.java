/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SHA1Hash;


/**
 *
 * @author USER
 */


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA1Hash {
    private JFrame frame;
    private JTextField inputField;
    private JTextArea resultArea;

    public SHA1Hash() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame("SHA-1 Hash Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 200);
        frame.setLayout(new BorderLayout());

        // Input field
        inputField = new JTextField();
        frame.add(inputField, BorderLayout.NORTH);

        // Calculate button
        JButton calculateButton = new JButton("Calculate SHA-1");
         calculateButton.setPreferredSize(new Dimension(20, 10));
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = inputField.getText();
                String sha1Hash = calculateSHA1(input);
                resultArea.setText("SHA-1 hash for \"" + input + "\":\n" + sha1Hash);
            }
        });
        frame.add(calculateButton, BorderLayout.CENTER);

        // Result area
        resultArea = new JTextArea();
        resultArea.setEditable(false);
        frame.add(resultArea, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    private String calculateSHA1(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            byte[] messageDigest = md.digest(input.getBytes());

            // Convert the byte array to a positive BigInteger
            BigInteger no = new BigInteger(1, messageDigest);

            // Convert the BigInteger to a hexadecimal string
            String hashText = no.toString(16);

            // Pad with leading zeros if necessary
            while (hashText.length() < 40) {
                hashText = "0" + hashText;
            }

            return hashText;
        } catch (NoSuchAlgorithmException ex) {
            throw new RuntimeException(ex);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SHA1Hash());
    }
}
