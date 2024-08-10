/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foreach2;

import java.util.HashSet;

/**
 *
 * @author Aluno
 */
public class foreach5 {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("maça");
        set.add("banana");
        set.add("pera");

        for (String elemento : set) {
            System.out.println(elemento);
        }
    }
}
