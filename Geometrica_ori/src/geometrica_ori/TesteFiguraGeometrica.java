/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package geometrica_ori;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author julio
 */
public class TesteFiguraGeometrica {
    public static void main(String[] args) {
        
        FiguraGeometrica circulo = new Circulo(5);
        FiguraGeometrica retangulo = new Retangulo(4, 6);

        List<FiguraGeometrica> figuras = new ArrayList<>();
        figuras.add(circulo);
        figuras.add(retangulo);

        for (FiguraGeometrica figura : figuras) {
            System.out.println("Área: " + figura.calcularArea());
            System.out.println("Perímetro: " + figura.calcularPerimetro());
            System.out.println();
        }
    }
}