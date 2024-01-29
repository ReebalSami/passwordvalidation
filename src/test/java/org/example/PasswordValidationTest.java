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
}