/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author Hugo Martín Morales DAM2B
 */
//@Entity
//@Table(name = "Citas")
public class Citas {
    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name = "id_cita")
    private int id_cita;

    //@Column(name = "id_mascota")
    private int id_mascota;

    //@Column(name = "fecha_cita")
    private Date fecha_cita;

    //@Column(name = "hora_cita")
    private Time hora_cita;

    //@Column(name = "motivo")
    private String motivo;

    // Getters
    public int getId_cita() {
        return id_cita;
    }

    public int getId_mascota() {
        return id_mascota;
    }

    public Date getFecha_cita() {
        return fecha_cita;
    }

    public Time getHora_cita() {
        return hora_cita;
    }

    public String getMotivo() {
        return motivo;
    }

    // Setters
    public void setId_cita(int id_cita) {
        this.id_cita = id_cita;
    }

    public void setId_mascota(int id_mascota) {
        this.id_mascota = id_mascota;
    }

    public void setFecha_cita(Date fecha_cita) {
        this.fecha_cita = fecha_cita;
    }

    public void setHora_cita(Time hora_cita) {
        this.hora_cita = hora_cita;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
}
