public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    // protected double salario;  PROTECTED esta entre o private e public signifca que suas informacoes sao compartilhadas apenas com filhos e herdeiros.
    // No caso apenas quem é um funcionario vai ver o salario. Gerente herdou o funcionario por isso que consegue ver.



    public double getBonificacao(){
        return this.salario * 0.1;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


}
