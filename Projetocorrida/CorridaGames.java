/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author julio
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Random;

public class CorridaGames extends JFrame {

    private static final int NUM_CARROS = 6;
    private static final int LARGURA_CARRO = 50;
    private static final int ALTURA_CARRO = 30;

    private JPanel pistaPanel; // Painel para a pista
    private JPanel botoesPanel; // Painel para os botões e opções
    private JPanel[] carrosPanels;
    private int[] posicoes;
    private Timer timer;
    private int vencedor = -1;
    private JComboBox<String> apostaComboBox;
    private JLabel vencedorLabel;
    private JButton reiniciarButton;
    private JButton iniciarButton;
    private JButton alternarTelaButton;

    public CorridaGames() {
        setTitle("Jogo de Corrida");
        setExtendedState(JFrame.MAXIMIZED_BOTH); // Inicia em tela cheia
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Layout para o jogo
        setLayout(new BorderLayout());

        // Painel para a pista de corrida
        pistaPanel = new PistaPanel();
        pistaPanel.setLayout(null); // Usar layout absoluto para os carros
        pistaPanel.setBackground(Color.LIGHT_GRAY);
        add(pistaPanel, BorderLayout.CENTER);

        // Painel para os botões
        botoesPanel = new JPanel();
        botoesPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));
        botoesPanel.setBackground(Color.DARK_GRAY);
        add(botoesPanel, BorderLayout.SOUTH);

        // Inicializar os elementos do jogo
        initCorrida();
        initBotoes();

        setVisible(true);
    }

    private void initCorrida() {
        carrosPanels = new JPanel[NUM_CARROS];
        posicoes = new int[NUM_CARROS];
        Color[] coresCarros = {Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW, Color.ORANGE, Color.PINK};

        // Adiciona os carros à pista
        for (int i = 0; i < NUM_CARROS; i++) {
            carrosPanels[i] = new JPanel();
            carrosPanels[i].setBackground(coresCarros[i]);
            carrosPanels[i].setBounds(50, 50 + i * 50, LARGURA_CARRO, ALTURA_CARRO);
            pistaPanel.add(carrosPanels[i]);
            posicoes[i] = 50;
        }
    }

    private void initBotoes() {
        apostaComboBox = new JComboBox<>(new String[]{"Carro 1", "Carro 2", "Carro 3", "Carro 4", "Carro 5", "Carro 6"});
        botoesPanel.add(apostaComboBox);

        // Botão para iniciar a corrida
        iniciarButton = new JButton("Iniciar Corrida");
        botoesPanel.add(iniciarButton);

        // Botão para reiniciar o jogo
        reiniciarButton = new JButton("Reiniciar");
        reiniciarButton.setEnabled(false);
        botoesPanel.add(reiniciarButton);

        // Exibe o vencedor
        vencedorLabel = new JLabel("Vencedor: ");
        vencedorLabel.setForeground(Color.WHITE);
        botoesPanel.add(vencedorLabel);

        // Botão para alternar entre tela cheia e normal
        alternarTelaButton = new JButton("Alternar Tela");
        botoesPanel.add(alternarTelaButton);

        // Botão para exibir apostas
        JButton exibirApostasButton = new JButton("Exibir Apostas");
        botoesPanel.add(exibirApostasButton);

        // Ação para iniciar a corrida
        iniciarButton.addActionListener(e -> {
            if (vencedor == -1) {
                String nomeJogador = JOptionPane.showInputDialog(this, "Digite seu nome:");
                if (nomeJogador != null && !nomeJogador.isEmpty()) {
                    int carroEscolhido = apostaComboBox.getSelectedIndex() + 1;
                    salvarAposta(nomeJogador, carroEscolhido);
                    iniciarCorrida();
                    reiniciarButton.setEnabled(false);
                } else {
                    JOptionPane.showMessageDialog(this, "Nome inválido! Digite novamente.");
                }
            }
        });

        // Ação para reiniciar o jogo
        reiniciarButton.addActionListener(e -> reiniciarJogo());

        // Ação para alternar entre tela cheia e normal
        alternarTelaButton.addActionListener(e -> {
            if (getExtendedState() == JFrame.MAXIMIZED_BOTH) {
                setExtendedState(JFrame.NORMAL);
                setSize(800, 600);
                setLocationRelativeTo(null);
            } else {
                setExtendedState(JFrame.MAXIMIZED_BOTH);
            }
        });

        // Ação para exibir apostas
        exibirApostasButton.addActionListener(e -> exibirApostas());
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
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int pistaLargura = screenSize.width - 100;

        for (int i = 0; i < NUM_CARROS; i++) {
            if (posicoes[i] < pistaLargura) {
                posicoes[i] += new Random().nextInt(10) + 5;
            }

            if (posicoes[i] >= pistaLargura && vencedor == -1) {
                vencedor = i;
                timer.stop();

                salvarResultado(vencedor + 1);

                String aposta = (String) apostaComboBox.getSelectedItem();
                if (aposta.equals("Carro " + (vencedor + 1))) {
                    vencedorLabel.setText("Você acertou Toreto! Vencedor: Carro " + (vencedor + 1));
                    vencedorLabel.setForeground(Color.GREEN);
                } else {
                    vencedorLabel.setText("O vencedor é o Carro " + (vencedor + 1));
                    vencedorLabel.setForeground(Color.RED);
                }

                reiniciarButton.setEnabled(true);
            }
        }

        for (int i = 0; i < NUM_CARROS; i++) {
            carrosPanels[i].setBounds(posicoes[i], 50 + i * 50, LARGURA_CARRO, ALTURA_CARRO);
        }
    }

    private void reiniciarJogo() {
        vencedor = -1;
        vencedorLabel.setText("Vencedor: ");
        vencedorLabel.setForeground(Color.WHITE);
        reiniciarButton.setEnabled(false);
        apostaComboBox.setEnabled(true);
        iniciarCorrida();
    }

    private class PistaPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            // Desenho da linha de chegada
            g.setColor(Color.RED);
            int pistaLargura = getWidth() - 100;
            g.fillRect(pistaLargura, 0, 10, getHeight());
        }
   
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CorridaGames::new); }

    // Métodos de interação com o banco de dados
    private void salvarAposta(String nomeJogador, int carroEscolhido) {
        String sql = "INSERT INTO apostas (nome_jogador, aposta_carro) VALUES (?, ?)";
        try (Connection conn = Database.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nomeJogador);
            stmt.setInt(2, carroEscolhido);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Aposta salva com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao salvar a aposta: " + e.getMessage());
        }
    }

    private void salvarResultado(int vencedor) {
        String sql = "INSERT INTO resultados (vencedor) VALUES (?)";
        try (Connection conn = Database.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, vencedor);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Resultado salvo com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao salvar o resultado: " + e.getMessage());
        }
    }

    private void exibirApostas() {
        String sql = "SELECT * FROM apostas";
        try (Connection conn = Database.getConnection();
                          PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            StringBuilder apostas = new StringBuilder();
            while (rs.next()) {
                String nomeJogador = rs.getString("nome_jogador");
                int apostaCarro = rs.getInt("aposta_carro");
                apostas.append("Jogador: ").append(nomeJogador)
                        .append(" - Apostou no Carro: ").append(apostaCarro)
                        .append("\n");
            }
            JOptionPane.showMessageDialog(this, apostas.toString(), "Apostas", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao exibir as apostas: " + e.getMessage());
        }
    }

    // Classe de conexão com o banco de dados
    public static class Database {
        private static final String URL = "jdbc:mysql://localhost:3306/seu_banco_de_dados";
        private static final String USER = "seu_usuario";
        private static final String PASSWORD = "sua_senha";

        public static Connection getConnection() throws SQLException {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        }
    }
}

