/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class Exercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double a;
        double b;
        double c;
        double res;
        System.out.println("Digite os valores ");
        System.out.print("Valor de A: ");
        a = teclado.nextDouble();
        System.out.print("Valor de B: ");
        b = teclado.nextDouble();
        System.out.print("Valor de C: ");
        c = teclado.nextDouble();
        res = (Math.sqrt(Math.pow(b, 2)-4*a*c));
        System.out.println("O valor de delta e: " + res);
    }
    
}
