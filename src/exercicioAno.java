import java.util.Scanner;

public class exercicioAno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ano;

        System.out.print("Informe o ano: ");
        ano = sc.nextInt();

        if ((ano % 4 == 0 && ano % 100 !=0 ) || ano % 400 == 0) {
            System.out.println( ano+" é bissexto");
        }
        else{
            System.out.println(ano + " não é bissexto");
        }
    }
}
