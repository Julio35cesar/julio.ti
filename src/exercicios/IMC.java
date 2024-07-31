/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class IMC {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        double alt;
        double pes;
        double imc;
        System.out.print("Qual a sua altura em metros? ");
        alt = teclado.nextDouble();
        System.out.print("Qual o seu peso em quilogramas? ");
        pes = teclado.nextDouble();
        imc = pes / (alt * alt);
        if (imc < 17){
            System.out.print("Voce esta MUITO abaixo do peso!" + " IMC: " + imc);
        } else if (imc >= 17 && imc < 18.5) {
                System.out.print("Voce esta abaixo do peso ideal." + " IMC: " + imc);
        } else if (imc >= 18.5 && imc < 25) {
                System.out.print("Voce esta no peso ideal!" + " IMC: " + imc);
        } else if (imc >= 25 && imc < 30) {
                System.out.print("Voce esta acima do peso dieal." + " IMC: " + imc);
        } else if (imc >= 30 && imc < 35) {
                System.out.print("Voce esta com obesidade." + " IMC: " + imc); 
        } else if (imc >= 35 && imc < 40) {
                System.out.print("Voce esta com obesidade severa!" + " IMC: " + imc);
        } else if (imc >= 40) {
                System.out.print("Voce esta com obesidade MORBIDA!" + " IMC: " + imc);
        }
    }
}
