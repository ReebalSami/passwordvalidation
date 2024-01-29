package org.example;

import static org.junit.jupiter.api.Assertions.*;

class passwordvalidationTest {

    @org.junit.jupiter.api.Test
    void isPasswordLongEnoughTrue() {
        //given
        String password = "12345678";

        //when
        boolean actual = passwordvalidation.isPasswordLongEnough(password);
        //then
        assertTrue(actual);
    }
}