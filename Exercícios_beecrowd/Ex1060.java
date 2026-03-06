import java.util.Scanner;

public class Ex1060{
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
        int contadorPositivos = 0;

        for (int i = 0; i < 6; i++){
            double number = teclado.nextDouble();
            if (number > 0){
                contadorPositivos++;
            }
        }

        System.out.println(contadorPositivos + " valores positivos.");

        teclado.close();
    }
}