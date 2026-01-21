import java.util.Scanner;

    public class Exercicio02g{
        public static void main(String[] args){
            Scanner teclado=new Scanner(System.in);
            double volume, lado;

            System.out.println("Vamos calcular o volume de um cubo");
            System.out.println("Informe o lado do cubo:");
            lado = teclado.nextDouble();

            volume = lado * lado * lado;

            System.out.println("Se o lado do seu cubo é " +lado+ "cm, então o volume dele é de " +volume+ "cm.");

            teclado.close();
        }
    }