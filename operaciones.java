import java.util.Scanner;

public class operaciones {
    public static void main(String[] args) {
        double n1 = 0, n2 = 0, suma = 0, resta = 0, mult = 0, division = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un numero:");
        n1 = sc.nextDouble();
        System.out.println("Introduzca otro numero:");
        n2 = sc.nextDouble();

        suma = n1 + n2;
        resta = n1 - n2;
        mult = n1 * n2;
        division = n1 / n2;

        System.out.printf("La suma de %f y %f es: %f \n", n1, n2, suma);
        System.out.printf("La resta de %f y %f es: %f \n", n1, n2, resta);
        System.out.printf("La multiplicacion de %f y %f es: %f \n", n1, n2, mult);
        System.out.printf("La division de %f y %f es: %f \n", n1, n2, division);

        sc.close();

    }
}
