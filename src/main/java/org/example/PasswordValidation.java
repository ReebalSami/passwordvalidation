package org.example;
public class PasswordValidation {
    public static void main(String[] args) {
        String password = "12fffffffT3";
        System.out.println(isPasswordLongEnough(password));
        System.out.println(doesPasswordContainDigits(password));
        System.out.println(isUppercaseAndLowercase(password));
        //System.out.println(isNotCommonPassword(password));


    }

    public static boolean isPasswordLongEnough(String password){
        if (password == null) {
            return false;
        }
        return password.length() >= 8;
    }

    public static boolean doesPasswordContainDigits(String password){
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
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
    String [] commonPasswords={"Password1","Aa345678","123456789"};
    for (String commonPassword: commonPasswords){
        if (password.equals(commonPassword)){
            return false;
        }
    }
        return true;
    }


}