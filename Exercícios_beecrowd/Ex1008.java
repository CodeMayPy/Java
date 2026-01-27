import java.util.Scanner;

    public class Ex1008{
        public static void main(String[] args){
            Scanner teclado=new Scanner(System.in);

            int numero = teclado.nextInt();
            int horas = teclado.nextInt();
            double valor = teclado.nextDouble();
        
            double salario = horas * valor;
        
            System.out.println("NUMBER = " +numero);
            System.out.printf("SALARY = U$ %.2f\n", salario);

            teclado.close();
        }
    }