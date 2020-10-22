package br.com.sispessoa;

public class Administrador extends Empregado {

    private double ajudaCusto;

    public Administrador(String nome, String endereco, String telefone, double salario, double ajudaCusto) {
        super(salario, nome, endereco, telefone);
        this.ajudaCusto = ajudaCusto;
    }
    public double getAjudaCusto() {
        return this.ajudaCusto;
    }

    public void setAjudaCusto(double ajudaCusto) {
        this.ajudaCusto = ajudaCusto;
    }

    public double calculaSalario() { //salario_real = calculaSalario (herdado) + ajudaDeCusto
        double salarioAdm = this.salario + this.ajudaCusto;
        return salarioAdm;

    }
    public String toString() {
        return super.toString() +
                "\n Salário Bruto " + this.salario
                + ", com ajuda de custo de " + this.ajudaCusto
                + "\n Salário Final: " +this.calculaSalario();
    }

}
