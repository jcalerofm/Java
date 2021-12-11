import java.util.Scanner;

public class diasemana {

    public static void main(String[] args) {
        String[] sem = new String[]{"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        int num = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un numero del 1 al 7");
        num = sc.nextInt();

        if(num >= 1 && num <= 7){
            System.out.println("El dia de la semana es " + sem[num - 1]);
        }else{
            System.out.println("El valor no es valido");
        }
        sc.close();
    }
    
}
