// Classe Gerente herdou os atributos da Classe Funcionario agora todos os metodos de Funcionarios podem ser utilizados pela Classe Gerente
public class Gerente extends Funcionario{

    private int senha;

    public void setSenha(int senha){
        this.senha = senha;
    }

    public boolean autentica(int senha){ // Se senha for igual parametro senha true se não false
        if (this.senha == senha){
            return true;
        } else {
            return false;
        }
    }

    public double getBonificacao(){ // Mesma assinatura que a primeira. Isso é chamado de Sobrescrita.
        return super.getBonificacao() + super.getSalario(); // Super signifca que esse atributo esta em outra classe, na classe mãe
    }


}
