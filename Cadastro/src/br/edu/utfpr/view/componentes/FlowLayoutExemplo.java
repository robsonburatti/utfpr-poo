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
public class FlowLayoutExemplo extends JFrame {
    
    public static void main(String args[]) {
        FlowLayoutExemplo fle = new FlowLayoutExemplo();
        fle.setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 10));
        fle.add(new JButton("UM"));
        fle.add(new JButton("DOIS"));
        fle.add(new JButton("TRES"));
        fle.setSize(100, 100);
        fle.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fle.setTitle("Flow Layout");
        fle.setVisible(true);
    }
    
}
