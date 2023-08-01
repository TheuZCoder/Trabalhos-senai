package POOExercicio3;

public class elevador {
    int nMaxAndares;
    int nMaxPessoas;
    int andarAtual;
    int qtdPessoasAtual;
    //métodos
    //construtor
    public elevador(int nMaxAndares, int nMaxPessoas) {
        this.nMaxAndares = nMaxAndares;
        this.nMaxPessoas = nMaxPessoas;
    }
    //gets and setters
    public int getAndarAtual() {
        return andarAtual;
    }
    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }
    public int getQtdPessoasAtual() {
        return qtdPessoasAtual;
    }
    public void setQtdPessoasAtual(int qtdPessoasAtual) {
        this.qtdPessoasAtual = qtdPessoasAtual;
    }
    //métodos próprios
    public void inicializa() {
        andarAtual = 0;
        qtdPessoasAtual = 0;
    }
    // entra
    public int entra(){
        if (qtdPessoasAtual < nMaxPessoas) {
            qtdPessoasAtual++;
        } else {
            System.out.println("Não vai entra ninguem");
        }
        return qtdPessoasAtual;
    }
    //sair
    public int sair(){
        if (qtdPessoasAtual > 0) {
            qtdPessoasAtual--;
        } else {
            System.out.println("Não vai entra ninguem");
        }
        return qtdPessoasAtual;
    }
    //subir
    public int subir(int nAndares){
        if (andarAtual <= nMaxAndares) {
            andarAtual+=nAndares;
        } else{
            System.out.println("Digite um n° Válido para subir");
        }
        return andarAtual;
    }
    //desce
    public int descer(int nAndares){
        if (andarAtual-nAndares>=0) {
            andarAtual-=nAndares;
        } else{
            System.out.println("Digite um n° Válido para descer");
        }
        return andarAtual;
    }
    
}
