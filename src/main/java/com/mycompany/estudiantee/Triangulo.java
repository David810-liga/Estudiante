/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estudiantee;

public class Triangulo extends FiguraGeometricaH {
    private int idTriangulo;
    private double base;
    private double altura;

    // Constructor vacío
    public Triangulo() {
    }

    // Constructor con parámetros
    public Triangulo(int idTriangulo, double base, double altura) {
        this.idTriangulo = idTriangulo;
        this.base = base;
        this.altura = altura;
    }

    // Constructor que incluye los atributos de la clase padre
    public Triangulo(int idTriangulo, double base, double altura, int idFiguraGeometrica, String nombre, double area, double perimetro) {
        super(idFiguraGeometrica, nombre, area, perimetro);
        this.idTriangulo = idTriangulo;
        this.base = base;
        this.altura = altura;
    }

    // Getters y Setters
    public int getIdTriangulo() {
        return idTriangulo;
    }

    public void setIdTriangulo(int idTriangulo) {
        this.idTriangulo = idTriangulo;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Método para calcular área y perímetro
    public void calcular() {
        setArea((base * altura) / 2);
        // Suponiendo triángulo equilátero para el perímetro
        setPerimetro(base * 3);
    }

    // Mostrar resultados
    @Override
    public String toString() {
        return "Datos del Triángulo\n" +
                "Nombre: " + getNombre() + "\n" +
                "Base: " + base + "\n" +
                "Altura: " + altura + "\n" +
                "Área: " + getArea() + "\n" +
                "Perímetro: " + getPerimetro();
    }
}

