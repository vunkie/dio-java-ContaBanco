import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        String agencia, titular;
        int numero = 0;
        double saldo = 0;
        boolean isValid = false;

        System.out.println("Bem vindo ao Banco Java!");
        System.out.println("Vamos criar sua conta!");

        System.out.println("Digite o número da agência: ");
        agencia = sc.nextLine();

        do {
            System.out.println("Digite o número da conta: ");
            try {
                numero = sc.nextInt();
                isValid = true;
            } catch (Exception e) {
                System.out.println("Conta deverá ser um número inteiro!");
            } finally {
                sc.nextLine();
            }

        } while (!isValid);


        System.out.println("Digite o nome do titular da conta: ");
        titular = sc.nextLine();

        System.out.println("Digite o saldo inicial da conta: ");
        saldo = sc.nextDouble();
        sc.nextLine();

        System.out.println("Conta criada com sucesso!");

        System.out.println("Agência: " + agencia);
        System.out.println("Número: " + numero);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$ " + saldo);

        System.out.println("Obrigado por criar sua conta no Banco Java!");
        sc.close();
    };
};