package br.com.test;
import br.com.sispessoa.*;

public class TestFornecedor {

    public static void main(String[] args) {

        Fornecedor fornecedor = new Fornecedor( 50, 40, "Ana", "Rua Barbosa", "5555");

        System.out.println(fornecedor.obterSaldo());
        System.out.println("Nome: " + fornecedor.getNome());
        System.out.println("Endereço: " +fornecedor.getEndereco());
        System.out.println("Telefone: " +fornecedor.getTelefone());
        System.out.println("Crédito: " +fornecedor.getValorCredito());
        System.out.println("Dívida: " +fornecedor.getValorDivida());

        fornecedor.setNome("Ana Maria");
        fornecedor.setEndereco("Rua Barbosa Peixoto");
        fornecedor.setTelefone("(83)999856248");
        fornecedor.setValorCredito(1000);
        fornecedor.setValorDivida(500);

        System.out.println(fornecedor.toString());

    }

}
