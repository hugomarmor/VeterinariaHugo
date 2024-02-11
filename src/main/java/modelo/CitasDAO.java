/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.List;
import modelo.entidades.Citas;

/**
 *
 * @author HUGO MARTÍN MORALES DAM2B
 */
public interface CitasDAO {
    
    //obtener todas las citas
    public List<Citas> obtenerCitasTodos();
    //insertar una cita
    public int insertarCita(Citas unacita);
    //modificar una cita
    public int modificarCita(Citas unacita);
    //eliminar una cita
    public int eliminarCita(Citas unacita);
}
