/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figurasgeometricas;

/**
 *
 * @author victo
 */
public class Rombo {
    private int diagonalMayor;
    private int diagonalMenor;
    private int lado;

    public Rombo(int diagonalMayor, int diagonalMenor, int lado) {
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
        this.lado = lado;
    }

    public double CalcularArea() {
        return (diagonalMayor * diagonalMenor) / 2;
    }

    public double CalcularPerimetro() {
        return 4 * lado;
    }
}
