/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlle;

/**
 *
 * @author julio
 */
import corridagame.DatabaseManager;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

// Classe principal do jogo, representando a interface gráfica e a lógica do jogo.
public class CorridaGames extends JFrame {

    private static final int NUM_CARROS = 6; // Quantidade de carros na corrida
    private static final int LARGURA_CARRO = 50; // Largura visual de cada carro
    private static final int ALTURA_CARRO = 30; // Altura visual de cada carro

    private JPanel pistaPanel; // Painel que representa a pista de corrida
    private JPanel botoesPanel; // Painel para os botões e controles do jogo
    private JPanel[] carrosPanels; // Representação visual de cada carro
    private int[] posicoes; // Posições atuais dos carros na pista
    private Timer timer; // Timer para animar o movimento dos carros
    private int vencedor = -1; // Indica qual carro venceu (-1 = ainda não há vencedor)
    private JComboBox<String> apostaComboBox; // Caixa de seleção para escolher o carro apostado
    private JLabel vencedorLabel; // Exibe o vencedor na interface
    private JButton reiniciarButton; // Botão para reiniciar a corrida
    private JButton iniciarButton; // Botão para iniciar a corrida
    private JButton alternarTelaButton; // Botão para alternar entre tela cheia e modo janela

    // Construtor da classe principal
    public CorridaGames() {
        setTitle("Jogo de Corrida"); // Título da janela
        setExtendedState(JFrame.MAXIMIZED_BOTH); // Inicia em tela cheia
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Layout principal da interface gráfica
        setLayout(new BorderLayout());

        // Inicializa o painel da pista
        pistaPanel = new PistaPanel(); // Classe interna personalizada para desenhar a pista
        pistaPanel.setLayout(null); // Layout absoluto para posicionar os carros
        pistaPanel.setBackground(Color.LIGHT_GRAY); // Fundo cinza claro
        add(pistaPanel, BorderLayout.CENTER);

        // Inicializa o painel dos botões
        botoesPanel = new JPanel();
        botoesPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10)); // Layout centralizado
        botoesPanel.setBackground(Color.DARK_GRAY); // Fundo cinza escuro
        add(botoesPanel, BorderLayout.SOUTH);

        // Inicializa os carros e seus controles
        initCorrida(); // Configura os carros e suas posições iniciais
        initBotoes(); // Adiciona os botões e seus eventos

        setVisible(true); // Exibe a janela
    }

    // Método para inicializar os carros na pista
    private void initCorrida() {
        carrosPanels = new JPanel[NUM_CARROS]; // Array de painéis para os carros
        posicoes = new int[NUM_CARROS]; // Array para armazenar as posições dos carros
        Color[] coresCarros = {Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW, Color.ORANGE, Color.PINK}; // Cores dos carros

        // Configura cada carro na pista
        for (int i = 0; i < NUM_CARROS; i++) {
            carrosPanels[i] = new JPanel(); // Cria um painel para o carro
            carrosPanels[i].setBackground(coresCarros[i]); // Define a cor do carro
            carrosPanels[i].setBounds(50, 50 + i * 50, LARGURA_CARRO, ALTURA_CARRO); // Define a posição inicial
            pistaPanel.add(carrosPanels[i]); // Adiciona o carro ao painel da pista
            posicoes[i] = 50; // Posição inicial de todos os carros
        }
    }

    // Método para inicializar os botões e seus eventos
    private void initBotoes() {
        // Combobox para o jogador escolher o carro da aposta
        apostaComboBox = new JComboBox<>(new String[]{"Carro 1", "Carro 2", "Carro 3", "Carro 4", "Carro 5", "Carro 6"});
        botoesPanel.add(apostaComboBox);

        // Botão para iniciar a corrida
        iniciarButton = new JButton("Iniciar Corrida");
        botoesPanel.add(iniciarButton);

        // Botão para reiniciar o jogo (desativado inicialmente)
        reiniciarButton = new JButton("Reiniciar");
        reiniciarButton.setEnabled(false);
        botoesPanel.add(reiniciarButton);

        // Exibe o vencedor da corrida
        vencedorLabel = new JLabel("Vencedor: ");
        vencedorLabel.setForeground(Color.WHITE);
        botoesPanel.add(vencedorLabel);

        // Botão para alternar entre tela cheia e modo janela
        alternarTelaButton = new JButton("Alternar Tela");
        botoesPanel.add(alternarTelaButton);

        // Botão para exibir apostas registradas no banco
        JButton exibirApostasButton = new JButton("Exibir Apostas");
        botoesPanel.add(exibirApostasButton);

        // Evento para iniciar a corrida
        iniciarButton.addActionListener(e -> {
            if (vencedor == -1) { // Verifica se não há corrida em andamento
                String nomeJogador = JOptionPane.showInputDialog(this, "Digite seu nome:"); // Solicita o nome do jogador
                if (nomeJogador != null && !nomeJogador.isEmpty()) {
                    int carroEscolhido = apostaComboBox.getSelectedIndex() + 1; // Identifica o carro apostado
                    DatabaseManager.salvarAposta(nomeJogador, carroEscolhido); // Salva a aposta no banco de dados
                    iniciarCorrida(); // Inicia a corrida
                    reiniciarButton.setEnabled(false); // Desativa o botão de reiniciar enquanto a corrida ocorre
                } else {
                    JOptionPane.showMessageDialog(this, "Nome inválido! Digite novamente."); // Mensagem de erro
                }
            }
        });

        // Evento para reiniciar o jogo
        reiniciarButton.addActionListener(e -> reiniciarJogo());

        // Evento para alternar entre tela cheia e modo janela
        alternarTelaButton.addActionListener(e -> {
            if (getExtendedState() == JFrame.MAXIMIZED_BOTH) { // Se estiver em tela cheia
                setExtendedState(JFrame.NORMAL); // Alterna para modo janela
                setSize(800, 600); // Define tamanho padrão
                setLocationRelativeTo(null); // Centraliza a janela
            } else {
                setExtendedState(JFrame.MAXIMIZED_BOTH); // Alterna para tela cheia
            }
        });

        // Evento para exibir apostas registradas no banco
        exibirApostasButton.addActionListener(e -> exibirApostas());
    }

    // Método que controla o início da corrida
    private void iniciarCorrida() {
        for (int i = 0; i < NUM_CARROS; i++) {
            posicoes[i] = 50; // Reinicia as posições iniciais dos carros
        }

        vencedor = -1; // Reseta o vencedor
        timer = new Timer(30, e -> moverCarros()); // Cria um Timer para animar os carros
        timer.start(); // Inicia o Timer
    }

    // Método que move os carros na pista
    private void moverCarros() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); // Obtém o tamanho da tela
        int pistaLargura = screenSize.width - 100; // Define o limite da pista

        for (int i = 0; i < NUM_CARROS; i++) {
            if (posicoes[i] < pistaLargura) {
                posicoes[i] += new Random().nextInt(10) + 5; // Move o carro para frente com um valor aleatório
            }

            if (posicoes[i] >= pistaLargura && vencedor == -1) {
                vencedor = i; // Define o carro vencedor
                timer.stop(); // Para a corrida

                DatabaseManager.salvarResultado(vencedor + 1); // Salva o resultado no banco de dados

                String aposta = (String) apostaComboBox.getSelectedItem();
                if (aposta.equals("Carro " + (vencedor + 1))) {
                    vencedorLabel.setText("Você acertou! Vencedor: Carro " + (vencedor + 1)); // Feedback positivo
                    vencedorLabel.setForeground(Color.GREEN);
                } else {
                    vencedorLabel.setText("O vencedor é o Carro " + (vencedor + 1)); // Feedback geral
                    vencedorLabel.setForeground(Color.RED);
                }

                reiniciarButton.setEnabled(true); // Ativa o botão de reiniciar
            }
        }

        // Atualiza a posição visual dos carros
        for (int i = 0; i < NUM_CARROS; i++) {
            carrosPanels[i].setBounds(posicoes[i], 50 + i * 50, LARGURA_CARRO, ALTURA_CARRO);
        }
    }

    // Método para reiniciar o jogo
    private void reiniciarJogo() {
        vencedor = -1;
        vencedorLabel.setText("Vencedor: ");
        vencedorLabel.setForeground(Color.WHITE);
        reiniciarButton.setEnabled(false);
        iniciarCorrida(); // Reinicia a corrida
    }

    // Método para exibir as apostas registradas no banco
    private void exibirApostas() {
        String apostas = DatabaseManager.getApostas(); // Obtém apostas do banco
        JOptionPane.showMessageDialog(this, apostas, "Apostas", JOptionPane.INFORMATION_MESSAGE); // Exibe em um diálogo
    }

    // Classe interna personalizada para desenhar a pista de corrida
    private class PistaPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.RED);
            int pistaLargura = getWidth() - 100;
            g.fillRect(pistaLargura, 0, 10, getHeight()); // Linha de chegada
        }
    }

    // Método principal para rodar o jogo
    public static void main(String[] args) {
        SwingUtilities.invokeLater(CorridaGames::new);
    }
}
