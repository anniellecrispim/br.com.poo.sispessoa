package br.com.sispessoa;

public class Fornecedor extends Pessoa {

    private double valorCredito;
    private double valorDivida;

    public Fornecedor(double valorCredito, double valorDivida, String nome, String endereco, String telefone) {
        super(nome, endereco,telefone);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    public double getValorCredito() {
        return this.valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return this.valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public double obterSaldo() {
        return this.valorCredito - this.valorDivida;
    }

    public String toString() {
        return super.toString() +
                "\n Seu crédito é " + this.valorCredito
                + ", de um saldo: " + this.obterSaldo();
    }
}