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

    public CCpersonal(double Cmantenimiento, HashMap<Integer, String> Lentidades, Persona titular, float saldo, int Ncuenta) {
        super(Lentidades, titular, saldo, Ncuenta);
        this.Cmantenimiento = Cmantenimiento;
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
  
  
}
