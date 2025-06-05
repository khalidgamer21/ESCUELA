package edu.iudigital;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    public static Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/escuela";
        String usuario = "root";
        String contraseña = "root";
        try {
            Connection conn = DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("¡Conexión exitosa a la base de datos!");
            return conn;
        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
            return null;
        }
    }
}
