/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

/**
 *
 * @author TI
 */
public class exec200 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int B = 0;
        for (int i : A) {
            B += i;
            System.out.println(i);
        }
        System.out.println("A soma deu " + B);
    }
}
