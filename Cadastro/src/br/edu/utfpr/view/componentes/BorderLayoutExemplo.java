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
public class BorderLayoutExemplo extends JFrame {

    public static void main(String args[]) {
        BorderLayoutExemplo ble = new BorderLayoutExemplo();
        ble.setLayout(new BorderLayout(10, 10));
        ble.add(new JButton("NORTE"), BorderLayout.NORTH);
        ble.add(new JButton("SUL"), BorderLayout.SOUTH);
        ble.add(new JButton("LESTE"), BorderLayout.EAST);
        ble.add(new JButton("OESTE"), BorderLayout.WEST);
        ble.add(new JButton("CENTRO"), BorderLayout.CENTER);
        ble.setSize(300, 300);
        ble.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ble.setTitle("Border Layout");
        ble.setVisible(true);
    }
    
}
