package com.angeltm.queue;

import java.util.LinkedList;
import com.angeltm.queue.Customer;

public class ImplementingQueue {

    public static void ex() {
        
    
    LinkedList<Customer> queue = new LinkedList<>();
    queue.add(new Customer("Sally"));
    queue.add(new Customer("Ben"));
    queue.add(new Customer("Emma"));
    queue.add(new Customer("Fred"));
    System.out.println(queue);
    serveCustomer(queue);
    System.out.println(queue);

}

static void serveCustomer(LinkedList<Customer> queue) {
    
    Customer c = queue.poll();
    c.serve();
    
}
}
