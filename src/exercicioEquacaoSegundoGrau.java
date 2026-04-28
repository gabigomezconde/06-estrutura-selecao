import java.util.Scanner;

public class exercicioEquacaoSegundoGrau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, c, delta, x1, x2;

        System.out.println("Digite o valor de A: ");
        a = sc.nextDouble();
        if (a == 0) {
            System.out.println("Não é uma equação de segundo grau");
        }
        else {
            System.out.println("Digite o valor de B: ");
            b = sc.nextDouble();
            System.out.println("Digite o valor de C: ");
            c = sc.nextDouble();
            delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("A equação não tem raiz real");
            }
            else {
                x1 = (-b+ Math.sqrt(delta))/(2*a);
                x2 = (-b+ Math.sqrt(delta))/(2*a);
                System.out.printf("x1 = %.2f", x1);
                System.out.printf("x2 = %.2f", x2);
            }
        }






    }
}
