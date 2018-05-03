/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentabancaria;

import java.util.HashMap;

/**
 *
 * @author alumno
 */
public abstract class Ccorriente  extends Cuenta{
    private HashMap<Integer,String> Lentidades;

    public Ccorriente(Persona titular, float saldo, String Ncuenta) {
        super(titular, saldo, Ncuenta);
        this.Lentidades= new HashMap<>();
        this.Lentidades.put(0, "Santander");
        this.Lentidades.put(1, "BBVA");
        this.Lentidades.put(2, "Ibercaja");
    }

    /**
     * @return the Lentidades
     */
    public HashMap<Integer,String> getLentidades() {
        return Lentidades;
    }

    /**
     * @param Lentidades the Lentidades to set
     */
    public void setLentidades(HashMap<Integer,String> Lentidades) {
        this.Lentidades = Lentidades;
    }
    
    
}
