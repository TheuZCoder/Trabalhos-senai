import Connection.ConnectionDAO;

public class App {
    public static void main(String[] args) throws Exception {
        new ConnectionDAO().atualizarID(3, "Theuz ", "Theuz@gmail.com");
    }
}
