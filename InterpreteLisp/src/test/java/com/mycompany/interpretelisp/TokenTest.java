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
public class TokenTest {
    
    public TokenTest() {
    }

    /**
     * Test of getType method, of class Token.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        Token instance = null;
        TokenType expResult = null;
        TokenType result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValue method, of class Token.
     */
    @Test
    public void testGetValue() {
        System.out.println("getValue");
        Token instance = null;
        String expResult = "";
        String result = instance.getValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Token.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Token instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
