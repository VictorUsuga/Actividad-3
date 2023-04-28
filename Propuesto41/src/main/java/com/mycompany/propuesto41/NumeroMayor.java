/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.propuesto41;
import java.util.Arrays;
/**
 *
 * @author victo
 */
public class NumeroMayor {
    String Texto;
    
    public NumeroMayor( String Texto){  
        this.Texto = Texto;
    }
    
    public int CalcularMayor(){
        Texto = Texto.trim();
        String [] A= Texto.split("\n");
        int n = A.length, Z;
        int Arreglo [] = new int[n];
                
        for (int i=0; i<n; i++){
            Z=Integer.parseInt(A[i]);
            Arreglo[i]=Z;  
        }
        Arrays.sort(Arreglo);
        
        return Arreglo[n-1]; 
    }
    
}
