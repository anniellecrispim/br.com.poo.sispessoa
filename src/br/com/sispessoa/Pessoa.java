package br.com.sispessoa;

public abstract class Pessoa {

    private String nome;
    private String endereco;
    private String telefone;

    public Pessoa(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public Pessoa() { //nenhum dado

    }

    public Pessoa (String nome) { //só nome
        this.nome = nome;
    }

    /*
     * Isso se chama overload (sobrecarga) de construtores
     */

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public String toString() {
        return " Nome: " + this.nome +
                "\n Endereço: " + this.endereco +
                ", telefone para contato: " + this.telefone;
    }
}
