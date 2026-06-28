/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author USER
 */
public class DB {

    private static final String URL = "jdbc:mysql://127.0.0.1:3306/students_db";
    private static final String USER = "root";
    private static final String PASSWORD = "Imesh#14681";

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public ResultSet search(String query) throws SQLException {
        Connection c = getConnection();
        Statement s = c.createStatement();
        return s.executeQuery(query);
    }

    public boolean iud(String query) {
        try (
                Connection c = getConnection();
                Statement s = c.createStatement()) {

            int rows = s.executeUpdate(query);
            return rows > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

}
