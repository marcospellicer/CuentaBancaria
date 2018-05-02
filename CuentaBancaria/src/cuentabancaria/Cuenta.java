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
public class Cuenta {
    private Persona titular;
    private float saldo;
    private int Ncuenta;

    public Cuenta() {
    }

    public Cuenta(Persona titular, float saldo, int Ncuenta) {
        this.titular = titular;
        this.saldo = saldo;
        this.Ncuenta = Ncuenta;
    }
    
    
    
}
