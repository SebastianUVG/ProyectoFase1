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
public class InterpreteLispTest {
    
    public InterpreteLispTest() {
    }

    /**
     * Test of evaluate method, of class InterpreteLisp.
     */
    @Test
    public void testEvaluate() {
        System.out.println("evaluate");
        String input = "";
        InterpreteLisp instance = null;
        Object expResult = null;
        Object result = instance.evaluate(input);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class InterpreteLisp.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        InterpreteLisp.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
