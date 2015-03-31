/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cronometro;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author newton
 */
public class CronometroThread extends Thread {
    
    private int milissegundo;
    private int segundo;
    private int minuto;
    private int hora;
    private JLabel label;
    
    public CronometroThread(JLabel label){
        this.label = label;
        this.milissegundo = 0;
        this.segundo = 0;
        this.minuto = 0;
        this.hora = 0;
    }
    
    @Override
    public void run(){
        try {
            while(true){
                //A thread irá "dormir" por 10 milissegundos
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
        } catch (InterruptedException ex) {
            Logger.getLogger(CronometroThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
