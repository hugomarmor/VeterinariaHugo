/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import modelo.DAOFactory;
import modelo.UsuariosDAO;
import modelo.entidades.Usuarios;
import modelo.impl.MysqlDAOFactory;
import modelo.entidades.Citas;

/**
 *
 * @author HUGO MARTÍN MORALES DAM2B
 */
public class CitasControlador {
    /**
     * Obtiene la lista de citas pendientes
     * @param filtro tendrá los atributos que se utilizarán para la consulta a la base de datos
     * @return lista de las citas encontradas
     */
    public List<Citas> obtenerListaCitas(Citas filtro) {
        List<Citas> retoro = null;
        return retoro;
    }
    
    /**
     * obtendrá todos los datos de una cita concreta usando el filtro
     * @param filtro tendrá relleno únicamente el atributo id, el resto de datos se consultarán a la base de datos
     * @return datos de la cita concreta
     */
    public Citas obtenerDatosCita(Citas filtro) {
        Citas retorno = null;
        return retorno;
    }
    
    /**
     * Creará una cita para una mascota, ugardando los datos en la base de datos
     * @param citaACrear datos de la cita
     * @return id de la cita creada.
     */
    public int crearCita(Citas citaACrear) {
        int ret = 0;
        
        return ret;
    }
    
    /**
     * Realizará las acciones necesarias para modificar los datos de la cita indicada
     * @param citaAModificar la cita a cambiar
     * @return 1 si ha modificado correctamente
     */
    public int modificarCita(Citas citaAModificar) {
         int ret = 0;
        
        return ret;
    }
    
    /**
     * Borrará la cita indicada
     * @param citaABorrar tendrá relleno únicamente el id de la cita que se quiere borrar
     * @return 1 si ha borrado correctamente, otro valor en caso de no borrarla
     */
    public int borrarCita(Citas citaABorrar) {
         int ret = 0;
        
        return ret;
    }
}
