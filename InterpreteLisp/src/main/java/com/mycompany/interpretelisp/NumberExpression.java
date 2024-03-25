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
 * Representa una expresión numérica en el intérprete de Lisp.
 */
public class NumberExpression implements Expression {
    private final int value;
    
    /**
     * Construye una nueva expresión numérica con el valor especificado.
     *
     * @param value El valor numérico.
     */
    public NumberExpression(int value) {
        this.value = value;
    }
    
     /**
     * Obtiene el valor numérico de la expresión.
     *
     * @return El valor numérico.
     */
    public int getValue() {
        return value;
    }

    /**
     * Devuelve una representación en forma de cadena del valor numérico.
     *
     * @return La representación en forma de cadena del valor numérico.
     */
    @Override
    public String toString() {
        return Integer.toString(value);
    }
}
