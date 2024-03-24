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
public class EnvironmentTest {
    
    public EnvironmentTest() {
    }

    /**
     * Test of getVariable method, of class Environment.
     */
    @Test
    public void testGetVariable() {
        System.out.println("getVariable");
        String name = "";
        Environment instance = new Environment();
        Object expResult = null;
        Object result = instance.getVariable(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVariable method, of class Environment.
     */
    @Test
    public void testSetVariable() {
        System.out.println("setVariable");
        String name = "";
        Object value = null;
        Environment instance = new Environment();
        instance.setVariable(name, value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eval method, of class Environment.
     */
    @Test
    public void testEval() {
        System.out.println("eval");
        ListExpression listExpression = null;
        Environment instance = new Environment();
        Object expResult = null;
        Object result = instance.eval(listExpression);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
