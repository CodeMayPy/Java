import java.util.Scanner;
    public class Exercicio02f{
        public static void main(String[] args){
            Scanner teclado=new Scanner(System.in);
            double volume, base, altura, profundidade;

            System.out.println("Vamos calcular o volume de um paralelepípedo");
            System.out.println("Informe o valor da base:");
            base = teclado.nextDouble();

            System.out.println("Informe a altura:");
            altura = teclado.nextDouble();

            System.out.println("Informe a profundidade:");
            profundidade = teclado.nextDouble();

            volume = base * altura * profundidade;

            System.out.println("Se a base é " +base+ "cm, e a altura de " +altura+ "cm, e a profundidade de " +profundidade+ "cm, logo seu paralelepípedo tem um volume de " +volume+ "cm.");


            teclado.close();
        }
    }