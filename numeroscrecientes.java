import java.util.Scanner;

public class numeroscrecientes {
    
    public static void main(String[] args) {
        int num1 = 0, num2 = 0, num3 = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un numero:");
        num1 = sc.nextInt();
        System.out.println("Dime otro numero:");
        num2 = sc.nextInt();
        System.out.println("Venga va... Dime otro mas!:");
        num3 = sc.nextInt();

        if(num1 < num2 && num2 < num3){
            System.out.println("Numeros introducidos en orden creciente!");
        }else{
            System.out.println("Oh oh... Numeros introducidos en orden NO creciente");
        }
        sc.close();
        
    }
}
