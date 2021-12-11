import java.util.Scanner;


public class triangulo {
   
   public static void main( String[] args )
   {
    double base, altura, hipotenusa, area, perimetro;
    Scanner reader = new Scanner(System.in);
            
    System.out.println("Introduce base del triangulo: ");
    base = reader.nextFloat();
    System.out.println("Introduce altura del triangulo: ");
    altura = reader.nextFloat();

    hipotenusa = Math.sqrt((base*base) + (altura*altura));
    area = (base * altura)/2;
    perimetro = base + altura + hipotenusa;
    System.out.println("El area del triangulo es " + area + " y el perimetro es " + perimetro);
    reader.close();
   } 
}