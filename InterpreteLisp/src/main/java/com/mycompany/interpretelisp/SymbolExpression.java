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
 * Clase que representa una expresión de símbolo en el intérprete de Lisp.
 */
public class SymbolExpression implements Expression {
    private final String name;
    
     /**
     * Construye una nueva expresión de símbolo con el nombre especificado.
     *
     * @param name El nombre del símbolo.
     */
    public SymbolExpression(String name) {
        this.name = name;
    }
    
     /**
     * Obtiene el nombre del símbolo.
     *
     * @return El nombre del símbolo.
     */
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
