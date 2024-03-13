/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interpretelisp;

/**
 *
 * @author Oscar Escriba
 */
import java.util.*;
public class Environment {
    private final Map<String, Object> variables;

    public Environment() {
        this.variables = new HashMap<>();
    }

    public Object getVariable(String name) {
        return variables.get(name);
    }

    public void setVariable(String name, Object value) {
        variables.put(name, value);
    }
    public Object eval(ListExpression listExpression) {
    List<Expression> expressions = listExpression.getExpressions();
    Object result = null;
    for (Expression expression : expressions) {
        if (expression instanceof NumberExpression) {
            // Manejar expresión numérica
            NumberExpression numberExpression = (NumberExpression) expression;
            int number = numberExpression.getValue();
            // Hacer algo con el número, como sumarlo, restarlo, etc.
            result = number; // Por ejemplo, aquí simplemente se asigna el número a result
        } else if (expression instanceof SymbolExpression) {
            // Manejar expresión de símbolo
            SymbolExpression symbolExpression = (SymbolExpression) expression;
            String symbol = symbolExpression.getName();
            // Hacer algo con el símbolo, como buscar su valor en el entorno
            result = symbol; // Por ejemplo, aquí simplemente se asigna el símbolo a result
        } else if (expression instanceof ListExpression) {
            // Manejar expresión de lista
            ListExpression innerListExpression = (ListExpression) expression;
            // Llamar recursivamente a eval para evaluar la lista interna
            result = eval(innerListExpression);
        } else {
            // Expresión no reconocida
            System.out.println("Expresión no reconocida: " + expression);
        }
    }
    return result; // Retornar el resultado final de la evaluación de la lista de expresiones
}
}
