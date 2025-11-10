/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estudiantee;

/**
 *
 * @author hp
 */
public class FiguraGeometricaH {
   private int idFiguraGeometrica;
   private String nombre;
   private double area;
   private double perimetro;

    public FiguraGeometricaH() {
    }

    public FiguraGeometricaH(int idFiguraGeometrica, String nombre, double area, double perimetro) {
        this.idFiguraGeometrica = idFiguraGeometrica;
        this.nombre = nombre;
        this.area = area;
        this.perimetro = perimetro;
    }

    public int getIdFiguraGeometrica() {
        return idFiguraGeometrica;
    }

    public void setIdFiguraGeometrica(int idFiguraGeometrica) {
        this.idFiguraGeometrica = idFiguraGeometrica;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    @Override
    public String toString() {
        return "Id:"+idFiguraGeometrica+"\n"+
                "Nombre:"+nombre+"\n"+
                "Area:"+area+"\n"+
                "Perimetro:"+perimetro;}
   
   
}
