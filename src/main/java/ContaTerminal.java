import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int conta;
        String agencia;
        String nome;
        double saldo;

        System.out.println("Seja bem-vindo à criação de conta no GucaBank!");

        System.out.println("Por favor, digite seu nome!");
        nome = scan.next();

        System.out.println("Por favor, digite o número da Agência!");
        agencia = scan.next();

        System.out.println("Por favor, digite o número da conta!");
        conta = scan.nextInt();

        System.out.println("Por favor, digite o valor do seu primeiro depósito!");
        saldo = scan.nextInt();


        System.out.println("Olá, " + nome
                + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + conta + " e seu saldo de R$"
                + saldo + " já está disponivel para saque.");



    }
}
