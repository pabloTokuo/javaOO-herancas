public class TesteGerente {
    public static void main(String[] args) {

        Gerente g1 = new Gerente();
        g1.setNome("Rol");
        g1.setCpf("444444-2");
        g1.setSalario(5000);
        g1.setSenha(3333);

        System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());
        boolean autenticou = g1.autentica(3333);

        System.out.println(autenticou);
        System.out.println(g1.getBonificacao());




    }
}
