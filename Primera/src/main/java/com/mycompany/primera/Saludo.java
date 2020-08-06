
package com.mycompany.primera;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Saludo {
    public static void main (String args[]){
        
        ApplicationContext context = new ClassPathXmlApplicationContext("/beans.xml");

        Customer customer1 = (Customer) context.getBean("customer1");

System.out.println(customer1.toString());
        /*System.out.println("Hello world");
        
        Customer customer1=new Customer();
        
customer1.setId(1L);
customer1.setName("Pablo");
customer1.setAddress("Guatemala");

Customer customer2=new Customer();
customer2.setId(2L);
customer2.setName("Avenir");
customer2.setAddress("Mixco");*/


    }
}
