import java.util.Scanner;

    public class Ex1010{
        public static void main(String[] args){
            Scanner teclado=new Scanner(System.in);

            int codigo = teclado.nextInt();
            int peca = teclado.nextInt();
            double preco = teclado.nextDouble();

            int codigo2 = teclado.nextInt();
            int peca2 = teclado.nextInt();
            double preco2 = teclado.nextDouble();

            double valor1 = peca * preco;
            double valor2 = peca2 * preco2;

            double total = valor1 + valor2;

            System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);

            teclado.close();
        }
    }