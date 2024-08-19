package jackson.rocha;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Agência!");
        String agencia = sc.next();

        System.out.println("Por favor, digite o número da Conta!");
        int numero = sc.nextInt();

        System.out.println("Por favor, digite o seu primeiro nome!");
        String nomeCliente = sc.next();

        System.out.println("Por favor, digite o saldo da Conta!");
        double saldo = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s," +
                "conta %d e seu R$ saldo %.2f já está disponível para saque.", nomeCliente, agencia, numero, saldo);
    }
}
