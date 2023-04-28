/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.propuesto19;

/**
 *
 * @author victo
 */
public class TrianguloEquilatero {
   public static double Perimetro(double Lado){
   double P;
   P = Lado*3;
   return P;
   }
    
   public static double Altura(double Lado){
   double A;
   A = (Math.sqrt(3)*Lado)/2;
   return A;
   }
   
   public static double Area(double Lado, double  Altura){
   double Area;
   Area = Lado*Altura/2;
   return Area;
   }
    
}
