/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.List;
import modelo.entidades.Clientes;

/**
 *
 * @author HUGO MARTÍN MORALES DAM2B
 */
public interface ClientesDAO {
    
    //obtener todos los clientes
    public List<Clientes> obtenerClientesTodos();
    /**
     * Obtiene datos del cliente concreto
     * @param clienteFiltro tendrá relleno únicamente el atributo id del cliente a buscar
     * @return bean con los datos rellenos
     */
    public Clientes obtenerCliente(Clientes clienteFiltro);
    //insertar un cliente
    public int insertarCliente(Clientes uncliente);
    //modificar un cliente
    public int modificarCliente(Clientes uncliente);
    //eliminar un cliente
    public int eliminarCliente(Clientes uncliente);
}
