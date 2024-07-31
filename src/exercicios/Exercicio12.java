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
public class Exercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double p;
        double pp;
        System.out.print("Valor do produto: R$");
        p = teclado.nextDouble();
        pp = (p * 5) / 100;
        System.out.println("Valor com desconto: R$" + pp);
    }
    
}
