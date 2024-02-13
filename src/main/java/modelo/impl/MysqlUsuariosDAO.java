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
import modelo.UsuariosDAO;
import modelo.entidades.Usuarios;

/**
 *
 * @author HUGO MARTÍN MORALES DAM2B
 */
public class MysqlUsuariosDAO implements UsuariosDAO {

    //constantes de consultas
    //md5 para encriptar contraseña
    public static final String SQL_CONSULTA_USUARIO_LOGIN = "select id_trabajador, nombre_trabajador, contraseña, email_trabajador, rol from usuarios where nombre_trabajador=? AND contraseña = md5(?)";
    public static final String SQL_CONSULTA_TODOSUSUARIO = "select id_trabajador, nombre_trabajador, contraseña, email_trabajador, rol from usuarios order by id_trabajador";
    public static final String SQL_INSERTAR_USUARIO = "INSERT INTO usuarios (nombre_trabajador, contraseña, email_trabajador, rol) VALUES (?,md5(?),?,?)";
    public static final String SQL_CONSULTA_USUARIO_EXISTE = "select id_trabajador, nombre_trabajador, contraseña, email_trabajador, rol from usuarios where nombre_trabajador=?";
    public static final String SQL_MODIFICAR_CONTRASEÑA = "UPDATE usuarios SET contraseña = md5(?) where email_trabajador=?";

    @Override
    public List<Usuarios> obtenerUsuariosTodos() {
        //por si tengo que consultar todos los veterinarios
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Usuarios obtenerUsuario(Usuarios unusuario) {
        Usuarios reUsuarios = null;

        //consultar a la base de datos
        MysqlDAOFactory factoria = new MysqlDAOFactory();
        //conexion
        Connection con = factoria.getConnection();
        PreparedStatement pp = null;
        ResultSet res = null;
        try {
            pp = con.prepareStatement(SQL_CONSULTA_USUARIO_LOGIN);
            //cambiar por los datos
            pp.setString(1, unusuario.getNombre_trabajador());
            pp.setString(2, unusuario.getContraseña());

            //execute consulta
            res = pp.executeQuery();
            if (res.next()) {
                reUsuarios = new Usuarios();
                reUsuarios.setId_trabajador(res.getInt("id_trabajador"));
                reUsuarios.setNombre_trabajador(res.getString("nombre_trabajador"));
                reUsuarios.setContraseña(unusuario.getContraseña());
                reUsuarios.setEmail_trabajador(res.getString("email_trabajador"));
                reUsuarios.setRol(res.getString("rol"));
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

        return reUsuarios;
    }
    
    @Override
    public Usuarios existeUsuario(Usuarios unusuario) {
        Usuarios reUsuarios = null;

        //consultar a la base de datos
        MysqlDAOFactory factoria = new MysqlDAOFactory();
        //conexion
        Connection con = factoria.getConnection();
        PreparedStatement pp = null;
        ResultSet res = null;
        try {
            pp = con.prepareStatement(SQL_CONSULTA_USUARIO_EXISTE);
            //cambiar por los datos
            pp.setString(1, unusuario.getNombre_trabajador());

            //execute consulta
            res = pp.executeQuery();
            if (res.next()) {
                reUsuarios = new Usuarios();
                reUsuarios.setId_trabajador(res.getInt("id_trabajador"));
                reUsuarios.setNombre_trabajador(res.getString("nombre_trabajador"));
                reUsuarios.setContraseña(unusuario.getContraseña());
                reUsuarios.setEmail_trabajador(res.getString("email_trabajador"));
                reUsuarios.setRol(res.getString("rol"));
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

        return reUsuarios;
    }

    @Override
    public int insertarUsuario(Usuarios unusuario) {
        int ret = 0;
        //consultar a la base de datos
        MysqlDAOFactory factoria = new MysqlDAOFactory();
        //conexion
        Connection con = factoria.getConnection();
        PreparedStatement pp = null;
        try {
            //insert
            pp = con.prepareStatement(SQL_INSERTAR_USUARIO);

            pp.setString(1, unusuario.getNombre_trabajador());
            pp.setString(2, unusuario.getContraseña());
            pp.setString(3, unusuario.getEmail_trabajador());
            pp.setString(4, unusuario.getRol());
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

    @Override
    public int modificarContraseña(Usuarios unusuario) {
        int ret = 0;
        //consultar a la base de datos
        MysqlDAOFactory factoria = new MysqlDAOFactory();
        //conexion
        Connection con = factoria.getConnection();
        PreparedStatement pp = null;
        try {
            //update
            pp = con.prepareStatement(SQL_MODIFICAR_CONTRASEÑA);

            pp.setString(1, unusuario.getContraseña());
            pp.setString(2, unusuario.getEmail_trabajador());

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

    @Override
    public int eliminarUsuario(Usuarios unusuario) {
        //por si tengo que eliminar algun veterinario
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
