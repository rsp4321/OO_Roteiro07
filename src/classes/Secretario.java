package classes;

/*
 * @author Arma X
 */
public class Secretario extends Funcionario {

    public Secretario() {
        super();
    }

    public String imprimir() {
        String texto = super.imprimir() + "\nBonificação: " + this.getBonificacao();
        return texto;
    }

    public void preencher(String nome, char sexo, int idade, float horasTrabalho, float salario) {
        super.preencher(nome, sexo, idade, horasTrabalho, salario);
    }
    
    public double getBonificacao() {
        return super.salario * 0.05;
    }
}
