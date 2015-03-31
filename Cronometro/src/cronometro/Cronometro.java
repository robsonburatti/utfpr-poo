/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cronometro;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author newton
 */
public class Cronometro {

    private static CronometroThread cronometro;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 1));
        
        final JLabel label = new JLabel("00:00:00.000");
        label.setHorizontalAlignment(JLabel.CENTER);
        panel.add(label);
        
        JPanel panelBotoes = new JPanel();
        
        final JButton btIniciar = new JButton("Iniciar");
        panelBotoes.add(btIniciar);
        
        final JButton btPause = new JButton("Pause");
        btPause.setEnabled(false);
        panelBotoes.add(btPause);
        
        final JButton btParar = new JButton("Parar");
        btParar.setEnabled(false);
        panelBotoes.add(btParar);
        
        panel.add(panelBotoes);
        
        btIniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if((cronometro == null) || (cronometro.getState() == Thread.State.TERMINATED)){
                    cronometro = new CronometroThread(label);
                    cronometro.start();
                }else{
                    //DEPRECATED
                    cronometro.resume();
                }
                btIniciar.setEnabled(false);
                btParar.setEnabled(true);
                btPause.setEnabled(true);
            }
        });
        
        btParar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cronometro.interrupt();
                btIniciar.setEnabled(true);
                btParar.setEnabled(false);
                btPause.setEnabled(false);
            }
        });
        
        btPause.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //DEPRECATED
                cronometro.suspend();
                btIniciar.setEnabled(true);
                btPause.setEnabled(false);
                btParar.setEnabled(false);
            }
        });
        
        JFrame janela = new JFrame("Cronometro");
        janela.setResizable(false);
        janela.add(panel);
        janela.pack();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
    
}
