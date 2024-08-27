/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fershibli.tp1.aula3.exercicio2;

/**
 *
 * @author FerShibli
 */
public class Exercicio2 {
    
    public static void main(String[] args) {

        int num1, num2;		// Definindo uma variável do tipo inteiro

        double total;

        String op;

        num1 = Integer.parseInt(System.console().readLine("Digite Um Numero: "));

        op = System.console().readLine("Digite a operacao: ");

        num2 = Integer.parseInt(System.console().readLine("Digite Outro Numero: "));

        if ("+".equals(op)){  // Comparação de texto

            total = num1 + num2;

            System.out.printf ("A soma de "+num1+" + "+num2+" = "+total);

        }

        if ("-".equals(op)){  // Comparação de texto

            total = num1 - num2;

            System.out.printf ("A subtração de "+num1+" - "+num2+" = "+total);

        }

        if ("*".equals(op)){  // Comparação de texto

            total = num1 * num2;

            System.out.printf ("A multiplicacao de "+num1+" * "+num2+" = "+total);

        }

        if ("/".equals(op)){  // Comparação de texto

            if (num2>0){

                total = num1 / num2;

                System.out.printf ("A divisao de "+num1+" / "+num2+" = "+total);

            }

            else

            {

                System.out.printf ("Nao posso dividir por zero");

            }

        }

        if ("^".equals(op)){  // Comparação de texto

            total = (double) Math.pow(num1,num2);

            System.out.printf ("A potencia de "+num1+" ^ "+num2+" = "+total);

        }

    }
}
