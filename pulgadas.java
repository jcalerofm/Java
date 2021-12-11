import java.util.Scanner;

// Pseudocodigo 2 -Ex1

public class pulgadas{
    static final double pulgada = 2.54; //De este modo declaramos una constante
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double centimetros = 0.0, resultado = 0.0;

        System.out.println("Introduzca numero de cm: ");

        centimetros = sc.nextDouble();

        resultado = centimetros / pulgada;

        System.out.printf("El numero de %.2f cm en pulgadas es: %.2f \n", centimetros, resultado);

        sc.close();

        
    }
}