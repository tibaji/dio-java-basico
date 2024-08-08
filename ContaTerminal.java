import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite seu nome:");
        String nomeCliente = input.next();

        System.out.println("Por favor, digite seu sobrenome:");
        String sobrenomeCliente = input.next();

        System.out.println("Digite o número da sua agência:");
        String agencia = input.next();

        System.out.println("Digite o número da sua conta:");
        int numeroConta = input.nextInt();

        System.out.println("Digite seu saldo atual:");
        double saldo = input.nextDouble();

        System.out.println("\"Olá " + nomeCliente + " " + sobrenomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo R$ " + saldo + " já está disponível para saque.");




        


    }
}
