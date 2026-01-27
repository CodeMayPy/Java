import java.util.Scanner;

    public class Ex1006{
        public static void main(String[] args){
            Scanner teclado=new Scanner(System.in);

            double A = teclado.nextDouble();
            double B = teclado.nextDouble();
            double C = teclado.nextDouble();
        
            double media = (A*2 + B*3 + C*5) / 10;
        
            System.out.printf("MEDIA = %.1f\n", media);

            teclado.close();
        }
    }