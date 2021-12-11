import java.util.Scanner;

public class cuentafrases {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String continuar = "";
        int contador = 0;

        do{
            System.out.println("Introduzca una frase: ");
            sc.nextLine();
            contador++;
            System.out.println("¿Continuar? (s/n): ");
            continuar = sc.nextLine();

        }while(continuar.equals("s") || continuar.equals("S"));

        System.out.println("El numero de frases introducidas es: " + contador);
        sc.close();
    }
    
}

