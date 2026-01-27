import java.util.Scanner;

    public class Ex1002{
        public static void main(String[] args){
            Scanner teclado=new Scanner(System.in);

        double R = teclado.nextDouble();
        double n = 3.14159;
    
        double area = n * R * R;
        
        System.out.printf("A=%.4f\n", area);

            teclado.close();
        }
    }