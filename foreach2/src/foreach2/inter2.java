/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foreach2;

import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public class inter2 {

    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("julia");
        nomes.add("pedra");
        nomes.add("Otario");
        nomes.add("O vasco");
        nomes.add("Osvaldo");

        int count = 0;

        for (String nome : nomes) {
            if (nome.startsWith("O")) {
                count++;
            }
        }
        
        System.out.println("quantidate de nomes que começam com 'O': " + count);
    }
}
