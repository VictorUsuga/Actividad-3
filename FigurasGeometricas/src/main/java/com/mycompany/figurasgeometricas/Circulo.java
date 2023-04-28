/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figurasgeometricas;

/**
 *
 * @author victo
 */
public class Circulo {
    int radio;
    
    public Circulo (int radio){
        this.radio = radio;   
        
    }
    
    public double CalcularArea(){
        return Math.PI*radio*radio;
    }
    public double CalcularPerimetro(){
        return 2*Math.PI*radio;
    }
}
