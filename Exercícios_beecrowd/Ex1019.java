import java.util.Scanner;

    public class Ex1019{
        public static void main(String[] args){
            Scanner teclado=new Scanner(System.in);

            int totalsegundos = teclado.nextInt();

            int hora = totalsegundos / 3600;
            int resto =  totalsegundos % 3600;

            int minutos = resto / 60;
            int segundos = resto % 60;

            System.out.println(hora + ":" + minutos + ":" + segundos);

            teclado.close();
        }
    }