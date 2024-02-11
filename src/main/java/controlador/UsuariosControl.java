/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.DAOFactory;
import modelo.UsuariosDAO;
import modelo.entidades.Usuarios;
import modelo.impl.MysqlDAOFactory;

/**
 *
 * @author HUGO MARTÍN MORALES DAM2B
 */
public class UsuariosControl {
    /**
     * comprueba que existe el usuario con la contraseña indicada
     * @param nombreUsuario nombre del usuario a comprobar
     * @param contra contraseña de ese usuario
     * @return true si existe
     */
    public boolean accederLogin(String nombreUsuario, String contra) {
        boolean retorno = false;
        DAOFactory factoria = new MysqlDAOFactory();
        UsuariosDAO daoUsuario = factoria.getUsuariosDAO();
        Usuarios unusuario = new Usuarios();
        //parametros
        unusuario.setNombre_trabajador(nombreUsuario);
        unusuario.setContraseña(contra);
        
        unusuario = daoUsuario.obtenerUsuario(unusuario);
        
        //comprobar si existe
        if (unusuario != null) {
            retorno = true;
        }
        
        return retorno;
    }
}
