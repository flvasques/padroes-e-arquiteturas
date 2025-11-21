package tbd.proxy;

import negocio.Garagem;
import negocio.Veiculo;
import negocio.enumeradores.VeiculoStatus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GaragemFrame extends JFrame {

    private Garagem garajao;

    private JLabel lblTitulo;
    private JLabel lblNovoVeiculo;
    private JLabel lblPlaca;
    private JTextField textoPlaca;
    private JLabel lblModelo;
    private JTextField textoModelo;
    private JButton cmdAdd;

    // Componentes adicionais para a parte de controle de veículos (Aguardando/Saindo)
    private JLabel lblAguardando;
    private JLabel lblSaindo;
    private JButton cmdEstacionar;
    private JButton cmdRetirar;
    
    // Área de log/status para simular a lista de veículos
    private JTextArea logArea;
    private JScrollPane scrollPane;

    public GaragemFrame() {
        super("Garajão - Proxy Pattern");
        garajao = new Garagem(); // Inicializa a garagem
        
        // Configuração básica da janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(550, 400);
        setLayout(new BorderLayout(10, 10));
        
        // Painel principal com BoxLayout para organizar verticalmente
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        // 1. Título
        lblTitulo = new JLabel("Garajão", SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
        lblTitulo.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(lblTitulo);
        mainPanel.add(Box.createVerticalStrut(15));

        // 2. Painel de Adição de Veículo
        JPanel addPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));
        addPanel.setBorder(BorderFactory.createTitledBorder("Novo Veículo"));
        
        lblPlaca = new JLabel("Placa:");
        textoPlaca = new JTextField(10);
        lblModelo = new JLabel("Modelo:");
        textoModelo = new JTextField(10);
        cmdAdd = new JButton("Adicionar");
        cmdAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addVeiculoAction();
            }
        });

        addPanel.add(lblPlaca);
        addPanel.add(textoPlaca);
        addPanel.add(lblModelo);
        addPanel.add(textoModelo);
        addPanel.add(cmdAdd);
        
        mainPanel.add(addPanel);
        mainPanel.add(Box.createVerticalStrut(15));
        
        // 3. Painel de Controle (Aguardando/Saindo)
        JPanel controlPanel = new JPanel(new GridLayout(1, 2, 20, 0));
        
        // Sub-painel Aguardando
        JPanel aguardandoPanel = new JPanel(new BorderLayout());
        aguardandoPanel.setBorder(BorderFactory.createTitledBorder("Aguardando"));
        lblAguardando = new JLabel("Veículos na fila de espera...", SwingConstants.CENTER);
        cmdEstacionar = new JButton("Estacionar Próximo");
        aguardandoPanel.add(lblAguardando, BorderLayout.CENTER);
        aguardandoPanel.add(cmdEstacionar, BorderLayout.SOUTH);
        
        // Sub-painel Saindo
        JPanel saindoPanel = new JPanel(new BorderLayout());
        saindoPanel.setBorder(BorderFactory.createTitledBorder("Saindo"));
        lblSaindo = new JLabel("Veículos prontos para sair...", SwingConstants.CENTER);
        cmdRetirar = new JButton("Retirar Próximo");
        saindoPanel.add(lblSaindo, BorderLayout.CENTER);
        saindoPanel.add(cmdRetirar, BorderLayout.SOUTH);
        
        controlPanel.add(aguardandoPanel);
        controlPanel.add(saindoPanel);
        
        mainPanel.add(controlPanel);
        mainPanel.add(Box.createVerticalStrut(15));
        
        // 4. Área de Log/Status
        logArea = new JTextArea(5, 40);
        logArea.setEditable(false);
        scrollPane = new JScrollPane(logArea);
        scrollPane.setBorder(BorderFactory.createTitledBorder("Status/Log"));
        
        mainPanel.add(scrollPane);
        
        add(mainPanel, BorderLayout.CENTER);
        
        // Ações dos botões de controle (simulação)
        cmdEstacionar.addActionListener(e -> log("Ação 'Estacionar' simulada."));
        cmdRetirar.addActionListener(e -> log("Ação 'Retirar' simulada."));

        // Centralizar a janela
        setLocationRelativeTo(null);
    }

    private void addVeiculoAction() {
        String placa = textoPlaca.getText().trim();
        String modelo = textoModelo.getText().trim();

        if (placa.isEmpty() || modelo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Placa e Modelo não podem estar vazios.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            Veiculo v = new Veiculo(placa, modelo);
            v.setStatus(VeiculoStatus.Entrada);
            garajao.entrar(v);
            log("Veículo adicionado: Placa=" + placa + ", Modelo=" + modelo);
            textoPlaca.setText("");
            textoModelo.setText("");
        } catch (Exception ex) {
            log("Erro ao adicionar veículo: " + ex.getMessage());
            JOptionPane.showMessageDialog(this, "Erro ao adicionar veículo: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void log(String message) {
        logArea.append(message + "\n");
        logArea.setCaretPosition(logArea.getDocument().getLength());
    }

    public static void main(String[] args) {
        // Garante que a GUI seja criada na Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GaragemFrame().setVisible(true);
            }
        });
    }
}
