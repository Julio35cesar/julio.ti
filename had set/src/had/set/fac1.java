/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package had.set;

import java.util.HashSet;

/**
 *
 * @author Aluno
 */
public class fac1 {

    public static void main(String[] args) {
        HashSet<Integer> numeros = new HashSet<>();
        
        for(int i = 1;  i <= 10; i++) {
            numeros.add(i);
        }
        int numeroVerificar = 5;
        if (numeros.contains(numeroVerificar)) {
            System.out.println("O numero " + numeroVerificar + " esta presente no conjunto");
        }else{
            System.out.println("O numero " + numeroVerificar + " nao esta presente no conjunto");
        }
    }
}