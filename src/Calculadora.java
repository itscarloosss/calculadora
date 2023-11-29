import java.util.Scanner;

// Clase principal que contiene el método main
public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar dos números
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        // Solicitar la operación
        System.out.print("Ingrese la operación (+, -, *, /): ");
        char operacion = scanner.next().charAt(0);

        double resultado = 0;

        // Realizar la operación correspondiente
        switch (operacion) {
            case '+':
                resultado = Suma.sumar(num1, num2);
                break;
            case '-':
                resultado = Resta.restar(num1, num2);
                break;
            case '*':
                resultado = Multiplicacion.multiplicar(num1, num2);
                break;
            case '/':
                resultado = Division.dividir(num1, num2);
                break;
            default:
                System.out.println("Operación no válida.");
                break;
        }

        // Mostrar el resultado
        System.out.println("El resultado es: " + resultado);

        // Cerrar el scanner
        scanner.close();
    }
}
