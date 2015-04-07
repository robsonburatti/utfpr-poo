/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.view.componentes;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author root
 */
public class ComplexoLayoutExemplo extends JFrame {
    
    public static void main(String args[]) {
        ComplexoLayoutExemplo cle = new ComplexoLayoutExemplo();
        JPanel painelNorte = new JPanel();
        JPanel panielCentro = new JPanel();
        JPanel painelSul = new JPanel();
        
        /* Painel Norte */
        // Painéis usam FlowLayout por padrão
        painelNorte.add(new JButton("UM"));
        painelNorte.add(new JButton("DOIS"));
        painelNorte.add(new JButton("TRÊS"));
        
        /* Painel Centro */
        panielCentro.setLayout(new GridLayout(4,4));
        panielCentro.add(new JTextField("Primeiro"));
        panielCentro.add(new JTextField("Segundo"));
        panielCentro.add(new JTextField("Terceiro"));
        panielCentro.add(new JTextField("Quarto"));
        
        /* Painel Sul */
        painelSul.setLayout(new BorderLayout());
        painelSul.add(new JCheckBox("Me escolha!"),
        BorderLayout.CENTER);
        painelSul.add(new JCheckBox("Estou aqui!"),
        BorderLayout.EAST);
        painelSul.add(new JCheckBox("Sua melhor opção!"),
        BorderLayout.WEST);
        
        /* Adicionando os Painéis ao JFrame container */
        // JFrames usam BorderLayout por padrão
        cle.add(painelNorte, BorderLayout.NORTH);
        cle.add(panielCentro, BorderLayout.CENTER);
        cle.add(painelSul, BorderLayout.SOUTH);
        cle.setSize(400,400);
        cle.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cle.setVisible(true);
    }
    
}
