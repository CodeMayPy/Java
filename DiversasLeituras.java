import java.util.Scanner;

/*
public class DiversasLeituras{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        String texto;
        System.out.println("Digite seu nome:");
        texto = teclado.nextLine(); //nextline -> lê tudo e o next -> lê só o primeiro dado. 
        System.out.println("Seu nome = " + texto);
    }
}
*/

public class DiversasLeituras{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int codigo;
        double preco;
        String nome, texto;

        System.out.print("Digite o  código:");
        texto = teclado.nextLine();
        codigo = Integer.parseInt(texto);

        System.out.print("Digite o nome :");
        nome = teclado.nextLine();

        System.out.print("Digite o preço :");
        texto = teclado.nextLine();
        preco = Double.parseDouble(texto);

        System.out.println("Você digitou " +codigo+ " - " +nome+ " R$" +preco);
    }
}      