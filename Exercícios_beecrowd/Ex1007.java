import java.util.Scanner;

    public class Ex1007{
        public static void main(String[] args){
            Scanner teclado=new Scanner(System.in);

            int A = teclado.nextInt();
            int B = teclado.nextInt();
            int C = teclado.nextInt();
            int D = teclado.nextInt();
        
            int diferenca =  (A * B - C * D);
        
             System.out.printf("DIFERENCA = %d\n", diferenca);
             
            teclado.close();
        }
    }