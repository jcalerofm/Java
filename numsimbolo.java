import java.util.Scanner;

public class numsimbolo {

    public static void main(String[] args) {
        int num1 = 0, num2 = 0, resultado = 0;
        String operacion = "";

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca primer operando:");
        num1 = sc.nextInt();

        System.out.println("Introduzca segundo operando:");
        num2 = sc.nextInt();

        System.out.println("Introduzca simbolo aritmetico (+, -, *, /):");
        sc.nextLine(); // Introducimos esta entrada vacia para cambiar las entradas de int a string
        operacion = sc.nextLine();

        switch (operacion) {
        case "+":
            resultado = num1 + num2;
            break;
        case "-":
            resultado = num1 - num2;
            break;
        case "*":
            resultado = num1 * num2;
            break;
        case "/":
            resultado = num1 / num2;
            break;
        default:
            System.out.println("El simbolo introducido no es válido...");
            break;
        }
        System.out.println("El resultado de " + num1 + " " + operacion + " " + num2 + " es: " + resultado);
        sc.close();

    }
}
