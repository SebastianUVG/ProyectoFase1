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
public class FunctionExpressionTest {
    
    public FunctionExpressionTest() {
    }

    /**
     * Test of getParams method, of class FunctionExpression.
     */
    @Test
    public void testGetParams() {
        System.out.println("getParams");
        FunctionExpression instance = null;
        ListExpression expResult = null;
        ListExpression result = instance.getParams();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBody method, of class FunctionExpression.
     */
    @Test
    public void testGetBody() {
        System.out.println("getBody");
        FunctionExpression instance = null;
        ListExpression expResult = null;
        ListExpression result = instance.getBody();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
