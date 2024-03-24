/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */
package com.mycompany.interpretelisp;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Oscar Escriba
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({com.mycompany.interpretelisp.LexerTest.class, com.mycompany.interpretelisp.EnvironmentTest.class, com.mycompany.interpretelisp.TokenTest.class, com.mycompany.interpretelisp.ExpressionTest.class, com.mycompany.interpretelisp.FunctionExpressionTest.class, com.mycompany.interpretelisp.ListExpressionTest.class, com.mycompany.interpretelisp.InterpreteLispTest.class, com.mycompany.interpretelisp.NumberExpressionTest.class, com.mycompany.interpretelisp.TokenTypeTest.class, com.mycompany.interpretelisp.ParserTest.class, com.mycompany.interpretelisp.SymbolExpressionTest.class})
public class InterpretelispSuite {
    
}
