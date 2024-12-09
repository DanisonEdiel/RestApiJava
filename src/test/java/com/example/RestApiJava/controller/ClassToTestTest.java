package com.example.RestApiJava.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassToTestTest {

    @Test
    void ensure_method_work_fine() {
        ClassToTest c = new ClassToTest();
        assertEquals(c.testSum(1,2),3);
    }
}