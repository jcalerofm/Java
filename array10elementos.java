import java.util.Scanner;

public class array10elementos {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int [] vector = new int[10];
    int contador = 0;

    for (contador = 0; contador < 10; contador++) {
      System.out.println("Dame un numero:");
      vector[contador] = sc.nextInt();
      sc.close();
    }
    for (contador = 0; contador < 10; contador++) {
      System.out.println("El valor de la posición [" + contador + "] es: " + vector[contador]);
    }
  }
}
