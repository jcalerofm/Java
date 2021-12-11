import java.util.Scanner;

public class paroimpar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0, resto = 0;
        System.out.println("Introduzca un numero: ");

        numero = sc.nextInt();
        resto = numero % 2;

        if (resto == 0) {
            System.out.printf("El numero %d es par \n", numero);
        } else {
            System.out.printf("El numero %d es impar \n", numero);
        }
        sc.close();
    }
}