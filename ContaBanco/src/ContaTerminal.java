import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o número da agência!");
        agencia = sc.next();

        System.out.println("Agora, digite o número da conta:");
        numero = sc.nextInt();

        System.out.println("Informe seu nome:");
        nomeCliente = sc.next();
        sc.nextLine();

        System.out.println("Agora, informe o saldo:");
        saldo = sc.nextDouble();     

        sc.close();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f, já está disponível para saque.", nomeCliente, agencia, numero, saldo);
    }
}
