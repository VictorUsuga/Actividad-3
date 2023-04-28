/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figurasgeometricas;

/**
 *
 * @author victo
 */
public class Cuadrado {
    int lado;
    
    public Cuadrado(int lado){
        this.lado = lado;
    }
    
    public double CalcuarArea(){
        return lado*lado;
    }
    
    public double CalcularPerimetro(){
        return (4*lado);
    }
    
}
