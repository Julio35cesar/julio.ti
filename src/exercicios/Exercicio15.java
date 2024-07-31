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
public class Exercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double dia;
        double sal;
        System.out.print("Quantos dias voce trabalhou neste mes? ");
        dia = teclado.nextDouble();
        sal = dia * (8 * 25);
        System.out.println("O seu salario neste mes e de R$" + sal);
    }
    
}
