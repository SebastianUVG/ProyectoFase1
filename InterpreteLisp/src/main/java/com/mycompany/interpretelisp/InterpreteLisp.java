/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.interpretelisp;

/**
 *
 * @author Oscar Escriba
 */
import java.util.*;

public class InterpreteLisp {
    private final Environment environment;

    public InterpreteLisp(Environment environment) {
        this.environment = environment;
    }

    public Object evaluate(String input) {
    Lexer lexer = new Lexer(input);
        List<Token> tokens = new ArrayList<>();
        Token token = lexer.nextToken();
        while (token.getType() != TokenType.EOF) {
            tokens.add(token);
            token = lexer.nextToken();
        }

        Parser parser = new Parser(tokens);
        Expression expression = parser.parse();
        if (expression == null) {
            return null;
        }

        return environment.eval((ListExpression) expression);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Environment environment = new Environment();
        InterpreteLisp interpreter = new InterpreteLisp(environment);
        
        //definir la funcion sumar
        interpreter.evaluate("(define (sumar a b) (+ a b))");
        while (true) {
            System.out.print("Ingrese la función de Lisp (o escriba 'exit' para salir): ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            Object result = interpreter.evaluate(input);
            System.out.println("Resultado: " + result);
        }

        scanner.close();
    }
}
