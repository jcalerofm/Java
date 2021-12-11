
public class vector {

  public static void main(String[] args) {

    int[][] numeros = new int[5][3];

    for (int fila = 0; fila < numeros.length; fila++) {
      for (int columna = 0; columna < numeros[fila].length; columna++) {
        numeros[fila][columna] = fila * columna;
      }
    }
    // System.out.println(numeros[7]);
    imprimirMatriz(numeros);
    int valor = obtenerValor(numeros, 4, 2);
    System.out.println(valor);

    String cadena = "";

    cadena.length();

  }

  public static void imprimirMatriz(int[][] matriz) {
    for (int fila = 0; fila < matriz.length; fila++) {
      for (int columna = 0; columna < matriz[fila].length; columna++) {
        System.out.println("Numeros[" + fila + "][" + columna + "] = " + matriz[fila][columna]);
      }
    }
  }

  public static int obtenerValor(int[][] matriz, int fila, int columna) {
    int resultado = 0;

    resultado = matriz[fila][columna];

    return resultado;
  }

}
