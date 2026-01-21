import java.util.Scanner;

    public class Exercicio02e{
        public static void main(String[] args){
            Scanner teclado=new Scanner(System.in);
            double area, baseMaior, baseMenor, altura;

            System.out.println("Vamos calcular a área de um trapézio.");
            System.out.println("Informe a base de maior valor:");
            baseMaior = teclado.nextDouble();

            System.out.println("Informe a base de menor valor:");
            baseMenor = teclado.nextDouble();

            System.out.println("Informe a altura:");
            altura = teclado.nextDouble();


            area = (baseMaior + baseMenor) * altura/2;

            System.out.println("Se a base maior é de " +baseMaior+ "cm, e a base menor de " +baseMenor+ "cm, e a altura de " +altura+ "cm, logo a área é de " +area+ "cm.");


            teclado.close();
        }
    }