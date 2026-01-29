import java.util.Scanner;

    public class Ex1014{
        public static void main(String[] args){
            Scanner teclado=new Scanner(System.in);

            int distancia = teclado.nextInt();
            double combustivel = teclado.nextDouble();

            double consumo = distancia / combustivel;

            System.out.printf("%.3f km/l\n", consumo);

            teclado.close();
        }
    }