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
import modelo.MascotasDAO;
import modelo.entidades.Mascotas;

/**
 *
 * @author HUGO MARTÍN MORALES DAM2B
 */
public class MysqlMascotasDAO implements MascotasDAO {
    //constantes de consultas
    public static final String SQL_CONSULTA_TODASMASCOTAS = "select id_mascota, id_cliente, id_trabajador, nombre, especie, raza, fecha_nacimiento from mascotas order by id_mascota";
    public static final String SQL_INSERTAR_MASCOTA = "INSERT INTO citas (id_mascota, id_cliente, id_trabajador, nombre, especie, raza, fecha_nacimiento) VALUES (?,?,?,?,?,?,?)";

    @Override
    public List<Mascotas> obtenerMascotasTodos() {
        List<Mascotas> reMascotas = new ArrayList<>();

        //consultar a la base de datos
        MysqlDAOFactory factoria = new MysqlDAOFactory();
        //conexion
        Connection con = factoria.getConnection();
        PreparedStatement pp = null;
        ResultSet res = null;
        try {
            pp = con.prepareStatement(SQL_CONSULTA_TODASMASCOTAS);

            //execute consulta
            res = pp.executeQuery();
            while (res.next()) {
                Mascotas mascota = new Mascotas();
                mascota.setId_mascota(res.getInt("id_mascota"));
                //mascota.setId_cliente(res.getInt("id_cliente"));
                //mascota.setId_trabajador(res.getInt("id_trabajador"));
                mascota.setNombre(res.getString("nombre"));
                mascota.setEspecie(res.getString("especie"));
                mascota.setRaza(res.getString("raza"));
                mascota.setFecha_nacimiento(res.getDate("fecha_nacimiento"));
                
                reMascotas.add(mascota);
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

        return reMascotas;
    }

    @Override
    public int insertarMascota(Mascotas unamascota) {
        //por si tengo que insertar alguna mascota
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int modificarMascota(Mascotas unamascota) {
        //por si tengo que modificar alguna mascota
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int eliminarMascota(Mascotas unamascota) {
        //por si tengo que eliminar alguna mascota
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
