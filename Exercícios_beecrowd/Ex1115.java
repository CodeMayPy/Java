import java.util.Scanner;

    public class Ex1115 {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            double X, Y;

            while (true) {
                X = teclado.nextDouble();
                Y = teclado.nextDouble();

                if (X == 0 || Y == 0) {
                    break;
                }

                if (X > 0 && Y > 0) {
                    System.out.println("primeiro");
                } else if (X < 0 && Y > 0) {
                    System.out.println("segundo");
                } else if (X < 0 && Y < 0) {
                    System.out.println("terceiro");
                } else if (X > 0 && Y < 0) {
                    System.out.println("quarto");
                }
            }
                teclado.close();
            }
        }
