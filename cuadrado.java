import java.util.Scanner;

public class cuadrado {
    public static void main(String[] args) {
        double n1 = 0, cuadrado = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un numero:");
        n1 = sc.nextDouble();

        cuadrado = Math.pow(n1, 2); // Math forma parte de la libreria interna de Java

        System.out.printf("El cuadrado de %f es: %f \n", n1, cuadrado); 
        // Utilizamos %f porque tenemos variables double. Se usa %d para variables int

        sc.close();
    }
    
}
