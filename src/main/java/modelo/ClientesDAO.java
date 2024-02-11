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
    //insertar un cliente
    public int insertarCliente(Clientes uncliente);
    //modificar un cliente
    public int modificarCliente(Clientes uncliente);
    //eliminar un cliente
    public int eliminarCliente(Clientes uncliente);
}
