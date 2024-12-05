public class Main {
    public static void main(String[] args) {
        int numero = 10;
        numero += 5; // Equivale a numero = numero + 5
        numero -= 3; // Equivale a numero = numero - 3
        numero *= 2; // Equivale a numero = numero * 2
        numero /= 4; // Equivale a numero = numero / 4
        numero %= 2; // Equivale a numero = numero % 2
//        System.out.println(numero);

        Integer numeroInteiro = 10;
        Double numeroDecimal = 5.5;
        Boolean verdadeiro = true;

        int a = 10;
        int b = 20;
//        System.out.println("a == b ? " + (a == b));
//        System.out.println("a != b ? " + (a != b));
//        System.out.println("a > b ? " + (a > b));
//        System.out.println("a < b ? " + (a < b));
//        System.out.println("a >= b ? " + (a >= b));
//        System.out.println("a <= b ? " + (a <= b));
        int n = 123;
        String numeroComoString1 = String.valueOf(n);
        String numeroComoString2 = Integer.toString(n);
        System.out.println(numeroComoString1.getClass());
        System.out.println(numeroComoString2.getClass());

        int numeroConvertido = Integer.parseInt(numeroComoString2);
        System.out.println(numeroConvertido);

        if(a == b) {
            System.out.println("a é igual a b");
        } else if(a > b) {
            System.out.println("a é maior que b");
        } else {
            System.out.println("a é diferente e menor que b");
        }

        System.out.println("Laura println");
        System.out.print("laura print");
        System.out.printf("A pessoa %s tem %s anos", "flavia");
    }
}