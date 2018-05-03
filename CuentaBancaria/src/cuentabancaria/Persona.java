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
public class Persona implements Imprimible{
    private String nombre;
    private String apellido;
    private String fecha;

    public Persona(String nombre, String apellido, String fecha) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha = fecha;
    }

    public Persona()  {
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", fecha=" + fecha + '}';
    }

    @Override
    public String imprimir() {
        return " nombre : "+nombre+" apellido : "+apellido+" fecha : "+fecha;
    }
    
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
    
}
