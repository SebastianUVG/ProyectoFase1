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

/**
 * La clase Lexer se encarga de tokenizar cadenas de entrada en el intérprete de Lisp.
 * Convierte una cadena de caracteres en una secuencia de tokens.
 */
public class Lexer {
    private final String input;
    private int position;
    /**
     * Construye un nuevo Lexer con la cadena de entrada especificada.
     *
     * @param input La cadena de entrada a tokenizar.
     */
    public Lexer(String input) {
        this.input = input;
        this.position = 0;
    }
    
     /**
     * Devuelve el próximo token de la cadena de entrada.
     *
     * @return El próximo token.
     */
    public Token nextToken() {
    // Saltar espacios en blanco
    while (position < input.length() && Character.isWhitespace(input.charAt(position))) {
        position++;
    }
    
    if (position >= input.length()) {
        return new Token(TokenType.EOF, "");
    }

    char currentChar = input.charAt(position);
    position++;

    if (currentChar == '(') {
        return new Token(TokenType.OPEN_PAREN, "(");
    } else if (currentChar == ')') {
        return new Token(TokenType.CLOSE_PAREN, ")");
    } else if (Character.isDigit(currentChar)) {
        StringBuilder sb = new StringBuilder();
        sb.append(currentChar);
        while (position < input.length() && Character.isDigit(input.charAt(position))) {
            sb.append(input.charAt(position));
            position++;
        }
        return new Token(TokenType.NUMBER, sb.toString());
    } else if (Character.isLetter(currentChar)) {
        StringBuilder sb = new StringBuilder();
        sb.append(currentChar);
        while (position < input.length() && (Character.isLetter(input.charAt(position)) || Character.isDigit(input.charAt(position)))) {
            sb.append(input.charAt(position));
            position++;
        }
        return new Token(TokenType.SYMBOL, sb.toString());
    } else {
        return nextToken(); // Skip whitespace and other characters
    }
}
}
