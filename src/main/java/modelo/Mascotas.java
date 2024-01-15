/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Date;

/**
 *
 * @author Hugo Martín Morales DAM2B
 */
//@Entity
public class Mascotas {
    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_mascota;

    //@ManyToOne
    //@JoinColumn(name = "id_cliente")
    private Clientes cliente;

    //@ManyToOne
    //@JoinColumn(name = "id_trabajador")
    private Usuarios trabajador;

    private String nombre;
    private String especie;
    private String raza;
    private Date fecha_nacimiento;

    // Getters y setters
    public int getId_mascota() {
        return id_mascota;
    }

    public void setId_mascota(int id_mascota) {
        this.id_mascota = id_mascota;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public Usuarios getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Usuarios trabajador) {
        this.trabajador = trabajador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    @Override
    public String toString() {
        return "Mascotas{" +
                "id_mascota=" + id_mascota +
                ", cliente=" + cliente +
                ", trabajador=" + trabajador +
                ", nombre='" + nombre + '\'' +
                ", especie='" + especie + '\'' +
                ", raza='" + raza + '\'' +
                ", fecha_nacimiento=" + fecha_nacimiento +
                '}';
    }
}
