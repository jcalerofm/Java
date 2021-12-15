import java.util.Scanner;

public class string1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduzca frase: ");
    String frase1 = sc.nextLine();
    System.out.println("Introduzca otra frase: ");
    String frase2 = sc.nextLine();
    String opcion = "";

    do {

      System.out.println("Ahora... que hacemos con estas frases?? ");
      System.out.println("Elija una opcion: unir/contar/contener/reemplazar/salir ");
      opcion = sc.nextLine();

      switch (opcion) {
        case "unir":
          System.out.println("Unamos esas frases...");
          unir(frase1, frase2);
          break;
        case "contar":
          System.out.println("Contemos cuantos caracteres tienen esas frases...");
          contar(frase1, frase2);
          break;
        case "contener":
          if (frase1.contains(frase2)) {
            System.out.println(frase2 + " esta contenida en " + frase1 + "!");
          } else if (frase2.contains(frase1)) {
            System.out.println(frase1 + " esta contenida en " + frase2 + "!");
          } else {
            System.out.println("Ninguna frase esta contenida en la otra... :(");
          }
          break;
        case "reemplazar":
          reemplazar(frase1, frase2);
          System.out.println(frase1);
          break;

        case "salir":
          System.out.println("Po na... nos vemos!");
          break;
        default:
          System.out.println("Opcion no valida");
          break;

      }

    } while (!opcion.equals("salir"));
    sc.close();
  }

  public static void unir(String p1, String p2) {
    System.out.println(p1 + " " + p2);
  }

  public static void contar(String p1, String p2) {
    System.out.println("El tamaño de " + p1 + " es:" + p1.length());
    System.out.println("El tamaño de " + p2 + " es:" + p2.length());
  }

  public static void reemplazar(String p1, String p2) {
    p1.replace(p2.charAt(0), p2.charAt(p2.length() - 1));

  }

}
