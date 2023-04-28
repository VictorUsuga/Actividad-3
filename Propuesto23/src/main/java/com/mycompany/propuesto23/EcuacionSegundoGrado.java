/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.propuesto23;

/**
 *
 * @author victo
 */
public class EcuacionSegundoGrado {
    public static double Solucion1 (double A , double B, double C){
    double s1;
    s1 = (-B + Math.sqrt(Math.pow(B,2)-4*A*C))/2*A;
    return s1;
    
}
    public static double Solucion2 (double A , double B, double C){
    double s1;
    s1 = (-B - Math.sqrt(Math.pow(B,2)-4*A*C))/2*A;
    return s1;
}
}