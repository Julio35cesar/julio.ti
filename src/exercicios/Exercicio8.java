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
public class Exercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double mm;
        double cm;
        double m;
        double km;
        double mi;
        double ft;
        System.out.print("Digite uma media em metros: ");
        m = teclado.nextDouble();
        cm = m * 100;
        mm = m * 1000;
        km = m / 1000;
        ft = m * 3.2808;
        System.out.println("A distancia de " + m + "m corresponde a:");
        System.out.println("Pes = " + ft + "ft");
        System.out.println("Quilometros = " + km + "km");
        System.out.println("Centimetros = " + cm + "cm");
        System.out.println("Milimetros = " + mm + "mm");
    }
    
}
