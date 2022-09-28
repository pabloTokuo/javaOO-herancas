public class TesteFuncionario {

    public static void main(String[] args) {

        Funcionario pablo = new Funcionario();

        pablo.setNome("Pablo Tokuo");
        pablo.setCpf("2222222-2");
        pablo.setSalario(2000.00);

        System.out.println(pablo.getBonificacao());

    }
}
