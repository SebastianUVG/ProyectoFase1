/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.interpretelisp;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Oscar Escriba
 */
public class LexerTest {
    
    public LexerTest() {
    }

    /**
     * Test of nextToken method, of class Lexer.
     */
    @Test
    public void testNextToken() {
        System.out.println("nextToken");
        Lexer instance = null;
        Token expResult = null;
        Token result = instance.nextToken();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
