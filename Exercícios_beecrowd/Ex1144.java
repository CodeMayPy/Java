import java.util.Scanner;

    public class Ex1144{
        public static void main(String[] args){
            Scanner teclado=new Scanner(System.in);
            int numero = teclado.nextInt();

            for (int num = 1; num <= numero; num++){
                System.out.println(num + " " + (num * num) + " " + (num * num * num));
                System.out.println(num + " " + ((num * num) +1) + " " + ((num * num * num)+1));
            }

            teclado.close();
        }
    }