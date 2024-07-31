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
public class Exercicio53 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);
        int id[] = new int[1];
        String sex[] = new String[1];
        double val[] = new double[5];
        int contF = 0;
        int contM = 0;
        int cont20 = 0;
        // contM = homens
        // contF = mulheres
        // val[4] = media grupo
        // val[5] = media masculina
        // cont20 = mulheres acima de 20
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a sua idade: ");
            id[i] = teclado.nextInt();
            System.out.print("Digite o seu sexo (F/M): ");
            sex[i] = teclado2.nextLine();
            val[1] += id[i];
            val[4] = val[1] / 5;
            if (sex[i].equals ("m")) {
                val[2] += id[i];
                contM++;
            }
            if (sex[i].equals ("f")) {
                val[3] += id[i];
                contF++;
            }
            if (sex[i].equals ("f") && id[i] > 20) {
                cont20++;
            }
        }
        val[5] = val[2] / contM;
        System.out.println("Foram cadastrados " + contM + " homens");
        System.out.println("Foram cadastradas " + contF + " mulheres");
        System.out.println("A media de idade do grupo e: " + val[4]);
        System.out.println("A media de idade dos homens e: " + val[5]);
        System.out.println("Tem " + cont20 + " mulheres acima de 20 anos");
    }
}