/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package foratividade;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Foratividade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantas notas voce deseja inserir? ");
        int qtdNotas = teclado.nextInt();
        double somaNotas = 0;

        for (int i = 1; i <= qtdNotas; i++) {

            System.out.println("Digite a nota " + i + ":");
            double nota = teclado.nextDouble();
            somaNotas += nota;
        }
        double media = somaNotas / qtdNotas;
        System.out.println("A media de notas e: " + media);
        teclado.close();

    }
}
