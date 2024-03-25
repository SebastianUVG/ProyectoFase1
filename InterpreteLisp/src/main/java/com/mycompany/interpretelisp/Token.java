/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interpretelisp;

/**
 *
 * @author Oscar Escriba
 */
/* 
Este es el codigo que identifica simbolo por simbolo que tipo es 
y va separando uno por uno. 
*/
/**
 * Clase que representa un token en el intérprete de Lisp.
 */
public class Token {
    private final TokenType type;
    private final String value;
    
    /**
     * Construye un nuevo token con el tipo y valor especificados.
     *
     * @param type  El tipo del token.
     * @param value El valor del token.
     */
    public Token(TokenType type, String value) {
        this.type = type;
        this.value = value;
    }
    
     /**
     * Obtiene el tipo del token.
     *
     * @return El tipo del token.
     */
    public TokenType getType() {
        return type;
    }
    
    /**
     * Obtiene el valor del token.
     *
     * @return El valor del token.
     */
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Token{" +
                "type=" + type +
                ", value='" + value + '\'' +
                '}';
    }
}