/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interpretelisp;

import java.util.List;

/**
 *
 * @author Oscar Escriba
 */
public class ListExpression implements Expression{
    private final List<Expression> expressions;

    public ListExpression(List<Expression> expressions) {
        this.expressions = expressions;
    }

    public List<Expression> getExpressions() {
        return expressions;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        for (Expression expression : expressions) {
            sb.append(expression.toString());
            sb.append(" ");
        }
        sb.append(")");
        return sb.toString();
    }
}
