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

    public CCempresa(Persona titular, float saldo, String Ncuenta) {
        super(titular, saldo, Ncuenta);
        this.iDescubierto = 5;
        this.mDescubierto = 0;
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

    @Override
    public String imprimir() {
        return "CUENTA EMPRESA : "+super.imprimir()+" interes descubierto : "+iDescubierto+" maximo descubierto : "+mDescubierto; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
