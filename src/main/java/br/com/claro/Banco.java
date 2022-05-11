package avena;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Banco {
    public static void main(String[] args) throws SQLException {
        Connection conexao = DriverManager.getConnection("jdbc:oracle:thin:@url:porta/sid","usuario","senha");








        conexao.close();
    }

}
