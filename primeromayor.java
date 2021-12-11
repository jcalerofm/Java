import java.util.Scanner;

public class primeromayor {
    public static void main(String[] args) {
        int num1 = 0, num2 = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un numero:");
        num1 = sc.nextInt();
        System.out.println("Dime otro numero:");
        num2 = sc.nextInt();

        if(num1 > num2){
            System.out.println("Verdadero, el primer numero es mayor");
        }else{
            System.out.println("Falso, el segundo numero es mayor");
        }
        sc.close();
        
    }
    
}
