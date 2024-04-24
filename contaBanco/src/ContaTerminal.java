import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Ola, para começarmos, por favor, digite o numero da Agencia: ");
            String agencia = scanner.nextLine();
            
        System.out.println("Por favor, digite o seu nome:");
            String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o numero da sua conta:");
            int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o seu saldo:");
            double saldoConta = scanner.nextDouble();

        System.out.println("Ola, " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia e " + agencia + ", conta " + numeroConta + " e seu saldo " + saldoConta + " ja esta disponivel para saque!");
    }


}
