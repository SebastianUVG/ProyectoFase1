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
public class TokenTypeTest {
    
    public TokenTypeTest() {
    }

    /**
     * Test of values method, of class TokenType.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        TokenType[] expResult = null;
        TokenType[] result = TokenType.values();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class TokenType.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String string = "";
        TokenType expResult = null;
        TokenType result = TokenType.valueOf(string);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
