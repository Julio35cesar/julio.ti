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
public class Data {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        String mes;
        int mm;
        int ano;
        int cal;
        int id;
        System.out.print("Qual o seu mes de nascimento? ");
        mes = teclado.nextLine();
        System.out.print("Qual o seu ano de nascimento? ");
        ano = teclado.nextInt();
        cal = ano - 2024;
        id = cal * 12;
        if (mes == "janeiro") {
            mm = 1;
        } else if (mes == "fevereiro") {
            mm = 2;
        } else if (mes == "março") {
            mm = 3;
        } else if (mes == "abril") {
            mm = 4;
        } else if (mes == "maio") {
            mm = 5;
        } else if (mes == "junho") {
            mm = 6;
        } else if (mes == "julho") {
            mm = 7;
        } else if (mes == "agosto") {
            mm = 8;
        } else if (mes == "setembro") {
            mm = 9;
        } else if (mes == "outubro") {
            mm = 10;
        } else if (mes == "novembro") {
            mm = 11;
        } else {
            mm = 12;
        }
        
        if (id + (mm - id) < 216 {
            System.out.println("Voce nao e maior de idade");
        } else {
            System.out.println("Voce e maior de idade");
        }
    }
}
