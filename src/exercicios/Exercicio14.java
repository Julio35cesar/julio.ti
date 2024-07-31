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
public class Exercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double km;
        double dia;
        double val;
        System.out.print("Por quantos dias voce utilizou o carro? ");
        dia = teclado.nextDouble();
        System.out.print("Quantos quilometros voce percorreu com o carro? ");
        km = teclado.nextDouble();
        val = (km * 0.20) + (dia * 90);
        System.out.println("O valor final do aluguel fica R$" + val);
    }
    
}
