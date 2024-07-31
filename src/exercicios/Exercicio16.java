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
public class Exercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dia;
        int ano;
        float min;
        float tmp;
        System.out.print("Quantos cigarros voce fuma por dia? ");
        dia = teclado.nextInt();
        System.out.print("Por quantos anos voce fuma? ");
        ano = teclado.nextInt();
        min = (dia * 10) * 365;
        tmp = ((min / 60) / 24) * ano;
        System.out.println("Voce perdeu " + tmp + " dias de vida ate o momento");
    }
    
}
