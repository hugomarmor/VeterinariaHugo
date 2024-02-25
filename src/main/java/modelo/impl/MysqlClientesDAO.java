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
    public static final String SQL_CONSULTA_CLIENTE = "select id_cliente, nombre, apellido, telefono, direccion, email from clientes where id_cliente=?";
    public static final String SQL_INSERTAR_CLIENTE = "INSERT INTO clientes (id_cliente, nombre, apellido, telefono, direccion, email) VALUES (?,?,?,?,?,?)";
    public static final String SQL_UPDATE_CLIENTE = "UPDATE clientes SET nombre = ?, apellido=?, telefono=?, direccion=?, email=? where id_cliente=?";
    public static final String SQL_DELETE_CLIENTE = "DELETE FROM clientes where id_cliente=?";
    
    /**
     * para obtener todos los clientes
     * @return 
     */
    @Override
    public List<Clientes> obtenerClientesTodos() {
        List<Clientes> reClientes = new ArrayList<>();

        //consultar a la base de datos
        MysqlDAOFactory factoria = MysqlDAOFactory.getInstance();
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
    
    /**
     * para insertar un cliente
     * @param uncliente
     * @return 
     */
    @Override
    public int insertarCliente(Clientes uncliente) {
        int ret = 0;
       
        //consultar a la base de datos
        MysqlDAOFactory factoria = new MysqlDAOFactory();
        //conexion
        Connection con = factoria.getConnection();
        PreparedStatement pp = null;
        try {
            pp = con.prepareStatement(SQL_INSERTAR_CLIENTE);

            pp.setInt(1, uncliente.getId_cliente());
            pp.setString(2, uncliente.getNombre());
            pp.setString(3, uncliente.getApellido());
            pp.setString(4, uncliente.getTelefono());
            pp.setString(5, uncliente.getDireccion());
            pp.setString(6, uncliente.getEmail());
            //execute consulta
            ret = pp.executeUpdate();
          
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
            } catch (SQLException ex) {
                Logger.getLogger(MysqlUsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
       return ret;
    }
    
    /**
     * para modifciar un cliente
     * @param uncliente
     * @return 
     */
    @Override
    public int modificarCliente(Clientes uncliente) {
        int ret = 0;
       
        //consultar a la base de datos
        MysqlDAOFactory factoria = new MysqlDAOFactory();
        //conexion
        Connection con = factoria.getConnection();
        PreparedStatement pp = null;
        try {
            pp = con.prepareStatement(SQL_UPDATE_CLIENTE);

            pp.setString(1, uncliente.getNombre());
            pp.setString(2, uncliente.getApellido());
            pp.setString(3, uncliente.getTelefono());
            pp.setString(4, uncliente.getDireccion());
            pp.setString(5, uncliente.getEmail());
            pp.setInt(6, uncliente.getId_cliente());
            //execute consulta
            ret = pp.executeUpdate();
          
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
            } catch (SQLException ex) {
                Logger.getLogger(MysqlUsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
       return ret;
    }
    
    /**
     * para eliminar un cliente
     * @param uncliente
     * @return 
     */
    @Override
    public int eliminarCliente(Clientes uncliente) {
        int ret = 0;
       
        //consultar a la base de datos
        MysqlDAOFactory factoria = new MysqlDAOFactory();
        //conexion
        Connection con = factoria.getConnection();
        PreparedStatement pp = null;
        try {
            pp = con.prepareStatement(SQL_DELETE_CLIENTE);

            pp.setInt(1, uncliente.getId_cliente());
            //execute consulta
            ret = pp.executeUpdate();
          
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
            } catch (SQLException ex) {
                Logger.getLogger(MysqlUsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
       return ret;
    }
    
    /**
     * para obtener un cliente
     * @param clienteFiltro
     * @return 
     */
    @Override
    public Clientes obtenerCliente(Clientes clienteFiltro) {
        Clientes ret = null;
         //consultar a la base de datos
        MysqlDAOFactory factoria = new MysqlDAOFactory();
        //conexion
        Connection con = factoria.getConnection();
        PreparedStatement pp = null;
        ResultSet res = null;
        try {
            pp = con.prepareStatement(SQL_CONSULTA_CLIENTE);

            // parámetros de la consulta
            pp.setInt(1, clienteFiltro.getId_cliente());
            //execute consulta
            res = pp.executeQuery();
            if (res.next()) {
                ret = new Clientes();
                ret.setId_cliente(res.getInt("id_cliente"));
                ret.setNombre(res.getString("nombre"));
                ret.setApellido(res.getString("apellido"));
                ret.setTelefono(res.getString("telefono"));
                ret.setDireccion(res.getString("direccion"));
                ret.setEmail(res.getString("email"));             
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

        return ret;
    }
    
}
