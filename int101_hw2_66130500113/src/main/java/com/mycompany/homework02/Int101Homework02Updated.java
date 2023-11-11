package com.mycompany.homework02;

import com.mycompany.homework02.work01.Utilitor;
import com.mycompany.homework02.work02.Person;
import com.mycompany.homework02.work03.Account;

public class Int101Homework02Updated {

 
    public static void main(String[] args) {
        work01Utilitor();
        work02Person();
        work03Account();
        
    }
    
 

    static void work01Utilitor() {
        Utilitor uti=new Utilitor();
        System.out.println("work01\ntestString \t"+uti.testString("dfgh"));
        System.out.println("testPositive \t"+uti.testPositive(5));
        System.out.println("computeIsbn10 \t"+uti.computeIsbn10(974472362));
    }

 

    static void work02Person() {
       Person per1=new Person("jitkal","mitrakul");
       System.out.println("\nwork02\ntoString \t"+per1.toString());
       Person per2=new Person("nouget","may");
       System.out.println("toString \t"+per2);
       System.out.println("equals  \t"+per1.equals(per2));
    }

 

    static void work03Account() {
    Person per1=new Person("jitkal","mitrakul");
       Person per2=new Person("nouget","may");
       Account ac1=new Account(per1);
       ac1.deposit(100);
       System.out.println("\nwork03\ndeposit \t"+ac1.getBalance());
       ac1.withdraw(20);
       System.out.println("withdraw \t"+ac1.getBalance());
       Account ac2=new Account(per2);
       ac1.transfer(20, ac2);
       System.out.println("transfer \t"+ac1.getBalance()+"\t withdraw");
       System.out.println("transfer \t"+ac2.getBalance()+"\t deposit");
       System.out.println("toString \t"+ac1.toString());
       System.out.println("equals  \t"+ac1.equals(ac2));
    }
}
 