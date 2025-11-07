/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estudiantee;

/**
 *
 * @author User
 */
public class Estudiantee {
    private String nombre;
    private String cedula;
    private String telefono;
    private String direccion;
    
   public Estudiantee(){
   }

    public Estudiantee(String nombre, String cedula, String telefono, String direccion) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Datos del Estudiantee"+"\n"+"Nombre: "+getNombre()+"\n"+
                "Cedula: "+getCedula()+"\n"+
                "Telefono: "+getTelefono()+"\n"+
                "Direccion: "+getDireccion()+"\n"
                ;

    
    }
}
