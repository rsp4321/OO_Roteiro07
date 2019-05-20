package classes;

/*
 * @author Arma X
 */
public class Diretor extends Funcionario {

    private String senha;

    public Diretor() {
        super();
        this.senha = "-";
    }

    public String imprimir() {
        String texto = super.imprimir() + "\nSenha: " + this.senha
                + "\nBonificação: " + this.getBonificacao();
        return texto;
    }

    public void preencher(String nome, char sexo, int idade, float horasTrabalho, float salario, String senha) {
        super.preencher(nome, sexo, idade, horasTrabalho, salario);
        this.senha = senha;
    }

    public double getBonificacao() {
        return super.salario * 0.10;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
