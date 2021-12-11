
import java.util.Scanner;


public class ultimodigito {
   
   public static void main( String[] args )
   {
       int iUltimoDigito;
    Scanner reader = new Scanner(System.in);
    int iNumero;
            
    System.out.println("Introduce un número por pantalla: ");
    iNumero = reader.nextInt();

    iUltimoDigito = iNumero%10;
    System.out.println("El último dígito de " + iNumero + " es " + iUltimoDigito);
    reader.close();
   } // fin del método main 
}
