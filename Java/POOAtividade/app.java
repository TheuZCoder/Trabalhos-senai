package POOAtividade;

public class app {
    public static void main(String[] args) {
        pessoas pessoa1 = new pessoas();
        pessoa1.setNome("Fernanda Fernandes");
        pessoa1.setIdade(20);
        pessoa1.setAltura(1.76);
        pessoa1.setDia(06);
        pessoa1.setMes(02);
        pessoa1.setAno(2003);

        System.out.println("nome: "+pessoa1.getNome());
        System.out.println("altura: "+pessoa1.getAltura());
        System.out.println("Data de nascimento: "+pessoa1.getDia()+"/"+pessoa1.getMes()+"/"+pessoa1.getAno());
        System.out.println("Idade: "+pessoa1.getAno());
    }

    
}
