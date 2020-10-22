package br.com.test;
import br.com.sispessoa.*;

public class TestVendedor {

    public static void main(String[] args) {

        Vendedor vendedor = new Vendedor("Benício", "Rua Manguezal", "9999", 585, 300, 0.05);

        System.out.println(vendedor.getComissao());
        System.out.println(vendedor.getValorVendas());
        System.out.println(vendedor.calculaSalario());
        System.out.println("Nome: " + vendedor.getNome());
        System.out.println("Endereço: " + vendedor.getEndereco());
        System.out.println("Telefone: " + vendedor.getTelefone());

        vendedor.setNome("Benício Rodrigues da Silva");
        vendedor.setEndereco("Rua João Pessoa, nº 32");
        vendedor.setTelefone("(84)9989-6666");
        vendedor.setComissao(0.07);
        vendedor.setValorVendas(600);
        vendedor.setSalario(998);

        System.out.print(vendedor.toString());

    }

}
