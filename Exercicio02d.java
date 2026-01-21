import java.util.Scanner;

    public class Exercicio02d{
        public static void main(String[] args){
            Scanner teclado=new Scanner(System.in);
            double diagonal1, diagonal2, area;

            System.out.println("Vamos calcular a área de um losango.");
            System.out.println("Informe a primeira diagonal:");
            diagonal1 = teclado.nextDouble();

            System.out.println("Informe a segunda diagonal:");
            diagonal2 = teclado.nextDouble();

            area = diagonal1 * diagonal2;

            System.out.println("Se a primeira diagonal é " +diagonal1+ "cm, e a segunda é " +diagonal2+ "cm, logo a área é de " +area+ "cm.");


            teclado.close();
        }
    }