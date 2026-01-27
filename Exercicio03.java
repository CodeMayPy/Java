import java.util.Scanner;

public class Exercicio03{
    public static void main (String [] args){
        Scanner teclado=new Scanner(System.in);
        double salarioMinimo, valor1Kw, qtdKw, valorTotal, valorComDesconto;

        System.out.println("Digite o valor do Salário mínimo:");
        salarioMinimo = teclado.nextDoublo();
        System.out.println("Digite a quantidade de Kw gastos:");
        qtdKw = teclado.nextDouble();
        System.out.println("");

        valor1Kw = salarioMinimo / 7.0 / 100.0;
        valorTotal = qtdKw * valor1Kw;
        valorComDesconto= valorTotal * 0.9;

        System.out.printf("O valor de 1 Kw        R$ %.2f\n", valor1Kw);
        System.out.printf("O valor total da conta R$ %.2f\n", valorTotal);
        System.out.printf("O valor com desconto   R$ %.2f\n", valorComDesconto);



        teclado.close();
    }
}