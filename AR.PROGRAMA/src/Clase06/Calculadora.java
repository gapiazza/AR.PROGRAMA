package Clase06;

public class Calculadora {

    private static Double num1;
    private static Double num2;
    private static Double resultado;
    private static char op;
    private static String opName = "";

    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println("Debes ingresar 2 números y luego el símbolo de la operación (s = suma, r = resta, m = multiplicación y d = división).");
            return;
        }
        
        num1 = Double.parseDouble(args[0]);
        num2 = Double.parseDouble(args[1]);
        op = args[2].charAt(0);

        switch(op) {
            case 's':
                resultado = sum(num1, num2);
                opName = "sumar";
                break;

            case 'r':
                resultado = res(num1, num2);
                opName = "restar";
                break;

            case 'm':
                resultado = mul(num1, num2);
                opName = "multiplicar";
                break;

            case 'd':
                if (num2 == 0) {
                    System.out.println("No es posible dividir entre cero.");
                    return;
                }
                resultado = div(num1, num2);
                opName = "dividir";
                break;

            default:
                System.out.println("No se ingresó una operación válida.");
                System.out.println("Debes ingresar s = suma, r = resta, m = multiplicación y d = división.");
        }

        System.out.println("El resultado de " + opName + " " + num1 + " con " + num2 + " es: " + resultado);
    }


    // SUMA
    public static double sum(Double num1, Double num2) {

        // Operación
        return (num1 + num2);
    }

    // RESTA
    public static double res(Double num1, Double num2) {

        // Operación
        return (num1 - num2);
    }

    // MULTIPLICACIÓN
    public static double mul(Double num1, Double num2) {

        // Operación
        return (num1 * num2);
    }

    // DIVISIÓN
    public static double div(Double num1, Double num2) {
        // Verificar si num2 es cero
        if (num2 == 0) {
            return 0;
        }

        // Operación
        return (num1 / num2);
    }
}
