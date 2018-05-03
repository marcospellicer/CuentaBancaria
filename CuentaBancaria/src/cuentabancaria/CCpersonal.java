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
public class CCpersonal  extends Ccorriente{
  private double Cmantenimiento;

    public CCpersonal(Persona titular, float saldo, String Ncuenta) {
        super(titular, saldo, Ncuenta);
        this.Cmantenimiento = 5;
    }

    /**
     * @return the Cmantenimiento
     */
    public double getCmantenimiento() {
        return Cmantenimiento;
    }

    /**
     * @param Cmantenimiento the Cmantenimiento to set
     */
    public void setCmantenimiento(double Cmantenimiento) {
        this.Cmantenimiento = Cmantenimiento;
    }

    @Override
    public String imprimir() {
        return "CUENTA PERSONAL : "+super.imprimir()+" Cuota mantenimiento : "+Cmantenimiento; //To change body of generated methods, choose Tools | Templates.
    }

  
}
