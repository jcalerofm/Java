import java.util.Scanner;

//Problema 1 Unidad tematica 1

public class holamundo {

    public static void main(String[] args) {

        int num = 0;
        System.out.println("Introduce un numero");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println("Tu numero introducido es " + num);
        sc.close();
    }
}
