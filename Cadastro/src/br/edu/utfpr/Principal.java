/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr;

import br.edu.utfpr.view.FrmLogin;
import br.edu.utfpr.view.FrmMinhaPrimeiraTela;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author root
 */
public class Principal {
    
    public static void main(String[] args) {
        /****************** Acessa a tela de minhaPrimeiraTela *****************/
        
        // Solicita ao usurário que "Informe alguma coisa:"
//        String texto = JOptionPane.showInputDialog(null, "Informe alguma coisa:");
        
        // Apresenta a mensagem do texto informado pelo usuário
//        JOptionPane.showMessageDialog(null, "Seu texto é: " + texto);
        
        // Apresenta a mensagem do texto informado pelo usuário com um título e sem icone na mensagem
//        JOptionPane.showMessageDialog(null, "Seu texto é: " + texto, "Este é o titulo sem icone", JOptionPane.PLAIN_MESSAGE);
        
        // Apresenta a mensagem do texto informado pelo usuário com um título e com icone de erro na mensagem
//        JOptionPane.showMessageDialog(null, "Seu texto é: " + texto, "Este é o titulo com icone de erro", JOptionPane.ERROR_MESSAGE);
        
        // Apresenta a mensagem do texto informado pelo usuário com um título e com icone de informação na mensagem
//        JOptionPane.showMessageDialog(null, "Seu texto é: " + texto, "Este é o titulo com icone de informação", JOptionPane.INFORMATION_MESSAGE);
        
        // Apresenta a mensagem do texto informado pelo usuário com um título e com icone de alerta na mensagem
//        JOptionPane.showMessageDialog(null, "Seu texto é: " + texto, "Este é o titulo com icone de alerta", JOptionPane.WARNING_MESSAGE);
        
        // Apresenta a mensagem do texto informado pelo usuário com um título e com icone de interrogação na mensagem
//        JOptionPane.showMessageDialog(null, "Seu texto é: " + texto, "Este é o titulo com icone de interrogação", JOptionPane.QUESTION_MESSAGE);
        
        /****************** Acessa a tela de minhaPrimeiraTela *****************/
        
        // Instância a tela de minhaPrimeiraTela
//        FrmMinhaPrimeiraTela frmMinhaPrimeiraTela = new FrmMinhaPrimeiraTela();
        
        // Atribui para a tela de minhaPrimeiraTela as propriedades necessárias para habilitar o botão  de fechar padrão das telas (o botão "X" de fechar)
//        frmMinhaPrimeiraTela.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        
        // Atribui para a tela minhaPrimeiraTela o tamanho da tela de 500 pixel por 500 pixel
//        frmMinhaPrimeiraTela.setSize(500, 500);
        
        // Atribui para a tela de minhaPrimeiraTela que seja visível para o usuário
//        frmMinhaPrimeiraTela.setVisible(true);
        
        /****************** Acessa a tela de login *****************/
        
        // Instância a tela de login
        FrmLogin frmLogin = new FrmLogin();
        
        // Atribui para a tela de login as propriedades necessárias para habilitar o botão  de fechar padrão das telas (o botão "X" de fechar)
        frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Atribui para a tela de login que seja apresentada no centro da tela
        frmLogin.setLocationRelativeTo(null);
        
        // Atribui para a tela de login que seja visível para o usuário
        frmLogin.setVisible(true);
        
    }
    
}
