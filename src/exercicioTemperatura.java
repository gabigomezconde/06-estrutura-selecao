import java.util.Scanner;

public class exercicioTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double temperatura;

        System.out.print("Escreva quantos graus: ");
        temperatura= sc.nextDouble();

        if (temperatura < 20) {
            System.out.println(temperatura +"° é frio!");
        }
        else {
            System.out.println(temperatura+ "° é quente!");
        }

    }
}
