import java.util.Scanner;

    public class Ex1020{
        public static void main (String[] args){
            Scanner teclado=new Scanner(System.in);

            int tempo = teclado.nextInt();

            int anos = tempo / 365;
            int resto = tempo % 365;

            int mes = resto / 30;
            int dias = resto % 30;

            System.out.println(anos + " ano(s)");
            System.out.println(mes + " mes(es)");
            System.out.println(dias + "dia(a)");

            teclado.close();
        }
    }