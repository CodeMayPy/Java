import java.util.Scanner;

    public class TesteIfAninhado{
        public static void main(String[] args){
            Scanner teclado=new Scanner(System.in);
            int nota;
            System.out.println("Digite a sua nota:");
            nota=teclado.nextInt();

            if (nota >= 90){
                System.out.println("A");
            }
            else if (nota >= 80){
                    System.out.print("B");
                }
            else if (nota >= 70){
                        System.out.println("C");
                    }
            else if (nota >= 60){
                            System.out.print("D");
                        }
            else{
                            System.out.println("Reprovado");
                        }
            teclado.close();
                    }
                }