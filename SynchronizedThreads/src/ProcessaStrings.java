/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author root
 */
public class ProcessaStrings {
    
//    static void imprime(String primeira, String segunda) {
    synchronized static void imprime(String primeira, String segunda) {
        System.out.printf(primeira);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(segunda);
    }
    
}
