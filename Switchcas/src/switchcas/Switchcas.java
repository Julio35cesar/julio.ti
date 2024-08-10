/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switchcas;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Switchcas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite um numero de 1 a 7: ");
        int dia = scanner.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                 break;
            case 2:
                System.out.println("Segunda");
                 break;
            case 3:
                System.out.println("Terça");
                 break;
            case 4:
                System.out.println("Quarta");
                 break;
            case 5:
                System.out.println("Quinta");
                 break;
            case 6:
                System.out.println("Sexta");
                break;
                
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Numero ivalido!Por favor, digite um numero de 1 a 7");
                break;
        }
        scanner.close();
    }

}
