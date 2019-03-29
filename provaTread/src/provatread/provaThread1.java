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
public class provaThread1 implements Runnable{
    
    public provaThread1()
    {
        
    }
    
    public void run()
    {
        for (int i=0; i<10; i++)
        {
            try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            ex.printStackTrace();   
        }
          System.out.println(Thread.currentThread().getName()+" conto "+i);  
        }
        
    }
    
}
