/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.List;
import modelo.entidades.Usuarios;

/**
 *
 * @author HUGO MARTÍN MORALES DAM2B
 */
public interface UsuariosDAO {
    
    //obtener todo los usuarios
    public List<Usuarios> obtenerUsuariosTodos();
    //obtener un usuario
    public Usuarios obtenerUsuario(Usuarios unusuario);
    //insertar un usuario
    public int insertarUsuario(Usuarios unusuario);
    //modificar contraseña usuario
    public int modificarContraseña(Usuarios unusuario);
    //eliminar un usuario
    public int eliminarUsuario(Usuarios unusuario);
    //comprobar usuario
    public Usuarios existeUsuario(Usuarios unusuario);
}
