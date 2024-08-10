/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package switchcas;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class swi2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma nota de 0 a 10");
        int nota = scanner.nextInt();
        char classificacao;

        switch (nota) {
            case 10:
            case 9:
                classificacao = 'A';
                break;
            case 8:
            case 7:
                classificacao = 'B';
                break;
            case 6:
            case 5:
                classificacao = 'C';
                break;
            case 4:
            case 3:
                classificacao = 'D';
                break;
            case 2:
            case 1:
            case 0:
                classificacao = 'F';
                break;
            default:
                System.out.println("Nota invalida! ");
                return;
        }
        System.out.println("A classificacao da nota " + nota + " e:" + classificacao);
    }
}
