/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Hugo Martín Morales DAM2B
 */
public class UsuarioNue {
    private final Connection conexion;

    public UsuarioNue() {
        //obtener la conexión de la clase ConexionBD
        this.conexion = ConexionBD.obtenerConexion();
    }

    public boolean registrarUsuario(String nombreUsuario, String contrasena) {
        String sql = "INSERT INTO Usuarios (nombre_trabajador, contraseña) VALUES (?, ?)";

        try (PreparedStatement pstmt = conexion.prepareStatement(sql)) {
            pstmt.setString(1, nombreUsuario);
            pstmt.setString(2, contrasena);

            int filasAfectadas = pstmt.executeUpdate();
            
            //el registro fue exitoso
            return filasAfectadas > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
