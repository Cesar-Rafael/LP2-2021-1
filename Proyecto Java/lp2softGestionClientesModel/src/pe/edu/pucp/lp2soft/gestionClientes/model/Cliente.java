/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.lp2soft.gestionClientes.model;
import pe.edu.pucp.lp2soft.rrhh.model.Persona;

/**
 *
 * @author Cesar-Rafael
 */
public class Cliente extends Persona {
    private Categoria categoria;

    public Cliente(Categoria categoria, int idPersona, String DNI, String nombreCompleto) {
        super(idPersona, DNI, nombreCompleto);
        this.categoria = categoria;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    
}
