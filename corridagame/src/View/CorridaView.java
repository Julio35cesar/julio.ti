/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

/**
 *
 * @author julio
 */
import javax.swing.*;
import java.awt.*;

public class CorridaView extends JFrame {

    private JPanel pistaPanel;
    private JPanel botoesPanel;
    private JComboBox<String> apostaComboBox;
    private JLabel vencedorLabel;
    private JButton iniciarButton;
    private JButton reiniciarButton;
    private JButton alternarTelaButton;
    private JButton exibirApostasButton;

    public CorridaView() {
        setTitle("Jogo de Corrida");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        pistaPanel = new JPanel();
        pistaPanel.setLayout(null);
        pistaPanel.setBackground(Color.LIGHT_GRAY);
        add(pistaPanel, BorderLayout.CENTER);

        botoesPanel = new JPanel();
        botoesPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));
        botoesPanel.setBackground(Color.DARK_GRAY);
        add(botoesPanel, BorderLayout.SOUTH);

        apostaComboBox = new JComboBox<>(new String[]{"Carro 1", "Carro 2", "Carro 3", "Carro 4", "Carro 5", "Carro 6"});
        botoesPanel.add(apostaComboBox);

        iniciarButton = new JButton("Iniciar Corrida");
        botoesPanel.add(iniciarButton);

        reiniciarButton = new JButton("Reiniciar");
        reiniciarButton.setEnabled(false);
        botoesPanel.add(reiniciarButton);

        vencedorLabel = new JLabel("Vencedor: ");
        vencedorLabel.setForeground(Color.WHITE);
        botoesPanel.add(vencedorLabel);

        alternarTelaButton = new JButton("Alternar Tela");
        botoesPanel.add(alternarTelaButton);

        exibirApostasButton = new JButton("Exibir Apostas");
        botoesPanel.add(exibirApostasButton);

        setVisible(true);
    }

    public JPanel getPistaPanel() {
        return pistaPanel;
    }

    public JComboBox<String> getApostaComboBox() {
        return apostaComboBox;
    }

    public JLabel getVencedorLabel() {
        return vencedorLabel;
    }

    public JButton getIniciarButton() {
        return iniciarButton;
    }

    public JButton getReiniciarButton() {
        return reiniciarButton;
    }

    public JButton getAlternarTelaButton() {
        return alternarTelaButton;
    }

    public JButton getExibirApostasButton() {
        return exibirApostasButton;
    }
}
