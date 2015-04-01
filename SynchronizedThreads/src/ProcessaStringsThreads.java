/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author root
 */
public class ProcessaStringsThreads implements Runnable {
    
    Thread thread;
    String primeiroThread;
    String segundoThread;
    
    public ProcessaStringsThreads(String primeiro, String segundo) {
        this.primeiroThread = primeiro;
        this.segundoThread = segundo;
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        ProcessaStrings.imprime(primeiroThread, segundoThread);
    }
    
}
