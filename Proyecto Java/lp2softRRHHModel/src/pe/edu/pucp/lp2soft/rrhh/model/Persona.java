/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.lp2soft.rrhh.model;

/**
 *
 * @author Cesar-Rafael
 */
public class Persona {
    private int idPersona;
    private String DNI;
    private String nombreCompleto;

    public Persona(int idPersona, String DNI, String nombreCompleto) {
        this.idPersona = idPersona;
        this.DNI = DNI;
        this.nombreCompleto = nombreCompleto;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    
     
}
