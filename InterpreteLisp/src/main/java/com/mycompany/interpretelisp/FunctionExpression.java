/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interpretelisp;

/**
 *
 * @author Oscar Escriba
 */


/**
 * Represents a function definition in the Lisp interpreter.
 * This class holds the parameters and body of a Lisp function.
 */

public class FunctionExpression {
    private final ListExpression params;
    private final ListExpression body;

    
     /**
     * Constructs a new FunctionExpression with the specified parameters and body.
     *
     * @param params The parameters of the function.
     * @param body   The body of the function.
     */
    public FunctionExpression(ListExpression params, ListExpression body) {
        this.params = params;
        this.body = body;
    }
    
    /**
     * Gets the parameters of the function.
     *
     * @return The parameters of the function.
     */
    public ListExpression getParams() {
        return params;
    }
    /**
     * Gets the body of the function.
     *
     * @return The body of the function.
     */
    public ListExpression getBody() {
        return body;
    }
}

