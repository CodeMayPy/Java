import java.util.Scanner;

    public class Ex1017{
        public static void main(String[] args){
            Scanner teclado=new Scanner(System.in);

            double tempo = teclado.nextDouble();
            double velocidade = teclado.nextDouble();

            double litros = (tempo * velocidade) / 12;

            System.out.printf("%.3f\n", litros);

            teclado.close();
        }
    }