package br.com.fescfafic.poo.Main;
import br.com.fescfafic.poo.Model.ContaBancaria;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria("Banco ABC", 12345, 67890, "123456789-00", 1000);
        ContaBancaria conta2 = new ContaBancaria("Banco XYZ", 98765, 54321, "987654321-00", 1000);

        
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite a agência da conta destino: ");
        int agencia = scanner.nextInt();

        System.out.print("Digite o número da conta destino: ");
        int conta = scanner.nextInt();


        System.out.print("Digite o valor a ser transferido: ");
        double valorTransferido = scanner.nextDouble();


        if (conta1.agencia == agencia && conta1.conta == conta ) {
            ContaBancaria.transferirValor(conta1,valorTransferido);
            System.out.println("Transferência efetuada com sucesso!");
        } else if (conta2.agencia == agencia && conta2.conta == conta) {
            ContaBancaria.transferirValor(conta2,valorTransferido);
            System.out.println("Transferência efetuada com sucesso!");
        } else {
            System.out.println("Não foi possível realizar a transferência");
        }


    }
}