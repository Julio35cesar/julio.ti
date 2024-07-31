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
public class Exercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double s;
        double b;
        double sb;
        System.out.print("Digite o seu salario: R$");
        s = teclado.nextDouble();
        b = (s * 15) / 100;
        sb = s + b;
        System.out.println("O seu salario com bonus de 15% fica R$" + sb);
    }
    
}
