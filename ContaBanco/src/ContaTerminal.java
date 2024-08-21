import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //  TODO:  Conhecer e importar a classe Scanner;
        //         Exibir as mensagens para o osuário;
        //         Obter pelo scanner os valores digitados no terminal;
        //         Exibir a mensagem conta criada;

        Scanner input = new Scanner(System.in);

        System.out.println("Olá, seja bem vindo ao Banco DIO!");
        System.out.println("Digite o numero da conta: ");
        int numeroConta = input.nextInt();
        System.out.println("Digite o numero da agência: ");
        String numeroAgencia = input.next();
        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = input.next();
        System.out.println("Digite o saldo inicial: ");
        Double saldoInicial = input.nextDouble();

        System.out.println("Conta Criada com sucesso!");
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco! Sua agência é: " + numeroAgencia + ", sua conta é: " + numeroConta + "., e seu saldo é de: R$ " + saldoInicial + " e já está disponível para ser sacado!" );
                 
    }
}
