package classes;

/*
 * @author Arma X
 */
abstract class Funcionario extends Pessoa {

    protected float horasTrabalho;
    protected float salario;
    abstract public double getBonificacao();

    public Funcionario() {
        super();
        this.horasTrabalho = -1;
        this.salario = -1;
    }

    public String imprimir() {
        String texto = super.imprimir()
                + "\nHoras Trabalhadas: " + this.horasTrabalho + "\n"
                + "Salário: " + this.salario;
        return texto;
    }

    public void preencher(String nome, char sexo, int idade, float horasTrabalho, float salario) {
        super.preencher(nome, sexo, idade);
        this.horasTrabalho = horasTrabalho;
        this.salario = salario;
    }
    
    public float getHorasTrabalho() {
        return horasTrabalho;
    }

    public void setHorasTrabalho(float horasTrabalho) {
        this.horasTrabalho = horasTrabalho;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
