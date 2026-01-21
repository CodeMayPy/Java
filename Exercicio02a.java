import java.util.Scanner;

public class Exercicio02a {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        double lado, area;

        System.out.println("Vamos calcular a área de um quadrado.");
        System.out.println("Informe o lado do quadrado:");

        lado = teclado.nextDouble();
        area = lado * lado;
        
        System.out.println("Se o seu quadrado possui lado de " +lado+"cm, logo sua área é de " +area+ "cm.");


        teclado.close();
    }
}