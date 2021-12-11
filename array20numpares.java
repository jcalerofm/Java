public class array20numpares {
  public static void main(String[] args) {
    int[] vector = new int[20];


    for (int i = 0; i < 20; i++) {
      vector[i] = i * 2;
      System.out.println("Posicion[" + i + "] = " + vector[i]);
    }
  }

}
