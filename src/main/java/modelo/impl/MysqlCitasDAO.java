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
import modelo.CitasDAO;
import modelo.entidades.Citas;

/**
 *
 * @author HUGO MARTÍN MORALES DAM2B
 */
public class MysqlCitasDAO implements CitasDAO {
    //constantes de consultas
    public static final String SQL_CONSULTA_TODASCITAS = "select id_cita, id_mascotas, fecha_cita, hora_cita, motivo from citas order by id_cita";
    public static final String SQL_INSERTAR_CITA = "INSERT INTO citas (id_cita, id_mascota, fecha_cita, hora_cita, motivo) VALUES (?,?,?,?,?)";
    @Override
    public List<Citas> obtenerCitasTodos() {
        List<Citas> reCitas = new ArrayList<>();

        //consultar a la base de datos
        MysqlDAOFactory factoria = new MysqlDAOFactory();
        //conexion
        Connection con = factoria.getConnection();
        PreparedStatement pp = null;
        ResultSet res = null;
        try {
            pp = con.prepareStatement(SQL_CONSULTA_TODASCITAS);

            //execute consulta
            res = pp.executeQuery();
            while (res.next()) {
                Citas cita = new Citas();
                cita.setId_cita(res.getInt("id_cita"));
                cita.setId_mascota(res.getInt("id_mascota"));
                cita.setFecha_cita(res.getDate("fecha_cita"));
                cita.setHora_cita(res.getTime("hora_cita"));
                cita.setMotivo(res.getString("motivo"));
                
                reCitas.add(cita);
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

        return reCitas;
    }

    @Override
    public int insertarCita(Citas unacita) {
        //por si tengo que insertar alguna cita
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int modificarCita(Citas unacita) {
        //por si tengo que modificar alguna cita
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int eliminarCita(Citas unacita) {
        //por si tengo que eliminar alguna cita
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
