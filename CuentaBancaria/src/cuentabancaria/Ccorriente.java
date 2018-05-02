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

    public Ccorriente(HashMap<Integer, String> Lentidades, Persona titular, float saldo, int Ncuenta) {
        super(titular, saldo, Ncuenta);
        this.Lentidades = Lentidades;
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
