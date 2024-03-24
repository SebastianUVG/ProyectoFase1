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
public class ParserTest {
    
    public ParserTest() {
    }

    /**
     * Test of parse method, of class Parser.
     */
    @Test
    public void testParse() {
        System.out.println("parse");
        Parser instance = null;
        Expression expResult = null;
        Expression result = instance.parse();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
