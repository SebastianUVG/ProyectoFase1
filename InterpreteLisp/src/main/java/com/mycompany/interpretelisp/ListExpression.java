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

/**
 * Representa una lista de expresiones en el intérprete de Lisp.
 */
public class ListExpression implements Expression{
    private final List<Expression> expressions;
    
    /**
     * Construye una nueva lista de expresiones con la lista especificada de expresiones.
     *
     * @param expressions La lista de expresiones.
     */
    public ListExpression(List<Expression> expressions) {
        this.expressions = expressions;
    }
    
    /**
     * Obtiene la lista de expresiones.
     *
     * @return La lista de expresiones.
     */
    public List<Expression> getExpressions() {
        return expressions;
    }
    
     /**
     * Devuelve una representación en forma de cadena de la lista de expresiones.
     *
     * @return La representación en forma de cadena de la lista de expresiones.
     */
    @Override
    public String toString() {
        if (expressions == null) {
        return "null"; // O cualquier otro valor que desees para representar una lista nula
    }
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
