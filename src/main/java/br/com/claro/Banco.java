package br.com.claro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Banco {
    public static void main(String[] args) throws SQLException {
        Connection conexao = DriverManager.getConnection("jdbc:oracle:thin:@192.168.25.250:1521/orcl","usuario","senha");








        conexao.close();
    }

}
