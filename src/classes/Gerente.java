package classes;

/*
 * @author Arma X
 */
public class Gerente extends Funcionario {

    private String senha;
    private int qtdFuncionarios;
    
    public Gerente() {
        super();
        this.senha = "-";
        this.qtdFuncionarios = -1;
    }

    public String imprimir() {
        String texto = super.imprimir() + "\nSenha: " + this.senha
                + "\nNº de pessoas gerenciadas: " + this.qtdFuncionarios
                + "\nBonificação: " + this.getBonificacao();
        return texto;
    }

    public void preencher(String nome, char sexo, int idade, float horasTrabalho, float salario, String senha, int qtdFuncionarios) {
        super.preencher(nome, sexo, idade, horasTrabalho, salario);
        this.senha = senha;
        this.qtdFuncionarios = qtdFuncionarios;
    }

    public double getBonificacao() {
        return super.salario * 0.15;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getQtdFuncionarios() {
        return qtdFuncionarios;
    }

    public void setQtdFuncionarios(int qtdFuncionarios) {
        this.qtdFuncionarios = qtdFuncionarios;
    }
}
