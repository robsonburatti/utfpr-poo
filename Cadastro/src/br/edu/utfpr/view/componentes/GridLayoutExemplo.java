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
public class GridLayoutExemplo extends JFrame {
    
    public static void main(String args[]) {
        GridLayoutExemplo gle = new GridLayoutExemplo();
        gle.setLayout(new GridLayout(2, 3, 4, 4));
        gle.add(new JButton("UM"));
        gle.add(new JButton("DOIS"));
        gle.add(new JButton("TRÊS"));
        gle.add(new JButton("QUATRO"));
        gle.add(new JButton("CINCO"));
        gle.setSize(300, 300);
        gle.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gle.setVisible(true);
    }
    
}
