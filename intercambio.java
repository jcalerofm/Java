class intercambio {
    public static void main(String[] args){
        int a=5, b=3;
        int tmp;

        tmp=a;
        a=b;
        b=tmp;
        System.out.println("El valor de a ahora es: " + a);
        System.out.println("El valor de b ahora es: " + b);
    }
}