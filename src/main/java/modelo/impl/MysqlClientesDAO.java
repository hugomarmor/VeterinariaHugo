/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.ClientesDAO;
import modelo.entidades.Clientes;

/**
 *
 * @author HUGO MARTÍN MORALES DAM2B
 */
public class MysqlClientesDAO implements ClientesDAO {
    //constantes de consultas
    public static final String SQL_CONSULTA_TODOSCLIENTES = "select id_cliente, nombre, apellido, telefono, direccion, email from clientes order by id_cliente";
    public static final String SQL_INSERTAR_CLIENTE = "INSERT INTO citas (id_cliente, nombre, apellido, telefono, direccion, email) VALUES (?,?,?,?,?,?)";

    @Override
    public List<Clientes> obtenerClientesTodos() {
        List<Clientes> reClientes = new ArrayList<>();

        //consultar a la base de datos
        MysqlDAOFactory factoria = new MysqlDAOFactory();
        //conexion
        Connection con = factoria.getConnection();
        PreparedStatement pp = null;
        ResultSet res = null;
        try {
            pp = con.prepareStatement(SQL_CONSULTA_TODOSCLIENTES);

            //execute consulta
            res = pp.executeQuery();
            while (res.next()) {
                Clientes cliente = new Clientes();
                cliente.setId_cliente(res.getInt("id_cliente"));
                cliente.setNombre(res.getString("nombre"));
                cliente.setApellido(res.getString("apellido"));
                cliente.setTelefono(res.getString("telefono"));
                cliente.setDireccion(res.getString("direccion"));
                cliente.setEmail(res.getString("email"));
                
                reClientes.add(cliente);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MysqlUsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                //close que hay que cerrar
                if (con != null) {
                    con.close();
                }
                if (pp != null) {
                    pp.close();
                }
                if (res != null) {
                    res.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(MysqlUsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return reClientes;
    }

    @Override
    public int insertarCliente(Clientes uncliente) {
        //por si tengo que insertar algun cliente
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int modificarCliente(Clientes uncliente) {
        //por si tengo que modificar algun cliente
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int eliminarCliente(Clientes uncliente) {
        //por si tengo que eliminar algun cliente
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
