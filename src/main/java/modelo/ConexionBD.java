/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Hugo Martín Morales DAM2B
 */
public class ConexionBD {
    //conexion a la base de datos
    private static final String URL = "jdbc:mysql://localhost:3306/clinica_veterinaria";
    private static final String USER = "tu_usuario_de_base_de_datos";
    private static final String PASSWORD = "tu_contraseña_de_base_de_datos";
    
    //conexion a la base de datos
    public static Connection obtenerConexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static boolean verificarCredenciales(String nombreUsuario, String contraseña) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            
            //consulta para comprobar el usuario
            String query = "SELECT * FROM Usuarios WHERE nombre_trabajador = ? AND contraseña = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, nombreUsuario);
            preparedStatement.setString(2, contraseña);

            ResultSet resultSet = preparedStatement.executeQuery();
            boolean existeUsuario = resultSet.next();

            resultSet.close();
            preparedStatement.close();
            connection.close();

            return existeUsuario;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
