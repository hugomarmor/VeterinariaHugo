/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import modelo.DAOFactory;
import modelo.MascotasDAO;
import modelo.entidades.Mascotas;
import modelo.impl.MysqlDAOFactory;

/**
 *
 * @author HUGO MARTÍN MORALES DAM2B
 */
public class MascotasControlador {
    /**
     * Obtiene la lista de mascotas
     *
     * @param filtro tendrá los atributos que se utilizarán para la consulta a
     * la base de datos
     * @return lista de mascota encontradas
     */
    public List<Mascotas> obtenerListaMascotas(Mascotas filtro) {
        List<Mascotas> ret = null;

        DAOFactory factoria = new MysqlDAOFactory();
        MascotasDAO daoMascota = factoria.getMascotasDAO();
        Mascotas unmascota = new Mascotas();

        ret = daoMascota.obtenerMascotasTodos();

        return ret;
    }

    /**
     * obtendrá todos los datos de un mascota concreto usando el filtro
     *
     * @param filtro tendrá relleno únicamente el atributo id, el resto de datos
     * se consultarán a la base de datos
     * @return datos de mascota concreto
     */
    public Mascotas obtenerDatosMascota(Mascotas filtro) {
        Mascotas ret = null;
        return ret;
    }

    /**
     * Creará un mascota nuevo, guardando los datos en la base de datos
     *
     * @param mascotaACrear datos de mascota
     * @return id de mascota creado.
     */
    public int crearMascota(String id, String nombre, String apellido, String telefono, String direccion, String email) {
        int ret = 0;

        DAOFactory factoria = new MysqlDAOFactory();
        MascotasDAO daoMascota = factoria.getMascotasDAO();
        Mascotas unmascota = new Mascotas();
        
        unmascota.setId_mascota(Integer.parseInt(id));
        unmascota.setNombre(nombre);
//        unmascota.setApellido(apellido);
//        unmascota.setTelefono(telefono);
//        unmascota.setDireccion(direccion);
//        unmascota.setEmail(email);
        ret = daoMascota.insertarMascota(unmascota);

        return ret;
    }

    /**
     * Realizará las acciones necesarias para modificar los datos del mascota
     * indicado
     *
     * @param mascotaAModificar mascota a cambiar
     * @return 1 si ha modificado correctamente
     */
    public int modificarMascota(String id, String nombre, String apellido, String telefono, String direccion, String email) {
        int ret = 0;
        
        DAOFactory factoria = new MysqlDAOFactory();
        MascotasDAO daoMascota = factoria.getMascotasDAO();
        Mascotas unmascota = new Mascotas();
        
        unmascota.setId_mascota(Integer.parseInt(id));
        unmascota.setNombre(nombre);
//        unmascota.setApellido(apellido);
//        unmascota.setTelefono(telefono);
//        unmascota.setDireccion(direccion);
//        unmascota.setEmail(email);
        ret = daoMascota.modificarMascota(unmascota);
        
        return ret;
    }

    /**
     * Borrará la mascota indicado
     *
     * @param mascotaABorrar tendrá relleno únicamente el id de mascota que se
     * quiere borrar
     * @return 1 si ha borrado correctamente, otro valor en caso de no borrarlo
     */
    public int borrarMascota(String id) {
        int ret = 0;
        
        DAOFactory factoria = new MysqlDAOFactory();
        MascotasDAO daoMascota = factoria.getMascotasDAO();
        Mascotas unmascota = new Mascotas();
        
        unmascota.setId_mascota(Integer.parseInt(id));
        ret = daoMascota.eliminarMascota(unmascota);
        
        return ret;
    }
}
