/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interpretelisp;

/**
 *
 * @author Oscar Escriba
 */
import static java.lang.System.console;
import java.util.*;
import java.util.function.BiFunction;
public class Environment {
    private final Map<String, Object> variables;
    private final Map<String, FunctionExpression> functions;

    public Environment() {
        this.variables = new HashMap<>();
        this.functions = new HashMap<>();
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
        if (expression instanceof ListExpression) {
            ListExpression innerListExpression = (ListExpression) expression;
            result = eval(innerListExpression);
        } else if (expression instanceof SymbolExpression) {
            String symbol = ((SymbolExpression) expression).getName();
            if (symbol.equals("quote") || symbol.equals("'")) {
                result = expressions.get(1);
            } else if (symbol.equals("setq")) {
                String variableName = ((SymbolExpression) expressions.get(1)).getName();
                Object value = eval((ListExpression) expressions.get(2));
                setVariable(variableName, value);
                result = value;
            } else if (symbol.equals("defun")) {
                String functionName = ((SymbolExpression) expressions.get(1)).getName();
                ListExpression params = (ListExpression) expressions.get(2);
                ListExpression body = (ListExpression) expressions.get(3);
                functions.put(functionName, new FunctionExpression(params, body));
                result = functionName;
            } else if (functions.containsKey(symbol)) {
                FunctionExpression function = functions.get(symbol);
                List<Expression> params = function.getParams().getExpressions();
                List<Expression> body = function.getBody().getExpressions();
                Environment localEnv = new Environment();
                for (int i = 0; i < params.size(); i++) {
                    localEnv.setVariable(((SymbolExpression) params.get(i)).getName(),
                            eval((ListExpression) expressions.get(i + 1)));
                }
                result = null;
                for (Expression exp : body) {
                    result = eval((ListExpression) exp);
                }
            }
        } else if (expression instanceof NumberExpression) {
            result = ((NumberExpression) expression).getValue();
        } else if (expression instanceof ListExpression) {
                 List<Expression> innerExpressions = ((ListExpression) expression).getExpressions();
            String operator = ((SymbolExpression) innerExpressions.get(0)).getName();
            if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) {
                List<Integer> operands = new ArrayList<>();
                for (int i = 1; i < innerExpressions.size(); i++) {
                    Expression innerExpression = innerExpressions.get(i);
                    if (innerExpression instanceof NumberExpression) {
                        operands.add(((NumberExpression) innerExpression).getValue());
                    } else if (innerExpression instanceof ListExpression) {
                        operands.add((Integer) eval((ListExpression) innerExpression));
                    }
                }
                result = evaluateArithmeticExpression(operator, operands);
            }
        }
    }
    return result;
}
    private int evaluateArithmeticExpression(String operator, List<Integer> operands) {
    double result = operands.get(0);
    for (int i = 1; i < operands.size(); i++) {
        if (operator.equals("+")) {
            result += operands.get(i);
        } else if (operator.equals("-")) {
            result -= operands.get(i);
        } else if (operator.equals("*")) {
            result *= operands.get(i);
        } else if (operator.equals("/")) {
            if (operands.get(i) != 0) {
                result /= operands.get(i);
            } else {
                throw new ArithmeticException("Division by zero");
            }
        }
    }
    return (int) result;
}

}
    
    