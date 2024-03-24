/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interpretelisp;

/**
 *
 * @author Oscar Escriba
 */
public class FunctionExpression {
    private final ListExpression params;
    private final ListExpression body;

    public FunctionExpression(ListExpression params, ListExpression body) {
        this.params = params;
        this.body = body;
    }

    public ListExpression getParams() {
        return params;
    }

    public ListExpression getBody() {
        return body;
    }
}

