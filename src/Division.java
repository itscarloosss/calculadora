import java.util.Scanner;

// Clase para la operación de división
class Division {
    public static double dividir(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("No se puede dividir por cero.");
            return Double.NaN; // NaN (Not a Number) representa un resultado indefinido
        }
    }
}
