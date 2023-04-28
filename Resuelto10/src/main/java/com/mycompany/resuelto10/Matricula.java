/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.resuelto10;


public class Matricula {
    public static double CalcularMatricula(double PAT, int EST){
        double PAGMAT;
        PAGMAT = 50000;
        if ((PAT > 2000000) && (EST > 3)){
            PAGMAT = PAGMAT+ 0.03*PAT;
        }
        return PAGMAT;
    }

}


    

