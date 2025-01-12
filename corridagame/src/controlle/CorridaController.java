/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlle;

/**
 *
 * @author julio
 */
import View.CorridaView;
import corridagame.DatabaseManager;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class CorridaController {

    private CorridaView view;
    private static final int NUM_CARROS = 6;
    private static final int LARGURA_CARRO = 50;
    private static final int ALTURA_CARRO = 30;
    private JPanel[] carrosPanels;
    private int[] posicoes;
    private Timer timer;
    private int vencedor = -1;

    public CorridaController(CorridaView view) {
        this.view = view;
        initCorrida();
        initListeners();
    }

    private void initCorrida() {
        JPanel pistaPanel = view.getPistaPanel();
        carrosPanels = new JPanel[NUM_CARROS];
        posicoes = new int[NUM_CARROS];
        Color[] coresCarros = {Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW, Color.ORANGE, Color.PINK};

        for (int i = 0; i < NUM_CARROS; i++) {
            carrosPanels[i] = new JPanel();
            carrosPanels[i].setBackground(coresCarros[i]);
            carrosPanels[i].setBounds(50, 50 + i * 50, LARGURA_CARRO, ALTURA_CARRO);
            pistaPanel.add(carrosPanels[i]);
            posicoes[i] = 50;
        }
    }

    private void initListeners() {
        view.getIniciarButton().addActionListener(e -> {
            if (vencedor == -1) {
                String nomeJogador = JOptionPane.showInputDialog(view, "Digite seu nome:");
                if (nomeJogador != null && !nomeJogador.isEmpty()) {
                    int carroEscolhido = view.getApostaComboBox().getSelectedIndex() + 1;
                    DatabaseManager.salvarAposta(nomeJogador, carroEscolhido);
                    iniciarCorrida();
                } else {
                    JOptionPane.showMessageDialog(view, "Nome inválido! Digite novamente.");
                }
            }
        });

        view.getReiniciarButton().addActionListener(e -> reiniciarJogo());

        view.getAlternarTelaButton().addActionListener(e -> alternarTela());

        view.getExibirApostasButton().addActionListener(e -> exibirApostas());
    }

    private void iniciarCorrida() {
        for (int i = 0; i < NUM_CARROS; i++) {
            posicoes[i] = 50;
        }

        vencedor = -1;
        timer = new Timer(30, e -> moverCarros());
        timer.start();
    }

    private void moverCarros() {
        int pistaLargura = view.getPistaPanel().getWidth() - 100;

        for (int i = 0; i < NUM_CARROS; i++) {
            if (posicoes[i] < pistaLargura) {
                posicoes[i] += new Random().nextInt(10) + 5;
            }

            if (posicoes[i] >= pistaLargura && vencedor == -1) {
                vencedor = i;
                timer.stop();
                DatabaseManager.salvarResultado(vencedor + 1);

                String aposta = (String) view.getApostaComboBox().getSelectedItem();
                JLabel vencedorLabel = view.getVencedorLabel();
                if (aposta.equals("Carro " + (vencedor + 1))) {
                    vencedorLabel.setText("Você acertou! Vencedor: Carro " + (vencedor + 1));
                    vencedorLabel.setForeground(Color.GREEN);
                } else {
                    vencedorLabel.setText("O vencedor é o Carro " + (vencedor + 1));
                    vencedorLabel.setForeground(Color.RED);
                }

                view.getReiniciarButton().setEnabled(true);
            }
        }

        for (int i = 0; i < NUM_CARROS; i++) {
            carrosPanels[i].setBounds(posicoes[i], 50 + i * 50, LARGURA_CARRO, ALTURA_CARRO);
        }
    }

    private void reiniciarJogo() {
        vencedor = -1;
        view.getVencedorLabel().setText("Vencedor: ");
        view.getVencedorLabel().setForeground(Color.WHITE);
        view.getReiniciarButton().setEnabled(false);
        iniciarCorrida();
    }

    private void alternarTela() {
        JFrame frame = view;
        if (frame.getExtendedState() == JFrame.MAXIMIZED_BOTH) {
            frame.setExtendedState(JFrame.NORMAL);
            frame.setSize(800, 600);
            frame.setLocationRelativeTo(null);
        } else {
            frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        }
    }

    private void exibirApostas() {
        String apostas = DatabaseManager.getApostas();
        JOptionPane.showMessageDialog(view, apostas, "Apostas", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CorridaView view = new CorridaView();
            new CorridaController(view);
        });
    }
}
