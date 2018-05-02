/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentabancaria;

/**
 *
 * @author alumno
 */
public class Cahorro extends Cuenta{
    private double interes;

    public Cahorro(double interes, Persona titular, float saldo, int Ncuenta) {
        super(titular, saldo, Ncuenta);
        this.interes = interes;
    }

    /**
     * @return the interes
     */
    public double getInteres() {
        return interes;
    }

    /**
     * @param interes the interes to set
     */
    public void setInteres(double interes) {
        this.interes = interes;
    }
    
    
}
