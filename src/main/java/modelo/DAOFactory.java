/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;

/**
 *
 * @author HUGO MARTÍN MORALES DAM2B
 */
public interface DAOFactory {
    
    //conexion
    Connection conexion = null;
    
    //clases para consultar base de datos

    public CitasDAO getCitasDAO();

    public ClientesDAO getClientesDAO();

    public MascotasDAO getMascotasDAO();

    public UsuariosDAO getUsuariosDAO();
    
    public abstract Connection getConnection(); 
}
