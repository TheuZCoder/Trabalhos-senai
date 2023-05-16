package POOintroducao;

public class app {
    public static void main(String[] args) {
        RegistraAluno aluno1 = new RegistraAluno();
        aluno1.setNome("Ana Carla Pereira");
        aluno1.setEndereco("Rua das Garças");
        aluno1.setIdade(17);
        aluno1.setNotaCiencias(10);
        aluno1.setNotaMatematica(6);
        aluno1.setNotaPortugues(7);
        System.out.println("Nome:"+aluno1.getNome());
        System.out.println("Endereço:"+aluno1.getEndereco());
        System.out.println("Idade:"+aluno1.getIdade());
        System.out.println("Média:"+aluno1.getMedia());

        System.out.println("---------------------------------------------------");

        RegistraAluno aluno2 = new RegistraAluno();
        aluno2.setNome("Antonio Carlos Silveira");
        aluno2.setEndereco("Rua das Garças");
        aluno2.setIdade(18);
        aluno2.setNotaCiencias(10);
        aluno2.setNotaMatematica(10);
        aluno2.setNotaPortugues(10);
        System.out.println("Nome:"+aluno2.getNome());
        System.out.println("Endereço:"+aluno2.getEndereco());
        System.out.println("Idade:"+aluno2.getIdade());
        System.out.println("Média:"+aluno2.getMedia());
    }
}
