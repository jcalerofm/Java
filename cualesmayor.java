import java.util.Scanner;

public class cualesmayor {

    public static void main(String[] args) {
        int num1 = 0, num2 = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame un numerito:");
        num1 = sc.nextInt();
        System.out.println("Dame otro numerito:");
        num2 = sc.nextInt();

        if(num1 == num2){
            System.out.println("Son iguales!!");
        }else{
            if(num1 > num2){
                System.out.println(num1 + " es mayor que " + num2);
            }else{
                System.out.println(num2 + " es mayor que " + num1);
            }
        }
        sc.close();
        
    }
    
}
