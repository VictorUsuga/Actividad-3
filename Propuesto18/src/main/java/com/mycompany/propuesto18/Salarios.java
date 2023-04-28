/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.propuesto18;

/**
 *
 * @author victo
 */
public class Salarios {
    public static double SalarioBruto(int NumH, double Valor){
        double S;
        S=NumH*Valor;
        return S;
    }
    
    public static double SalarioNeto(int NumH, double Valor, double RetencionF){
        double R, K;
        R= (NumH*Valor)* (RetencionF/100);
        K = (NumH*Valor)-R;
        return K;
        
    }
}
