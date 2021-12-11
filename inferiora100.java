import java.util.Scanner;

public class inferiora100 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 101;

        do {
            System.out.println("Dime un numero menor de 100: ");
            num = sc.nextInt();
        } while (num >= 100);

        System.out.println("Has introducido un numero menor de 100: el " + num);
        sc.close();
    }

}
