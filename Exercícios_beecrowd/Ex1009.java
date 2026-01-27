import java.util.Scanner;

    public class Ex1009{
        public static void main(String[] args){
            Scanner teclado=new Scanner(System.in);

            String nome = teclado.nextLine();
            double salario = teclado.nextDouble();
            double vendas = teclado.nextDouble();

            double comissao = salario + (vendas * 0.15);

            System.out.printf("TOTAL = R$ %.2f\n", comissao);

            teclado.close();
        }
    }