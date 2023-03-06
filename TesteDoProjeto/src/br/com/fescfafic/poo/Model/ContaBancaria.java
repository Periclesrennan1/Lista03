package br.com.fescfafic.poo.Model;

public class ContaBancaria {
        public String instituicaoFinanceira;
        public int agencia;
        public int conta;
        public String cpf;
        public double valorEmConta = 1000;

        public ContaBancaria(String instituicaoFinanceira, int agencia, int conta, String cpf, double valorEmConta) {
            this.instituicaoFinanceira = instituicaoFinanceira;
            this.agencia = agencia;
            this.conta = conta;
            this.cpf = cpf;
            this.valorEmConta = valorEmConta;
        }

        public void depositarDinheiro (double valorDepositar) {
            this.valorEmConta += valorDepositar;
        }

        public void retirarDinheiro (double valorRetirar) {
            this.valorEmConta -= valorRetirar;
        }

        public static void transferirValor (ContaBancaria contaDestino, double valorTransferido) {
            contaDestino.valorEmConta += valorTransferido;
        }

}
