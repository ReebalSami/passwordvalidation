package org.example;
public class PasswordValidation {
    public static void main(String[] args) {

    }

    public static boolean isPasswordLongEnough(String password){
        return password.length() >= 8;
    }

    public static boolean doesPasswordContainDigits(String password){
        //Your code here!
        return true;
    }

    public static boolean isUppercaseAndLowercase(String password){
        boolean noUppercaseFound = true;
        boolean noLowercaseFound = true;
        int i = 0;

        if(password == null) return false;
        if(password.length()<2) return false;

        while((noLowercaseFound||noUppercaseFound)&& i < password.length()){
            if(Character.isLowerCase(password.charAt(i))) noLowercaseFound = false;
            if(Character.isUpperCase(password.charAt(i))) noUppercaseFound = false;
            i++;
        }

        return !(noLowercaseFound || noUppercaseFound);
    }

    public static boolean isNotCommonPassword(String password){
        //Your code here!
        return true;
    }


}