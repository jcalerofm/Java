import java.util.Scanner;

public class mayoresdecero {

  public static void main(String[] args) {

    int contador = 0, positivos = 0, num = 0;
    Scanner sc = new Scanner(System.in);

    for (contador = 0; contador < 10; contador++) {
      System.out.println("Dame un numero:");
      num = sc.nextInt();
      sc.close();


      if (num > 0) {
        positivos++;
      }
    }

    System.out.println("Has introducido " + positivos + " numeros positivos.");


  }

}
