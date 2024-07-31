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
public class Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;
        String mes;
        double salario;
        System.out.print("Nome do fucionario: ");
        nome = teclado.nextLine();
        System.out.print("Mes do pagamento: ");
        mes = teclado.nextLine();
        System.out.print("Salario do funcionario: R$");
        salario = teclado.nextDouble();
        System.out.println("O funcionario " + nome + " teve um salario de R$" + salario + " no mes de " + mes);
    }
    
}
