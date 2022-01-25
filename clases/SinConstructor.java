package clases;
import java.util.Scanner;

public class SinConstructor {
  Scanner sc = new Scanner(System.in);
  String nombre = "";

  public void PedirNombre() {
    System.out.println("Introduce tu nombre: ");
    nombre = sc.nextLine();
  }

  public void ImprimirNombre() {
    System.out.println("Tu nombre es: " + nombre);

  }
}
