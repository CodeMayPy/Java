import java.util.Scanner;

    public class Ex1013{
        public static void main(String[] args){
            Scanner teclado=new Scanner(System.in);

            int A = teclado.nextInt();
            int B = teclado.nextInt();
            int C = teclado.nextInt();

            int maiorAB = (A + B + Math.abs(A - B)) / 2;
            int maior = (maiorAB + C + Math.abs(maiorAB - C)) / 2;

            System.out.println(maior + " eh o maior");

            teclado.close();
        }
    }