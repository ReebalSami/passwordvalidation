package org.example;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PasswordValidation {
    public static void main(String[] args) {
        String password = "12f!ffffffT3";
        System.out.println(isPasswordLongEnough(password));
        System.out.println(doesPasswordContainDigits(password));
        System.out.println(isUppercaseAndLowercase(password));
        System.out.println(isNotCommonPassword(password));
        System.out.println(containsSpecialCharacter(password));

        String generatedPassword = generateSecurePassword();
        System.out.println("Generated Password: " + generatedPassword);


    }

    public static boolean isPasswordLongEnough(String password) {
        if (password == null) {
            return false;
        }
        return password.length() >= 8;
    }

    public static boolean doesPasswordContainDigits(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }


    public static boolean isUppercaseAndLowercase(String password){
        boolean uppercaseFound = false;
        boolean lowercaseFound = false;
        int i = 0;

        if (password == null) return false;
        if (password.length() < 2) return false;

        while((!lowercaseFound || !uppercaseFound) && i < password.length()){
            if(Character.isLowerCase(password.charAt(i))) lowercaseFound = true;
            if(Character.isUpperCase(password.charAt(i))) uppercaseFound = true;
            i++;
        }

        return lowercaseFound && uppercaseFound;
    }

    public static boolean isNotCommonPassword(String password) {
        String[] commonPasswords = {"Password1", "Aa345678", "123456789"};
        for (String commonPassword : commonPasswords) {
            if (password.equals(commonPassword)) {
                return false;
            }
        }
        return true;
    }

    public static boolean containsSpecialCharacter(String password) {
        for (char c : password.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                return true;
            }
        }
        return false;
    }

    public static String generateSecurePassword() {
        String uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String specialCharacters = "!@#$%^&*()-_+=<>?";

        String allCharacters = uppercaseLetters + lowercaseLetters + digits + specialCharacters;

        SecureRandom random = new SecureRandom();
        List<Character> passwordCharacters = new ArrayList<>();

        // Ensure the password has at least one character from each character set
        passwordCharacters.add(uppercaseLetters.charAt(random.nextInt(uppercaseLetters.length())));
        passwordCharacters.add(lowercaseLetters.charAt(random.nextInt(lowercaseLetters.length())));
        passwordCharacters.add(digits.charAt(random.nextInt(digits.length())));
        passwordCharacters.add(specialCharacters.charAt(random.nextInt(specialCharacters.length())));

        // Generate the rest of the password randomly
        for (int i = 4; i < 8; i++) {
            passwordCharacters.add(allCharacters.charAt(random.nextInt(allCharacters.length())));
        }

        // Shuffle the characters to make the order totally random
        Collections.shuffle(passwordCharacters);

        // Convert the List<Character> to a String
        StringBuilder password = new StringBuilder();
        for (char c : passwordCharacters) {
            password.append(c);
        }

        return password.toString();
        //hier endet die Methode :)

    }
}