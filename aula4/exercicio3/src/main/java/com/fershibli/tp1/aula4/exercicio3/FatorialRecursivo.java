/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fershibli.tp1.aula4.exercicio3;

/**
 *
 * @author Alunos
 */ 
public class FatorialRecursivo {
    public static int Calcular(int n) {
        if (n==0 || n==1) {
            return 1;
        }
        int resultado = n*Calcular(n-1);
        System.out.println("Fatorial de "+n+" e = "+resultado);
        return resultado;
    }
}
