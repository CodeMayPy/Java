import java.util.Scanner;

    public class Ex1038{
        public static void main(String[] args){
            Scanner teclado=new Scanner(System.in);
            int codigo, quantia;

            codigo = teclado.nextInt();
            quantia = teclado.nextInt();

            switch (codigo){
                case 1:
                    System.out.printf("Total: R$ %.2f%n", (4.00 * quantia));
                    break;
                case 2:
                    System.out.printf("Total: R$ %.2f%n", (4.50 * quantia));
                    break;
                case 3:
                    System.out.printf("Total: R$ %.2f%n", (5.00 * quantia));
                    break;
                case 4:
                    System.out.printf("Total: R$ %.2f%n", (2.00 * quantia));
                    break;
                case 5:
                    System.out.printf("Total: R$ %.2f%n", (1.50 * quantia));
                    break;
            }
            teclado.close();
        }
    }