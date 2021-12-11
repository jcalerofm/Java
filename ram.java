import java.util.Scanner;


public class ram {
   
   public static void main( String[] args )
   {
    double frecuencia, nanosegundos, celda, cas, ras, precharge, active, latencia;
    Scanner reader = new Scanner(System.in);
      
    System.out.println("Introduce MT/s (Mhz * 2): ");
    frecuencia = reader.nextFloat();
    System.out.println("A que celda quieres llegar?: ");
    celda = reader.nextFloat();
    System.out.println("Introduce CAS: ");
    cas = reader.nextFloat();
    System.out.println("Introduce RAS: ");
    ras = reader.nextFloat();
    System.out.println("Introduce PRECHARGE: ");
    precharge = reader.nextFloat();
    System.out.println("Introduce ACTIVE: ");
    active = reader.nextFloat();

    nanosegundos = (1/((frecuencia/2)*1000000) * 1000000000) ;
    latencia = (celda *(nanosegundos * cas)) + (nanosegundos * ras) + (nanosegundos * precharge) + (nanosegundos * active);
    System.out.println("La latencia de esta RAM es: " + latencia + " ns");
    reader.close();
   } 
}