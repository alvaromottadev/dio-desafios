import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        header();

        System.out.print("Digite o número da agência: ");
        Integer numberAgency = scanner.nextInt();

        System.out.print("Digite a agência: ");
        String agency = scanner.next();

        System.out.print("Digite o seu nome: ");
        String name = scanner.next();

        System.out.print("Digite o saldo: ");
        Double balance = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo R$%s já está disponível para saque.",
                name, agency, numberAgency, balance);

    }

    private static void header() {
        System.out.println("""
                ===========================
                Bem-vindo ao Banco Dio!
                Vamos começar a cadastrar sua conta
                ===========================
                """);
    }

}