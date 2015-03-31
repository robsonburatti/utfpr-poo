/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cronometro2;

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
public class CronometroRunnable extends JFrame implements Runnable {
    
    private Thread thread;
    private JLabel label;
    private JButton btIniciar;
    private JButton btParar;
    private int milissegundo;
    private int segundo;
    private int minuto;
    private int hora;
    
    public CronometroRunnable(){
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 1));
        
        //Linha 1
        label = new JLabel("00:00:00.000");
        label.setHorizontalAlignment(JLabel.CENTER);
        panel.add(label);
        
        //Linha 2
        JPanel panelBotoes = new JPanel();
        
        btIniciar = new JButton("Iniciar");
        panelBotoes.add(btIniciar);
        
        btParar = new JButton("Parar");
        btParar.setEnabled(false);
        panelBotoes.add(btParar);
        
        panel.add(panelBotoes);
        
        btIniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                iniciaCronometro();
            }
        });
        
        btParar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                paraCronometro();
            }
        });
        
        this.setTitle("Cronometro");
        this.setResizable(false);
        this.add(panel);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private void iniciaCronometro(){
        thread = new Thread(this);
        thread.start();
        
        btIniciar.setEnabled(false);
        btParar.setEnabled(true);
    }
    
    private void paraCronometro(){
        thread.interrupt();
        
        btIniciar.setEnabled(true);
        btParar.setEnabled(false);
    }

    @Override
    public void run() {
        this.milissegundo = 0;
        this.segundo = 0;
        this.minuto = 0;
        this.hora = 0;
        
        try{
            while(true){
                Thread.sleep(10);
                
                this.milissegundo = this.milissegundo + 10;
                
                if(this.milissegundo == 1000){
                    this.milissegundo = 0;
                    this.segundo++;
                }
                
                if(this.segundo == 60){
                    this.segundo = 0;
                    this.minuto++;
                }
                
                if(this.minuto == 60){
                    this.minuto = 0;
                    this.hora++;
                }
                
                String tempo = String.format("%02d:%02d:%02d.%03d", 
                        this.hora, this.minuto, this.segundo,
                        this.milissegundo);
                
                this.label.setText(tempo);
                this.label.revalidate();
            }
        }catch(Exception ex){}
    }
    
}
