package calculator;

import java.util.Stack;


/**
*@param numero1 (esta antes del operador)
* @param numero2 (esta despues del operador)
 */




public class calculadora {
    // Método principal para evaluar una expresión matemática
    public static double evaluarExpresion(String expresion) throws ArithmeticException {
        // Verificar si la expresión es nula o vacía
        if (expresion == null || expresion.isEmpty()) {
            throw new IllegalArgumentException("La expresión no puede ser nula o vacía");
        }

        try {
            Stack<Double> numeros = new Stack<>();
            Stack<String> operadores = new Stack<>();

            double numero = 0.0;

            // Iterar sobre cada carácter de la expresión
            for (int i = 0; i < expresion.length(); i++) {
                char caracter = expresion.charAt(i);

                // Ignorar los espacios en blanco
                if (caracter == ' ') {
                    continue;
                }

                // Si el carácter es un dígito o un punto decimal, construir el número
                if (Character.isDigit(caracter) || caracter == '.') {
                    numero = numero * 10 + Character.getNumericValue(caracter);
                } else if ("+-x/√".indexOf(caracter) != -1) { // Verificar si es un operador válido
                    // Agregar el número a la pila
                    numeros.push(numero);
                    numero = 0.0;

                    // Procesar operadores con mayor precedencia
                    while (!operadores.isEmpty() && tienePrecedencia(String.valueOf(caracter), operadores.peek())) {
                        realizarOperacion(numeros, operadores);
                    }

                    // Agregar el operador actual a la pila de operadores
                    operadores.push(String.valueOf(caracter));

                } else if (caracter == '(') {
                    operadores.push(String.valueOf(caracter));
                } else if (caracter == ')') {
                    // Agregar el número a la pila
                    numeros.push(numero);
                    numero = 0.0;

                    // Realizar operaciones dentro del paréntesis
                    while (!operadores.isEmpty() && !operadores.peek().equals("(")) {
                        realizarOperacion(numeros, operadores);
                    }
                    operadores.pop(); // Pop del '('
                }
            }

            // Agregar el último número a la pila
            numeros.push(numero);

            // Realizar operaciones restantes
            while (!operadores.isEmpty()) {
                realizarOperacion(numeros, operadores);
            }

            // El resultado final estará en la cima de la pila de números
            return numeros.pop();
        } catch (Exception e) {
            throw new ArithmeticException("Error al evaluar la expresión: " + e.getMessage());
        }
    }

    // Método para verificar la precedencia de los operadores
    private static boolean tienePrecedencia(String operador1, String operador2) {
        if (operador2.equals("(") || operador2.equals(")")) {
            return false;
        }
        if (("x/".contains(operador1) && "+-".contains(operador2))) {
            return false;
        }
        return true;
    }

    // Método para realizar operaciones aritméticas
    private static void realizarOperacion(Stack<Double> numeros, Stack<String> operadores) {
        String op = operadores.pop();
        if (op.equals("√")) {
            double numero = numeros.pop();
            if (numero >= 0) {
                numeros.push(Math.sqrt(numero));
            } else {
                throw new ArithmeticException("No se puede calcular la raíz cuadrada de un número negativo");
            }
        } else {
            double numero2 = numeros.pop();
            double numero1 = numeros.pop();
            switch (op) {
                case "+":
                    numeros.push(numero1 + numero2);
                    break;
                case "-":
                    numeros.push(numero1 - numero2);
                    break;
                case "x":
                    numeros.push(numero1 * numero2);
                    break;
                case "/":
                    if (numero2 != 0) {
                        numeros.push(numero1 / numero2);
                    } else {
                        throw new ArithmeticException("No se puede dividir por cero");
                    }
                    break;
            }
        }
    }
    

}


