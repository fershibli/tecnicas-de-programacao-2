/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fershibli.tp1.aula3.exercicio1;

/**
 *
 * @author FerShibli
 */
public class Exercicio1 {
    public static void main(String[] args) {
        int num1, num2;
        String op;
        num1 = Integer.parseInt(System.console().readLine("Digite Um Numero: "));
        op = System.console().readLine("Digite a operacao: ");
        num2 = Integer.parseInt(System.console().readLine("Digite Outro Numero: "));
        Calculadora calc = new Calculadora(num1, num2, op);
    }
}
