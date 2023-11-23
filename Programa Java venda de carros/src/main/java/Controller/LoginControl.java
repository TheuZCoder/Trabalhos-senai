package Controller;

import java.sql.SQLException;

import Model.Pessoas;

public class LoginControl {
    //-----===| ATRIBUTOS |===-----//
    private static Pessoas usuario;
    private LoginDAO loginDAO;

    //-----===| MÉTODOS |===-----//
    public boolean verifyLogin(String nome, String cpf) throws SQLException{
        loginDAO = new LoginDAO();
        return loginDAO.consulta(nome, cpf);
    }
}