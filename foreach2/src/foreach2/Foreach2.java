/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package foreach2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class Foreach2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("julio");
        lista.add("pedro");
        lista.add("mica");
        for(String str : lista){
            System.out.println(str.toUpperCase());
            
        }
    }

}
