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

public class Parser {
    private final List<Token> tokens;
    private int position;

    public Parser(List<Token> tokens) {
        this.tokens = tokens;
        this.position = 0;
    }

    public Expression parse() {
    if (tokens.isEmpty()) {
        return null;
    }

    Token token = tokens.get(position);
    if (token.getType() == TokenType.NUMBER) {
        position++;
        return new NumberExpression(Integer.parseInt(token.getValue()));
    } else if (token.getType() == TokenType.SYMBOL) {
        position++;
        return new SymbolExpression(token.getValue());
    } else if (token.getType() == TokenType.OPEN_PAREN) {
        position++;
        List<Expression> expressions = new ArrayList<>();
        while (position < tokens.size() && tokens.get(position).getType() != TokenType.CLOSE_PAREN) {
            Expression expression = parse();
            if (expression != null) {
                expressions.add(expression);
            }
        }
        position++; // Avanzar más allá del ")"
        return new ListExpression(expressions);
    }

    return null; // Token no reconocido
}
}
