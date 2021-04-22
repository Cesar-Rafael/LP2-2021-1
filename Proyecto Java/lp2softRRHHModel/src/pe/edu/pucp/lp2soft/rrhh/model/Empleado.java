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
public class Empleado extends Persona {
    private String cargo;
    private double sueldo;
    private Area area;

    public Empleado(String cargo, double sueldo, int idPersona, String DNI, String nombreCompleto) {
        super(idPersona, DNI, nombreCompleto);
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }
    
    
}
