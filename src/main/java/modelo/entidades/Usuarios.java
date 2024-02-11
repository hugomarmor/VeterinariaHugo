/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.entidades;

/**
 *
 * @author HUGO MARTÍN MORALES DAM2B
 */
//@Entity
public class Usuarios {
    //clase USUARIOS
    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_trabajador;

    private String nombre_trabajador;
    private String contraseña;
    private String email_trabajador;
    private String rol;

    //Getters y setters
    public int getId_trabajador() {
        return id_trabajador;
    }

    public void setId_trabajador(int id_trabajador) {
        this.id_trabajador = id_trabajador;
    }

    public String getNombre_trabajador() {
        return nombre_trabajador;
    }

    public void setNombre_trabajador(String nombre_trabajador) {
        this.nombre_trabajador = nombre_trabajador;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getEmail_trabajador() {
        return email_trabajador;
    }

    public void setEmail_trabajador(String email_trabajador) {
        this.email_trabajador = email_trabajador;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Usuarios{" +
                "id_trabajador=" + id_trabajador +
                ", nombre_trabajador='" + nombre_trabajador + '\'' +
                ", contraseña='" + contraseña + '\'' +
                ", email_trabajador='" + email_trabajador + '\'' +
                ", rol='" + rol + '\'' +
                '}';
    }
}
