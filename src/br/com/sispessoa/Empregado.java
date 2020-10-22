package br.com.sispessoa;

public class Empregado extends Pessoa {

    protected double salario;

    public Empregado(double salario, String nome, String endereco, String telefone) {
        super (nome, endereco, telefone);
        this.salario = salario;
    }

    public double getSalario() {
        return this.salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calculaSalario(double salario, double calculaSalario) {
        return calculaSalario = salario;
    }
}

