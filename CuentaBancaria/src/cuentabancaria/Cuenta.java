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
public class Cuenta implements Imprimible{
    private Persona titular;
    private float saldo;
    private String Ncuenta;

    public Cuenta() {
    }

    public Cuenta(Persona titular, float saldo, String Ncuenta) {
        this.titular = titular;
        this.saldo = saldo;
        this.Ncuenta = Ncuenta;
    }

    @Override
    public String imprimir() {
        return" titula : "+titular.imprimir()+" saldo : "+saldo+" Numero de cuenta : "+Ncuenta;
    }
    
    public String imp(){
        return" titula : "+titular.imprimir()+" saldo : "+saldo+" Numero de cuenta : "+Ncuenta;
    }
    
    
    
}
