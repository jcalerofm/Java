import java.util.Scanner;


public class circulo {
   
   public static void main( String[] args )
   {
       int radio; // Almacena el radio del círculo
       
       // Instanciar un objeto de tipo 'Scanner'
       Scanner entrada = new Scanner( System.in );
       
       // Solicitud y obtención del radio del círculo
       System.out.print( "Digite el radio del círculo: ");
       radio = entrada.nextInt();
       
       // Visualización de resultados
       //Diámetro
       System.out.printf("\nEl diametro del círculo es: %d", ( 2 * radio ) );
       
       // Circunferencia
       System.out.printf( "\nLa circunferencia del círculo es: %f", ( 2 * Math.PI * radio ) );
       
       // Área
       System.out.printf( "\nEl área del círculo es: %f\n", ( Math.PI * radio * radio ) );
       
       // Salida normal
       System.exit(0);
       entrada.close();
       
   } // fin del método main 
}
