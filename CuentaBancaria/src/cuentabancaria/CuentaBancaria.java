/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentabancaria;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class CuentaBancaria {

    /**
     * @param args the command line arguments
     */
    public static int menu(){
        Scanner s = new Scanner(System.in);
        System.out.println("****************************************");
        System.out.println("1- Abrir una nueva cuenta");
        System.out.println("2- ver un listado de las cuentas");
        System.out.println("3- obtener los datos de una cuenta");
        System.out.println("4- Realizar un ingreso");
        System.out.println("5- Retirar dinero de una cuenta");
        System.out.println("6- Consultar el saldo");
        System.out.println("7- Salir");
        System.out.println("*****************************************");
        System.out.println("dime un numero");
        return s.nextInt();
    }
    public static void main(String[] args) {
        ArrayList<Cuenta> cuentas = new ArrayList<>();
        boolean salir=false;
        while(!salir){
           switch(menu()){
               case 1:{
                   Scanner s = new Scanner(System.in);
                   Scanner s1 = new Scanner(System.in);
                   Random r = new Random();
                    System.out.println("    1-Cuenta de ahorro");
                    System.out.println("    2-Cuenta personal");
                    System.out.println("    3-Cuenta empresa");
                    int op = s.nextInt();
                    if(op==1){
                        System.out.println("dime tu nombre");
                        String nombre=s1.nextLine();
                        System.out.println("dime tu apellido");
                        String apellido=s1.nextLine();
                        System.out.println("dime tu fecha");
                        String fecha=s1.nextLine();
                        System.out.println("dime tu saldo");
                        int saldo=s1.nextInt();
                        String num="";
                        for (int i = 0; i < 9; i++) {
                            int n = r.nextInt(9);
                            num+=n;
                        }
                        Persona p = new Persona(nombre, apellido, fecha);
                        Cahorro c = new Cahorro(p, saldo, num);
                        cuentas.add(c);
                    }else if(op==2){
                        System.out.println("dime tu nombre");
                        String nombre=s1.nextLine();
                        System.out.println("dime tu apellido");
                        String apellido=s1.nextLine();
                        System.out.println("dime tu fecha");
                        String fecha=s1.nextLine();
                        System.out.println("dime tu saldo");
                        int saldo=s1.nextInt();
                        String num="";
                        for (int i = 0; i < 9; i++) {
                            int n = r.nextInt(9);
                            num+=n;
                        }
                        Persona p = new Persona(nombre, apellido, fecha);
                        CCpersonal c = new CCpersonal(p, saldo, num);
                        cuentas.add(c);
                    }else if(op==3){
                        System.out.println("dime tu nombre");
                        String nombre=s1.nextLine();
                        System.out.println("dime tu apellido");
                        String apellido=s1.nextLine();
                        System.out.println("dime tu fecha");
                        String fecha=s1.nextLine();
                        System.out.println("dime tu saldo");
                        int saldo=s1.nextInt();
                        String num="";
                        for (int i = 0; i < 9; i++) {
                            int n = r.nextInt(9);
                            num+=n;
                        }
                        Persona p = new Persona(nombre, apellido, fecha);
                        CCempresa c = new CCempresa(p, saldo, num);
                        cuentas.add(c);
                    }else{
                        System.out.println("no has escogido ninguna opcion");
                    }
                   break;
               }
               case 2:{
                   for (int i = 0; i < cuentas.size(); i++) {
                       System.out.println(cuentas.get(i).imp());
                   }
                   break;
               }
               case 3:{
                   
                   break;
               }
               case 4:{
                   
                   break;
               }
               case 5:{
                   
                   break;
               }
               case 6:{
                   
                   break;
               }
               case 7:{
                   salir=true;
                   break;
               }
        } 
        }
        
    }
    
}
