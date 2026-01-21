import java.util.Scanner;

    public class Exercicio02h{
        public static void main(String[] args){
            Scanner teclado=new Scanner(System.in);
            //Calcular o volume de um cilindro... bora?
            double volume, raio, altura;

            System.out.println("Vamos calcular o volume de um cilindro.");
            System.out.println("Informe o raio:");
            raio = teclado.nextDouble();

            System.out.println("Informe a altura:");
            altura = teclado.nextDouble();

            volume = 3.14 * raio * raio *altura;

            System.out.printf("O volume do cilindro vale %.3f cm3\n",volume);

    
    
            teclado.close();
        }
    }