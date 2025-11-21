
package com.commad.commad;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import modelo.Animacao.Andando;
import modelo.Imagem.Mostrador;
import modelo.Joystick;
import modelo.desenhos.Desenhando;

public class MainFrame extends JFrame {
    
    private CanvasPanel canvasPanel;
    private JComboBox<String> jogos;
    private JButton cmdA;
    private JButton cmdB;
    
    private Joystick[] jogo = {new Desenhando(), new Andando(), new Mostrador()};
    private int pos = 0;
    
    public MainFrame() {
        initComponents();
        setupLayout();
        setupActions();
    }
    
    private void initComponents() {
        setTitle("Commad");
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(634, 525);
        setLocationRelativeTo(null);
        
        // Canvas Panel
        canvasPanel = new CanvasPanel();
        canvasPanel.setPreferredSize(new Dimension(350, 200));
        canvasPanel.setBackground(Color.WHITE);
        canvasPanel.setBounds(155, 127, 350, 200);
        
        // ComboBox
        jogos = new JComboBox<>();
        jogos.addItem("Desenhando");
        jogos.addItem("Andando");
        jogos.addItem("Mostrador");
        jogos.setBounds(21, 14, 129, 25);
        
        // Buttons
        cmdA = new JButton("A");
        cmdA.setBounds(262, 401, 100, 30);
        
        cmdB = new JButton("B");
        cmdB.setBounds(372, 401, 100, 30);
    }
    
    private void setupLayout() {
        setLayout(null);
        add(jogos);
        add(canvasPanel);
        add(cmdA);
        add(cmdB);
    }
    
    private void setupActions() {
        cmdA.addActionListener((ActionEvent e) -> {
            if (pos == 1) { // Andando - inicia animação
                Graphics2D g2d = canvasPanel.getGraphics2D();
                if (g2d != null) {
                    jogo[pos].prinmeiraAcao(g2d);
                    g2d.dispose();
                }
            } else {
                Graphics2D g2d = canvasPanel.getGraphics2D();
                if (g2d != null) {
                    jogo[pos].prinmeiraAcao(g2d);
                    g2d.dispose();
                    canvasPanel.repaint();
                }
            }
        });
        
        cmdB.addActionListener((ActionEvent e) -> {
            if (pos == 0) { // Desenhando - limpar
                canvasPanel.clear();
                canvasPanel.repaint();
            } else if (pos == 1) { // Andando - parar animação
                Graphics2D g2d = canvasPanel.getGraphics2D();
                if (g2d != null) {
                    jogo[pos].segundaAcao(g2d);
                    g2d.dispose();
                }
            } else { // Mostrador - rotacionar
                Graphics2D g2d = canvasPanel.getGraphics2D();
                if (g2d != null) {
                    canvasPanel.clear();
                    jogo[pos].segundaAcao(g2d);
                    g2d.dispose();
                    canvasPanel.repaint();
                }
            }
        });
        
        jogos.addActionListener((ActionEvent e) -> {
            // Parar animação se estiver rodando
            if (pos == 1) {
                Andando andando = (Andando) jogo[pos];
                andando.segundaAcao(null);
            }
            
            canvasPanel.clear();
            pos = jogos.getSelectedIndex();
            canvasPanel.repaint();
            
            // Configurar callback para animação
            if (pos == 1) {
                Andando andando = (Andando) jogo[pos];
                andando.setRepaintCallback(() -> canvasPanel.repaint());
                andando.setDimensions(canvasPanel.getWidth(), canvasPanel.getHeight());
            }
        });
    }
    
    // Classe interna para o canvas
    private class CanvasPanel extends JPanel {
        private BufferedImage buffer;
        
        public CanvasPanel() {
            buffer = new BufferedImage(350, 200, BufferedImage.TYPE_INT_RGB);
            clear();
        }
        
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            
            // Redimensionar buffer se necessário
            if (buffer.getWidth() != getWidth() || buffer.getHeight() != getHeight()) {
                BufferedImage newBuffer = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_RGB);
                Graphics2D g2d = newBuffer.createGraphics();
                g2d.setColor(Color.WHITE);
                g2d.fillRect(0, 0, getWidth(), getHeight());
                g2d.drawImage(buffer, 0, 0, null);
                g2d.dispose();
                buffer = newBuffer;
            }
            
            // Desenhar buffer na tela
            g.drawImage(buffer, 0, 0, null);
            
            // Desenhar elementos dinâmicos baseado no jogo selecionado
            Graphics2D g2d = (Graphics2D) g.create();
            if (pos == 1) { // Andando - animação (desenha diretamente na tela)
                Andando andando = (Andando) jogo[pos];
                if (andando.getJob() != null) {
                    andando.getJob().desenhar(g2d);
                }
            }
            // Mostrador desenha no buffer através das ações
            g2d.dispose();
        }
        
        public Graphics2D getGraphics2D() {
            return buffer.createGraphics();
        }
        
        public void clear() {
            Graphics2D g2d = buffer.createGraphics();
            g2d.setColor(Color.WHITE);
            g2d.fillRect(0, 0, buffer.getWidth(), buffer.getHeight());
            g2d.dispose();
        }
    }
    
}

