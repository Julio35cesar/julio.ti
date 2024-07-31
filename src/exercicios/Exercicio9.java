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
public class Exercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double rs;
        double us;
        System.out.print("Digite o valor que voce tem em sua carteira: R$");
        rs = teclado.nextDouble();
        us = rs / 5.45;
        System.out.println("Com o valor de R$" + rs + " voce pode comprar $" + us + " em dollar");
    }
    
}
