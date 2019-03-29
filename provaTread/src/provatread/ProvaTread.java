/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provatread;



/**
 *
 * @author 72873486
 */
public class ProvaTread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        //provaThread1 PT0 = new provaThread1();
        //provaThread1 PT1 = new provaThread1();
        //Thread PTT0 = new Thread(PT0);
        
        
        //PT1.start();
        //PTT0.start();
        
        //for (int i=0; i<5; i++)
        //{
        //    new provaThread1().start();
        //}
        for (int i=0; i<5; i++)
        new Thread(new provaThread1()).start();
        
        
        
        System.out.println(Thread.currentThread().getName());
        
        
    }
    
}
