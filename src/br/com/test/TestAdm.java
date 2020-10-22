package br.com.test;
import br.com.sispessoa.*;

public class TestAdm {

    public static void main(String[] args) {
        //Classe var = new Construtor( n atributos)
        Administrador adm1 = new Administrador("Alana", "Rua Fernando Pessoa", "4444-4", 1800, 200);

        System.out.println("Salário Atual: " + adm1.calculaSalario());
        System.out.println("Ajuda de Custo: " + adm1.getAjudaCusto());
        System.out.println("Salário: " + adm1.getSalario());
        System.out.println("Nome: " + adm1.getNome());
        System.out.println("Endereço: " + adm1.getEndereco());
        System.out.println("Telefone: " + adm1.getTelefone());

        adm1.setAjudaCusto(500);
        adm1.setSalario(2000);
        adm1.setNome("Alana Nobrega Fernandes");
        adm1.setEndereco("Rua João Pessoa, nº 32");
        adm1.setTelefone("(84)9989-7263");

        System.out.println(adm1.toString());

    }

}