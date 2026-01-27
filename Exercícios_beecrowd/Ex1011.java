import java.util.Scanner;

    public class Ex1011{
        public static void main(String[] args){
            Scanner teclado=new Scanner(System.in);
            
            double pi =3.14159;

            double raio = teclado.nextDouble();

            double volume = (4.0 / 3) * pi * (raio * raio * raio);

            System.out.printf("VOLUME = %.3f\n", volume);

            teclado.close();
        }
    }