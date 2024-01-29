package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidationTest {

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

    @Test
    void isUppercaseAndLowercase_whenA11_thenFalse(){
        //given
        String password = "A11";

        //when
        boolean actual = PasswordValidation.isUppercaseAndLowercase(password);

        //then
    }



















}