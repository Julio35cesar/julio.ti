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
public class Exercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double lar;
        double alt;
        double ar;
        double tin;
        System.out.print("Qual a largura da parede em metros: ");
        lar = teclado.nextDouble();
        System.out.print("Qual a altura da parede em metros: ");
        alt = teclado.nextDouble();
        ar = lar * alt;
        tin = ar / 2;
        System.out.println("Em uma parede de " + ar + " metros quadrados precisaria de " + tin + " litros de tinta para pinta-la");
    }
    
}
