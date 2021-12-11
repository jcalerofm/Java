import java.util.Scanner;

public class triple {
    public static void main(String[] args) {
        double n1 = 0, triple = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un numero real:");
        n1 = sc.nextDouble();

        triple = n1 * 3;

        System.out.printf("El triple de %f es: %f \n", n1, triple); 
        // Utilizamos %f porque tenemos variables double. Se usa %d para variables int

        sc.close();
    }
    
}
