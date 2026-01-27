import java.util.Scanner;

    public class Ex1001{
        public static void main(String[] args){
            Scanner teclado=new Scanner (System.in);
           
            int A = teclado.nextInt();
            int B = teclado.nextInt();
    
    
            System.out.println("X = "+ (A+B));

            teclado.close();
        }
    }