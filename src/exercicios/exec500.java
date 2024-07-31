/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

/**
 *
 * @author TI
 */
public class exec500 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int cont = 0;
        double[] B = new double[3];
        for (int i : A) {
            cont++;
            B[1] += i;
        }
        B[2] = B[1] / cont;
        System.out.println("A media dos numeros e: " + B[2]);
    }
}
