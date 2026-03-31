import java.util.Scanner;
public class exemplo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         double valorCompra, novoValor, valorFinal;

        System.out.print("Digite o valor total da compra: R$");
        valorCompra = sc.nextDouble();

        if(valorCompra > 1000){
            novoValor = 0.15*valorCompra;
        }
        else {
         novoValor = 0.08*valorCompra;
        }
        valorFinal = valorCompra-novoValor;
        System.out.println("O valor da compra, com o desconto é: R$"+valorFinal);
        System.out.print("Desconto: R$"+novoValor);
        }
    }
