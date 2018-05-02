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
public class CCempresa extends Ccorriente{
    private double iDescubierto;
    private float mDescubierto;

    public CCempresa(double iDescubierto, float mDescubierto, HashMap<Integer, String> Lentidades, Persona titular, float saldo, int Ncuenta) {
        super(Lentidades, titular, saldo, Ncuenta);
        this.iDescubierto = iDescubierto;
        this.mDescubierto = mDescubierto;
    }

    /**
     * @return the iDescubierto
     */
    public double getiDescubierto() {
        return iDescubierto;
    }

    /**
     * @param iDescubierto the iDescubierto to set
     */
    public void setiDescubierto(double iDescubierto) {
        this.iDescubierto = iDescubierto;
    }

    /**
     * @return the mDescubierto
     */
    public float getmDescubierto() {
        return mDescubierto;
    }

    /**
     * @param mDescubierto the mDescubierto to set
     */
    public void setmDescubierto(float mDescubierto) {
        this.mDescubierto = mDescubierto;
    }
    
    
    
}
