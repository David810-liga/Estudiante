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
   private static int idEstudiante = 100;
   private static String carrera = "T. S. Desarrollo de Software";
   private String nombre;
   private String cedula;
   private String telefono;
   private String direccion;
   private boolean genero;//true-M, false-F
   
   public static String getCarrera() {
        return carrera;
    }
   public Estudiante() {
       idEstudiante++;
       getCarrera();
    }

    public Estudiante( String nombre, String cedula, String telefono, String direccion, boolean genero) {
        this.idEstudiante = idEstudiante +1;
        getCarrera();
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.direccion = direccion;
        this.genero = genero;
    }

    public static int getIdEstudiante() {
        return idEstudiante;
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
                "IdEstudiante:"+getIdEstudiante()+"\n"+
                "Nombre: "+getNombre()+"\n"+
                "Cedula: "+getCedula()+"\n"+
                "Direccion: "+getDireccion()+"\n"+
                "Telefono: "+getTelefono()+"\n"+
                "Género:"+getGenero();}
   
    //DE NO RETORNO
    public void imprimir(){
        System.out.println("DATOS PERSONALES"+"\n"+
                "IdEstudiante:"+this.idEstudiante+"\n"+
                "Carrera:"+carrera+"\n"+
                "Nombres:"+this.nombre+"\n"+
                "Cédula:"+cedula+"\n"+
                "Dirección:"+getDireccion()+"\n"+
                "Teléfono:"+getTelefono()+"\n"+
                "Género:"+this.validarGenero());
                
    }
    
    //RETORNO
    public String imprimirEstudiante(){
         return "DATOS PERSONALES"+"\n"+
                "IdEstudiante:"+this.idEstudiante+"\n"+
                "Nombres:"+this.nombre+"\n"+
                "Cédula:"+cedula+"\n"+
                "Dirección:"+getDireccion()+"\n"+
                "Teléfono:"+getTelefono()+"\n"+
                "Género:"+validarGenero();
                
    }
}
