import java.util.Scanner;

public class contrasena {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int clave = 0, intentos = 0;
    boolean incorrecta = true;

    while (intentos < 3 && incorrecta) {
      intentos++;
      System.out.println("Introduzca contraseña: ");
      clave = sc.nextInt();
      incorrecta = (clave != 352 && clave != 259 && clave != 569);
    }

    if (intentos == 3 && incorrecta) {
      System.out.println("Demasiados intentos fallidos... :( ");
    } else {
      System.out.println("Clave Correcta!!");
    }

    sc.close();
  }

}
