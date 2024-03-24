/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.interpretelisp;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Oscar Escriba
 */
public class ListExpressionTest {
    
    public ListExpressionTest() {
    }

    /**
     * Test of getExpressions method, of class ListExpression.
     */
    @Test
    public void testGetExpressions() {
        System.out.println("getExpressions");
        ListExpression instance = null;
        List<Expression> expResult = null;
        List<Expression> result = instance.getExpressions();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ListExpression.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ListExpression instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
