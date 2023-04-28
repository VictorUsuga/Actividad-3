/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figurasgeometricas;

/**
 *
 * @author victo
 */
public class TrianguloRectangulo {
    int base, altura;
    
    public TrianguloRectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    
    public double CalcularArea(){
        return (base*altura/2);
    }
    
    public double CalcularPerimetro(){
        return (base+altura+CalcularHipotenusa());
    }
    
    public double CalcularHipotenusa(){
        return Math.pow(base*base+altura*altura, 0.5);
    }
    
    public String TipoTriangulo(){
        if ((base == altura) && (base == CalcularHipotenusa()) && (altura==CalcularHipotenusa())){
            return "Es un triángulo equilatero";
        } else if (base != CalcularHipotenusa() && (base!=CalcularHipotenusa()) && (altura != CalcularHipotenusa())) {
            return "Es un triángulo escaleno";
        } else {
            return "Es un triángulo isóceles";
        }
    }
}
