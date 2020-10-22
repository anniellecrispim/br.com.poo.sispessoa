package br.com.sispessoa;

public class Vendedor extends Empregado {

    private double valorVendas;
    private double comissao;

    public Vendedor (String nome, String endereco, String telefone, double salario, double valorVendas, double comissao) {
        super(salario, endereco, telefone, nome);
        this.comissao = comissao;
        this.valorVendas = valorVendas;
    }

    public double getValorVendas() {
        return this.valorVendas;
    }

    public void setValorVendas(double valorVendas){
        this.valorVendas = valorVendas;
    }

    public double getComissao() {
        return this.comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double calculaSalario() {
        return  this.salario + (this.valorVendas * this.comissao);
    }

    public String toString() {
        return super.toString() +
                "\n Salário Bruto " + this.salario
                + ", valor das vendas pelo mês foi " + this.valorVendas + ", e sua comissão foi " + this.comissao
                + "\n Salário Final: " +this.calculaSalario();
    }
}