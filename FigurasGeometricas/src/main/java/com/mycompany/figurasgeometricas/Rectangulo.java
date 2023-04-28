/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figurasgeometricas;

/**
 *
 * @author victo
 */
public class Rectangulo {
    int base, altura;
    
    public Rectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    
    public double CalcularArea(){
        return base*altura;
    }
    
    public double CalcularPerimetro(){
        return 2*(base+altura);
    }
}
