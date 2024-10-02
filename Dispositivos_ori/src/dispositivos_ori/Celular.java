/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dispositivos_ori;

/**
 *
 * @author julio
 */
public class Celular implements DispositivoEletronico {
    private boolean ligado;

    @Override
    public void ligar() {
        ligado = true;
        System.out.println("Celular ligado.");
    }

    @Override
    public void desligar() {
        ligado = false;
        System.out.println("Celular desligado.");
    }

    @Override
    public String obterStatus() {
        return ligado ? "Celular está ligado." : "Celular está desligado.";
    }
}

