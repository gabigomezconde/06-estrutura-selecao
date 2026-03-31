import java.util.Scanner;

public class exercicio06
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);

        double n1, n2, media;

        System.out.print("Digite a nota 01: ");
        n1 = sc.nextDouble();
        System.out.print("Digite a nota 02: ");
        n2 = sc.nextDouble();

       media = (n1+n2)/2;
        System.out.println("A média é: "+media);

        if(media >= 6)
        {
            System.out.println("APROVADO!");
        }
        else
        {
            System.out.println("REPROVADO!");
        }
    }
}
