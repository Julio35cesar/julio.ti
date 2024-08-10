/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package had.set;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Aluno
 */
public class HadSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<String> frutas = new HashSet<>();

        frutas.add("Maça");
        frutas.add("banana");
        frutas.add("pera");
        frutas.add("Bergamota");
        frutas.add("Maça");
        frutas.add("pera");

        System.out.println(frutas);

        for (String fruta : frutas) {
            System.out.println(fruta);

        }
        
        if(frutas.contains("pera encontrada!")){
        
    }
    }

}
