import java.util.Scanner;

public class suma {

    public static void main(String[] args) {
        int n1 = 0, n2 = 0, suma = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero:");
        n1 = sc.nextInt();

        System.out.println("Introduce otro numero:");
        n2 = sc.nextInt();

        suma = n1 + n2;
        System.out.printf("El resultado de sumar %d mas %d es: %d \n", n1, n2, suma); //la \n anade un salto de linea

        sc.close();  //SIEMPRE ES CONVENIENTE CERRAR EL PROCESO DE SCANNER, AUNQUE 
        // todo se ejecute correctamente
    }

}