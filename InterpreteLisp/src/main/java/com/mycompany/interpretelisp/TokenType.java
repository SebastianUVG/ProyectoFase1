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
 * Enumeración que define los tipos de token en el intérprete de Lisp.
 */

public enum TokenType {
    /**
     * Representa un símbolo en el código Lisp, como una función o una variable.
     */
    SYMBOL,
    /**
     * Representa un número en el código Lisp.
     */
    NUMBER,
    /**
     * Representa un paréntesis de apertura '(' en el código Lisp.
     */
    OPEN_PAREN,
    /**
     * Representa un paréntesis de cierre ')' en el código Lisp.
     */
    CLOSE_PAREN,
    /**
     * Representa el final del archivo o entrada en el código Lisp.
     */
    EOF
}
