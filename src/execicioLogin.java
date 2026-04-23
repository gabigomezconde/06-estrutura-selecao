import java.util.Scanner;

public class execicioLogin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String login, senha;

        System.out.print("login: ");
        login = sc.next();

        if (login.equals("admin")) {
            System.out.print("senha: ");
            senha = sc.next();
            if (senha.equals("fiap2026")) {
                System.out.println("liberado");
            } else {
                System.out.println("senha incorreta");
            }

        } else {
            System.out.println("usuário não encontrado");
        }

    }
}