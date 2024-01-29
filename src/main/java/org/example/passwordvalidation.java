package org.example;
public class passwordvalidation {
    public static void main(String[] args) {
        isPasswordLongEnough("12345678");
    }

    public static boolean isPasswordLongEnough(String password){
        return password.length() >= 8;
    }

    // boolean doesPasswordContainDigits(String password)

    //boolean isUppercaseAndLowercase(String password)

    //boolean isNotCommonPassword(String password)

}