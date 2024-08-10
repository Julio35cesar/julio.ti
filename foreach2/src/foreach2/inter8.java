package foreach2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Aluno
 */
public class inter8 {

    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int soma = 0;

        for (int[] linha : matriz) {

            for (int elemento : linha) {
                soma += elemento;
            }
        }
        System.out.println("A soma dos elementos da matriz e: " + soma);
    }
}
