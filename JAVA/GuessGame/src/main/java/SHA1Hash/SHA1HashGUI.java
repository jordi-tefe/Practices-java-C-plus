/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package SHA1Hash;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA1HashGUI {
    private JFrame frame;
    private JTextArea inputField;
    private JTextArea resultArea;
    private boolean isDarkMode = false;

    public SHA1HashGUI() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame("SHA-1 Hash Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setLayout(new BorderLayout(10, 10));
        frame.setLocationRelativeTo(null); // Center the frame

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BorderLayout(5, 5));
        inputPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        JLabel inputLabel = new JLabel("Input:");
        inputPanel.add(inputLabel, BorderLayout.NORTH);

        inputField = new JTextArea(3, 30);
        inputField.setFont(new Font("Arial", Font.PLAIN, 14));
        inputField.setLineWrap(true);
        inputField.setWrapStyleWord(true);
        JScrollPane inputScrollPane = new JScrollPane(inputField);
        inputPanel.add(inputScrollPane, BorderLayout.CENTER);

        frame.add(inputPanel, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        buttonPanel.setBorder(new EmptyBorder(10, 10, 10, 10));

        JButton calculateButton = createButton("Calculate", e -> {
            String input = inputField.getText();
            if (input.isEmpty()) {
                showAlert("Please enter a string.", "Error");
            } else {
                String sha1Hash = calculateSHA1(input);
                resultArea.setText(sha1Hash);
            }
        });
        buttonPanel.add(calculateButton);

        JButton copyButton = createButton("Copy", e -> {
            String result = resultArea.getText();
            if (!result.isEmpty()) {
                StringSelection stringSelection = new StringSelection(result);
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                clipboard.setContents(stringSelection, null);
                showAlert("Hash copied to clipboard.", "Success");
            }
        });
        buttonPanel.add(copyButton);

        JButton clearButton = createButton("Clear", e -> {
            inputField.setText("");
            resultArea.setText("");
        });
        buttonPanel.add(clearButton);

        JButton exitButton = createButton("Exit", e -> System.exit(0));
        buttonPanel.add(exitButton);

        JButton howItWorksButton = createButton("How It Works", e -> showHowItWorks());
        buttonPanel.add(howItWorksButton);

        JCheckBox darkModeCheckBox = new JCheckBox("Dark Mode");
        darkModeCheckBox.setFont(new Font("Arial", Font.BOLD, 14));
        darkModeCheckBox.addActionListener(e -> toggleDarkMode(darkModeCheckBox.isSelected()));
        buttonPanel.add(darkModeCheckBox);

        frame.add(buttonPanel, BorderLayout.CENTER);

        JPanel resultPanel = new JPanel();
        resultPanel.setLayout(new BorderLayout(5, 5));
        resultPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        JLabel resultLabel = new JLabel("SHA-1 Hash:");
        resultPanel.add(resultLabel, BorderLayout.NORTH);

        resultArea = new JTextArea(3, 30);
        resultArea.setEditable(false);
        resultArea.setFont(new Font("Arial", Font.PLAIN, 14));
        resultArea.setLineWrap(true);
        resultArea.setWrapStyleWord(true);
        JScrollPane resultScrollPane = new JScrollPane(resultArea);
        resultPanel.add(resultScrollPane, BorderLayout.CENTER);

        frame.add(resultPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    private JButton createButton(String text, java.awt.event.ActionListener actionListener) {
        JButton button = new JButton(text);
        button.setFont(new Font("Arial", Font.BOLD, 14));
        button.addActionListener(actionListener);
        button.setFocusPainted(false);
        button.setFocusable(false);
        return button;
    }

    private String calculateSHA1(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            byte[] messageDigest = md.digest(input.getBytes());

            BigInteger no = new BigInteger(1, messageDigest);
            String hashText = no.toString(16);

            while (hashText.length() < 40) {
                hashText = "0" + hashText;
            }

            return hashText;
        } catch (NoSuchAlgorithmException ex) {
            return "Error: SHA-1 algorithm not available.";
        }
    }

    private void showHowItWorks() {
        JFrame howItWorksFrame = new JFrame("How It Works");
        howItWorksFrame.setSize(500, 400);
        howItWorksFrame.setLayout(new BorderLayout(10, 10));
        howItWorksFrame.setLocationRelativeTo(null); // Center the frame

        JPanel howItWorksPanel = new JPanel();
        howItWorksPanel.setLayout(new BorderLayout(5, 5));
        howItWorksPanel.setBorder(new EmptyBorder(10, 10, 10, 10));

        JTextArea howItWorksArea = new JTextArea();
        howItWorksArea.setEditable(false);
        howItWorksArea.setFont(new Font("Arial", Font.PLAIN, 14));
        howItWorksArea.setLineWrap(true);
        howItWorksArea.setWrapStyleWord(true);
        howItWorksArea.setText("SHA-1 (Secure Hash Algorithm 1) is a cryptographic hash function designed by the National Security Agency (NSA) and published by the National Institute of Standards and Technology (NIST). It produces a 160-bit hash value, typically rendered as a 40-digit hexadecimal number.\n\nThe SHA-1 algorithm takes an input string and processes it to generate a unique fixed-length hash, making it useful for data integrity verification, digital signatures, and cryptographic applications.\n\nUsage:\n1. Enter the text in the input field.\n2. Click 'Calculate' to generate the SHA-1 hash.\n3. Use 'Copy' to copy the hash to the clipboard.\n4. Use 'Clear' to clear the input and result fields.\n5. Use 'Exit' to close the application.");

        JScrollPane howItWorksScrollPane = new JScrollPane(howItWorksArea);
        howItWorksPanel.add(howItWorksScrollPane, BorderLayout.CENTER);

        JButton closeButton = createButton("Close", e -> howItWorksFrame.dispose());

        JPanel closePanel = new JPanel();
        closePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        closePanel.add(closeButton);

        howItWorksPanel.add(closePanel, BorderLayout.SOUTH);

        if (isDarkMode) {
            toggleComponentDarkMode(howItWorksPanel, true);
        }

        howItWorksFrame.add(howItWorksPanel);
        howItWorksFrame.setVisible(true);
    }

    private void showAlert(String message, String title) {
        JOptionPane.showMessageDialog(frame, message, title, JOptionPane.INFORMATION_MESSAGE);
    }

    private void toggleDarkMode(boolean darkMode) {
        isDarkMode = darkMode;
        toggleComponentDarkMode(frame.getContentPane(), darkMode);
    }

    private void toggleComponentDarkMode(Container container, boolean darkMode) {
        Color bgColor = darkMode ? Color.DARK_GRAY : Color.WHITE;
        Color fgColor = darkMode ? Color.WHITE : Color.BLACK;

        container.setBackground(bgColor);
        for (Component component : container.getComponents()) {
            if (component instanceof JPanel) {
                toggleComponentDarkMode((Container) component, darkMode);
            } else {
                component.setBackground(bgColor);
                component.setForeground(fgColor);
                if (component instanceof JTextArea) {
                    ((JTextArea) component).setCaretColor(fgColor);
                }
                if (component instanceof JLabel) {
                    ((JLabel) component).setForeground(fgColor);
                }
                if (component instanceof JScrollPane) {
                    ((JScrollPane) component).getViewport().setBackground(bgColor);
                }
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SHA1HashGUI::new);
    }
}
