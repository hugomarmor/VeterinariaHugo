/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import modelo.CitasDAO;
import modelo.ClientesDAO;
import modelo.DAOFactory;
import modelo.MascotasDAO;
import modelo.UsuariosDAO;

/**
 *
 * @author HUGO MARTÍN MORALES DAM2B
 */
public class MysqlDAOFactory implements DAOFactory {
    //conexion a la base de datos
    private static final String URL = "jdbc:mysql://localhost:3306/clinica_veterinaria";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
    	
    // Singleton
    private static MysqlDAOFactory instance;
	
    /**
    * Return a singleton instance
    */
    public static synchronized MysqlDAOFactory getInstance() {
        if (instance == null) {
            instance = new MysqlDAOFactory();
        }
        return instance;
    }
    
    //obtener las implementaciones de las clases que consultan a la BBDD
    @Override
    public CitasDAO getCitasDAO() {
        return new MysqlCitasDAO();
    }
    
    @Override
    public ClientesDAO getClientesDAO() {
        return new MysqlClientesDAO();
    }

    @Override
    public MascotasDAO getMascotasDAO() {
        return new MysqlMascotasDAO();
    }

    @Override
    public UsuariosDAO getUsuariosDAO() {
        return new MysqlUsuariosDAO();
    }

    /**
     * conexión a la base de datos
     * @return
     */
    public synchronized Connection getConnection() {
        try {
            if (conexion == null) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                return DriverManager.getConnection(URL, USER, PASSWORD);
            }
            return conexion;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
}
