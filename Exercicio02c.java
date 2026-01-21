import java.util.Scanner;

    public class Exercicio02c {
        public static void main(String[] args){
            Scanner teclado=new Scanner(System.in);
            double area, base, altura;

            System.out.println("Vamos calcular a área de um triângulo.");
            System.out.println("Informe a base:");
            base = teclado.nextDouble();

            System.out.println("Informe a altura:");
            altura = teclado.nextDouble();

            area = base * altura/2;

            System.out.println("Se a base é " +base+ "cm, e a altura é " +altura+ "cm, logo a área do triângulo é de " +area+ "cm.");

            teclado.close();
        }
    }