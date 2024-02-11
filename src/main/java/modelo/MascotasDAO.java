/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.List;
import modelo.entidades.Mascotas;

/**
 *
 * @author HUGO MARTÍN MORALES DAM2B
 */
public interface MascotasDAO {
    
    //obtener todas las mascotas
    public List<Mascotas> obtenerMascotasTodos();
    //insertar una mascota
    public int insertarMascota(Mascotas unamascota);
    //modificar una mascota
    public int modificarMascota(Mascotas unamascota);
    //eliminar una mascota
    public int eliminarMascota(Mascotas unamascota);
}
