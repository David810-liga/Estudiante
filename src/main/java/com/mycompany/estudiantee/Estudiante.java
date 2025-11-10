/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estudiantee;

/**
 *
 * @author User
 */
public class Estudiante {
   private String nombre;
   private String cedula;
   private String telefono;
   private String direccion;
   private boolean genero;//true-M, false-F
    public Estudiante() {
    }

    public Estudiante(String nombre, String cedula, String telefono, String direccion, boolean genero) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.direccion = direccion;
        this.genero = genero;
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
    public boolean getGenero() {
        return genero;
    }

    public void setGenero(boolean genero) {
        this.genero = genero;
    }
    
    //METODOS DE LÓGICA DE NEGOCIO 
    //VALIDAR EL GÉNERO
        public String validarGenero(){
        if(genero==true){
            return "Masculino";
        }else{
            return "Femenino";
        }
    }
        
    @Override
    public String toString() {
        return "Datos del Estudiante"+"\n"+
                "Nombre: "+getNombre()+"\n"+
                "Cedula: "+getCedula()+"\n"+
                "Direccion: "+getDireccion()+"\n"+
                "Telefono: "+getTelefono()+"\n"+
                "Género:"+getGenero();}
   
    //DE NO RETORNO
    public void imprimir(){
        System.out.println("DATOS PERSONALES"+"\n"+
                "Nombres:"+this.nombre+"\n"+
                "Cédula:"+cedula+"\n"+
                "Dirección:"+getDireccion()+"\n"+
                "Teléfono:"+getTelefono()+"\n"+
                "Género:"+this.validarGenero());
                
    }
    
    //RETORNO
    public String imprimirEstudiante(){
         return "DATOS PERSONALES"+"\n"+
                "Nombres:"+this.nombre+"\n"+
                "Cédula:"+cedula+"\n"+
                "Dirección:"+getDireccion()+"\n"+
                "Teléfono:"+getTelefono()+"\n"+
                "Género:"+validarGenero();
                
    }
}
