package org.example;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidationTest {

    @org.junit.jupiter.api.Test
    void isPasswordLongEnoughTrue() {
        //given
        String password = "12345678";

        //when
        boolean actual = PasswordValidation.isPasswordLongEnough(password);
        //then
        assertTrue(actual);
    }
}