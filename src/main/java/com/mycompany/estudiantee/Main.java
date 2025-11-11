/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estudiantee;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        Estudiante e=new Estudiante("David", "1005069875", "0999466053", "Los Ceibos", true);
        e.imprimir();
        
        Estudiante e1=new Estudiante();
        e1.setNombre("Oscar");
        e1.imprimir();
    }
}
