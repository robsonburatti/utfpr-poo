/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.view;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author root
 */
public class FrmMinhaPrimeiraTela extends JFrame {
    
    private JLabel jLabelTexto;
    private JLabel jLabelTextoIcone;
    private JLabel jLabelTextoIconeAdicionado;
    private JButton jButtonOk;
    private JTextField jTextFieldEntradaDados;
    private JPasswordField jPassawordFieldSenha;

    public FrmMinhaPrimeiraTela() {
        // Chama a instância da classe pai passando um texto que será o nome da tela
        super("Minha Primeira Tela");
        
        // Atribui para esta tela o tipo do layout
        setLayout( new FlowLayout() );
        
        // Instância um texto na tela passando pelo construtor qual vai ser sua descrição
        jLabelTexto = new JLabel("Texto normal");
        
        // Atribui ao campo de texto um balãozinho quando passar o mouse em cima apresenta a decrição informada
        jLabelTexto.setToolTipText("Descrição do campo texto");
        
        // Adiciona o campo de texto na tela
        add(jLabelTexto);
        
        
        // Instância um botão na tela passando pelo seu construtor qual vai ser o nome
        jButtonOk = new JButton("Ok");
        
        // Adiciona o botão na tela
        add(jButtonOk);
        
        
        // Instância uma caixa de texto para entrada de dados
        jTextFieldEntradaDados = new JTextField();
        
        // Atribui para a caixa de texto o tamanho de 20 colunas
        jTextFieldEntradaDados.setColumns(20);
        
        // Adiciona a caixa de texto na tela
        add(jTextFieldEntradaDados);
        
        
        // Instância uma caixa de texto para entrada de dados ocultando os caracteres informados para ser utilizado como campo de senha
        jPassawordFieldSenha = new JPasswordField();
        
        // Atribui para a caixa de texto com caracteres oculto o tamanho de 8 colunas
        jPassawordFieldSenha.setColumns(8);
        
        // Adiciona a caixa de texto na tela
        add(jPassawordFieldSenha);
    }
    
    
    
}
