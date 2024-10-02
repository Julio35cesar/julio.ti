/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal_ori;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author julio
 */
public class TesteAnimal {
    public static void main(String[] args) {
     
        Animal cachorro = new Cachorro("Rex");
        Animal gato = new Gato("Felix");
        Animal passaro = new Passaro("Blu");

   
        List<Animal> animais = new ArrayList<>();
        animais.add(cachorro);
        animais.add(gato);
        animais.add(passaro);

      
        for (Animal animal : animais) {
            animal.emitirSom();
        }
    }
}
