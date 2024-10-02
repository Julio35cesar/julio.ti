/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dispositivos_ori;

/**
 *
 * @author julio
 */
import java.util.ArrayList;
import java.util.List;

public class TesteDispositivoEletronico {
    public static void main(String[] args) {
        
        DispositivoEletronico televisao = new Televisao();
        DispositivoEletronico radio = new Radio();
        DispositivoEletronico celular = new Celular();

        List<DispositivoEletronico> dispositivos = new ArrayList<>();
        dispositivos.add(televisao);
        dispositivos.add(radio);
        dispositivos.add(celular);

        for (DispositivoEletronico dispositivo : dispositivos) {
            dispositivo.ligar();
            System.out.println(dispositivo.obterStatus());
        }

        System.out.println();

        for (DispositivoEletronico dispositivo : dispositivos) {
            dispositivo.desligar();
            System.out.println(dispositivo.obterStatus());
        }
    }
}
