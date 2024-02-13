/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import modelo.ClientesDAO;
import modelo.DAOFactory;
import modelo.entidades.Clientes;
import modelo.impl.MysqlDAOFactory;

/**
 *
 * @author HUGO MARTÍN MORALES DAM2B
 */
public class ClientesControlador {

    /**
     * Obtiene la lista de clientes
     *
     * @param filtro tendrá los atributos que se utilizarán para la consulta a
     * la base de datos
     * @return lista de cliente encontradas
     */
    public List<Clientes> obtenerListaClientes(Clientes filtro) {
        List<Clientes> ret = null;

        DAOFactory factoria = new MysqlDAOFactory();
        ClientesDAO daoCliente = factoria.getClientesDAO();
        Clientes uncliente = new Clientes();

        ret = daoCliente.obtenerClientesTodos();

        return ret;
    }

    /**
     * obtendrá todos los datos de un cliente concreto usando el filtro
     *
     * @param filtro tendrá relleno únicamente el atributo id, el resto de datos
     * se consultarán a la base de datos
     * @return datos de cliente concreto
     */
    public Clientes obtenerDatosCliente(Clientes filtro) {
        Clientes ret = null;
        return ret;
    }

    /**
     * Creará un cliente nuevo, guardando los datos en la base de datos
     *
     * @param clienteACrear datos de cliente
     * @return id de cliente creado.
     */
    public int crearCliente(String id, String nombre, String apellido, String telefono, String direccion, String email) {
        int ret = 0;

        DAOFactory factoria = new MysqlDAOFactory();
        ClientesDAO daoCliente = factoria.getClientesDAO();
        Clientes uncliente = new Clientes();
        
        uncliente.setId_cliente(Integer.parseInt(id));
        uncliente.setNombre(nombre);
        uncliente.setApellido(apellido);
        uncliente.setTelefono(telefono);
        uncliente.setDireccion(direccion);
        uncliente.setEmail(email);
        ret = daoCliente.insertarCliente(uncliente);

        return ret;
    }

    /**
     * Realizará las acciones necesarias para modificar los datos del cliente
     * indicado
     *
     * @param clienteAModificar cliente a cambiar
     * @return 1 si ha modificado correctamente
     */
    public int modificarCliente(String id, String nombre, String apellido, String telefono, String direccion, String email) {
        int ret = 0;
        
        DAOFactory factoria = new MysqlDAOFactory();
        ClientesDAO daoCliente = factoria.getClientesDAO();
        Clientes uncliente = new Clientes();
        
        uncliente.setId_cliente(Integer.parseInt(id));
        uncliente.setNombre(nombre);
        uncliente.setApellido(apellido);
        uncliente.setTelefono(telefono);
        uncliente.setDireccion(direccion);
        uncliente.setEmail(email);
        ret = daoCliente.modificarCliente(uncliente);
        
        return ret;
    }

    /**
     * Borrará el cliente indicado
     *
     * @param clienteABorrar tendrá relleno únicamente el id de cliente que se
     * quiere borrar
     * @return 1 si ha borrado correctamente, otro valor en caso de no borrarlo
     */
    public int borrarCliente(String id) {
        int ret = 0;
        
        DAOFactory factoria = new MysqlDAOFactory();
        ClientesDAO daoCliente = factoria.getClientesDAO();
        Clientes uncliente = new Clientes();
        
        uncliente.setId_cliente(Integer.parseInt(id));
        ret = daoCliente.eliminarCliente(uncliente);
        
        return ret;
    }
}
