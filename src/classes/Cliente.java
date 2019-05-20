package classes;

/*
 * @author Arma X
 */
public class Cliente extends Pessoa implements Bonificavel {

    private String cpf;
    private int qtd_compras = 0;

    public Cliente() {
        super();
        this.cpf = "";
    }

    public String imprimir() {
        String texto = super.imprimir() + "\nCpf: " + this.cpf;
        return texto;
    }

    public void preencher(String nome, char sexo, int idade, String cpf) {
        super.preencher(nome, sexo, idade);
        this.cpf = cpf;
    }

    /**
     * Método sobrecarregado informando também a quantidade de compras feitas
     * pelo cliente
     *
     * @param nome
     * @param sexo
     * @param idade
     * @param cpf
     * @param qtd_compras
     */
    public void preencher(String nome, char sexo, int idade, String cpf, int qtd_compras) {
        super.preencher(nome, sexo, idade);
        this.cpf = cpf;
        this.qtd_compras = qtd_compras;
    }

    @Override
    public double getBonificacao() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        return this.qtd_compras * this.idade; // Como depende da quantidade de compras e da idade, assumi como uma multiplicação normal
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the qtd_compras
     */
    public int getQtd_compras() {
        return qtd_compras;
    }

    /**
     * @param qtd_compras the qtd_compras to set
     */
    public void setQtd_compras(int qtd_compras) {
        this.qtd_compras = qtd_compras;
    }

}
