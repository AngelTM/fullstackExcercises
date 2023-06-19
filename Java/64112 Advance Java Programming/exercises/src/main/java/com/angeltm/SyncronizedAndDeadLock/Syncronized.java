
package com.angeltm.SyncronizedAndDeadLock;


public class Syncronized {        
    
    static final BankAccount account = new BankAccount(50);
    
    public static void ex(String[] args) {
        
        account.topUp(100);
        
        Thread t1 = new Thread(() -> {                            
            ATM.withdraw(account, 100);
            
        });        
        
        Thread t2 = new Thread(() -> {
            ATM.withdraw(account, 100);
        });
        
        t1.start();
        t2.start();                        
        
        
   }

        
    
}
