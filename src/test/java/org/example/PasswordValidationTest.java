package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidationTest {

    //Testing the isPasswordLongEnough-Function.
    @Test
    void isPasswordLongEnough_when12345678_thenTrue() {
        //given
        String password = "12345678";

        //when
        boolean actual = PasswordValidation.isPasswordLongEnough(password);
        //then
        assertTrue(actual);
    }

    @Test
    void isPasswordLongEnough_when1234567_thenFalse() {
        //given
        String password = "1234567";

        //when
        boolean actual = PasswordValidation.isPasswordLongEnough(password);
        //then
        assertFalse(actual);
    }

    @Test
    void isPasswordLongEnough_whenNULL_thenFalse(){
        //given
        String password = null;

        //when
        boolean actual = PasswordValidation.isPasswordLongEnough(password);

        //then
        assertFalse(actual);
    }

    // Testing the doesPasswordContainDigits-Function
    @Test
    void doesPasswordContainDigits_when1W_thenTrue(){
        //given
        String password = "1W";

        //when
        boolean actual = PasswordValidation.doesPasswordContainDigits(password);

        //then
        assertTrue(actual);
    }

    @Test
    void doesPasswordContainDigits_whenKartoffel_thenFalse(){
        //given
        String password = "Kartoffel";

        //when
        boolean actual = PasswordValidation.doesPasswordContainDigits(password);

        //then
        assertFalse(actual);
    }

    @Test
    void doesPasswordContainDigits_wheneins_thenFalse(){
        //given
        String password = "eins";

        //when
        boolean actual = PasswordValidation.doesPasswordContainDigits(password);

        //then
        assertFalse(actual);
    }


    @Test
    void doesPasswordContainDigits_whenKartoffelJaeger1984_thenTrue(){
        //given
        String password = "KartoffelJaeger1984";

        //when
        boolean actual = PasswordValidation.doesPasswordContainDigits(password);

        //then
        assertTrue(actual);
    }


    @Test
    void doesPasswordContainDigits_when1984_thenTrue(){
        //given
        String password = "1984";

        //when
        boolean actual = PasswordValidation.doesPasswordContainDigits(password);

        //then
        assertTrue(actual);
    }

    @Test
    void doesPasswordContainDigits_whenxXxJaeger17xXx_thenTrue(){
        //given
        String password = "xXxJaeger17xXx";

        //when
        boolean actual = PasswordValidation.doesPasswordContainDigits(password);

        //then
        assertTrue(actual);
    }




    // Testing the isUppercaseAndLowercase-Function.
    @Test //when the password doesnt include lowercase:
    void isUppercaseAndLowercase_whenA11_thenFalse(){
        //given
        String password = "A11";

        //when
        boolean actual = PasswordValidation.isUppercaseAndLowercase(password);

        //then
        assertFalse(actual);
    }


    @Test //when the password doesnt include uppercase:
    void isUppercaseAndLowercase_when11a_thenFalse(){
        //given
        String password = "11a";

        //when
        boolean actual = PasswordValidation.isUppercaseAndLowercase(password);

        //then
        assertFalse(actual);
    }

    @Test //when the password doesnt include uppercase:
    void isUppercaseAndLowercase_when11a58_thenFalse() {
        //given
        String password = "11a58";

        //when
        boolean actual = PasswordValidation.isUppercaseAndLowercase(password);

        //then
        assertFalse(actual);
    }
    @Test //when the password doesnt include uppercase:
    void isUppercaseAndLowercase_whenNULL_thenFalse() {
        //given
        String password = null;

        //when
        boolean actual = PasswordValidation.isUppercaseAndLowercase(password);

        //then
        assertFalse(actual);
    }

    @Test //when the password doesnt include lowercase:
    void isUppercaseAndLowercase_when11A58_thenFalse() {
        //given
        String password = "11A58";

        //when
        boolean actual = PasswordValidation.isUppercaseAndLowercase(password);

        //then
        assertFalse(actual);
    }


    @Test //when the password includes lowercase and uppercase:
    void isUppercaseAndLowercase_whenA11b58_thenTrue() {
        //given
        String password = "A11b58";

        //when
        boolean actual = PasswordValidation.isUppercaseAndLowercase(password);

        //then
        assertTrue(actual);
    }

    @Test //when the password includes lowercase and uppercase:
    void isUppercaseAndLowercase_when3bRATkarTTOFFEelnnn23_thenTrue() {
        //given
        String password = "3bRATkarTTOFFEelnnn23";

        //when
        boolean actual = PasswordValidation.isUppercaseAndLowercase(password);

        //then
        assertTrue(actual);
    }

    @Test//
    void isNotCommonPassword_whenCommonPassword_thenFalse(){
        //Given
        String commonPassword="Password1";
        //When
        boolean actual=PasswordValidation.isNotCommonPassword(commonPassword);
        //Then
        assertFalse(actual);
    }
    @Test
     void isNotCommonPassword_whenUnCommonPassword_thenTrue(){
        //Given
        String uncommonPassword="MyPass1234";
        //When
        boolean actual=PasswordValidation.isNotCommonPassword(uncommonPassword);
        //Then
        assertTrue(actual);
    }

    @Test //testing special charactors:
    void ifPassowrdContainSpecialCharactors_whenAb1$1b58_thenTrue() {
        //given
        String password = "Ab1$1b58";


        //when
        boolean actual = PasswordValidation.containsSpecialCharacter(password);

        //then
        assertTrue(actual);

    }

    @Test //testing special charactors:
    void ifPassowrdDoesNotContainSpecialCharactors_whenAb11b58_thenFalse() {
        //given
        String password = "Ab11b58";


        //when
        boolean actual = PasswordValidation.containsSpecialCharacter(password);

        //then
        assertFalse(actual);

    }
}