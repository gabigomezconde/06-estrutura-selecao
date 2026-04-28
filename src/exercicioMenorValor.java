import javax.swing.*;
import java.util.Scanner;

public class exercicioMenorValor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int v1, v2, v3;

        System.out.println("Digite o valor 1: ");
        v1 = sc.nextInt();
        System.out.println("Digite o valor 2: ");
        v2 = sc.nextInt();
        System.out.println("Digite o valor 3: ");
        v3 = sc.nextInt();

        if (v1 != v2 && v1 != v3 && v2 != v3) {
            if (v1 < v2 && v1 < v3) {
                System.out.println("MENOR: " + v1);
            } else if (v2 < v3) {
                System.out.println("MENOR: " + v2);

            } else {
                System.out.println("MENOR: " + v3);
            }

        } else {
            System.out.println("Os valores devem ser diferentes, há repetição!");
        }
    }
}
