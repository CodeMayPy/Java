import java.util.Scanner;

public class TesteIf {
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
        double n1, n2, me;

        System.out.print("Digite a N1: ");
        n1 = teclado.nextDouble();
        System.out.print("Digite a N2: ");
        n2 = teclado.nextDouble();

        me = (n1 + n2)/2;

        System.out.println("Sua media final vale: " +me);

        if (me >= 6) {
            System.out.println("Parabéns você está aprovado.");
        }
        else{
            System.out.println("Estude mais no próximo semestre");
        }



        teclado.close();

    }
}