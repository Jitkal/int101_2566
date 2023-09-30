package int101.homework01;

import work04.BankAccount;
import work04.Person;



public class Int101Homework01 {

    public static void main(String[] args) {
        work01Question(true, false, true, false, true, false);
        work01Answer(true, false, true, false, true, false);
        work02Question(1, 2, 3, 4, 5, 6);
        work02Answer(1, 2, 3, 4, 5, 6);
        work03UseOfUtilityClass();
        work04UseOfObjectClass();
    }
    static void work01Question(boolean b1, boolean b2, boolean b3, 
       boolean b4, boolean b5, boolean b6) {
       // do nothing in this method; do your work in work01Question()
       boolean b = ((b1 ^ (b2 | b3)) && b4) || (b5 & b6); 
       System.out.println("Work01:Question: b = " + b);
    }
    static void work01Answer(boolean b1, boolean b2, boolean b3, 
       boolean b4, boolean b5, boolean b6) {
       
       boolean b = b1 ^ (b2 | b3) && b4 || b5 & b6; 
       System.out.println("Work01:Answer: b = " + b);
    }
    static void work02Question(int v1, int v2, int v3, int v4, int v5, int v6) {
       // do nothing in this method; do your work in work02Question()
       boolean b = ((v1 << v2) < v3) != (v3 > ((v4 ^ v5) | v6)); 
       System.out.println("Work02:Question: b = " + b);
    }
    static void work02Answer(int v1, int v2, int v3, int v4, int v5, int v6) {
      
       boolean b = v1 << v2 < v3 != v3 > (v4 ^ v5 | v6); 
       System.out.println("Work02: Question: b = " + b);
    }

   static void work03UseOfUtilityClass() {
     
       System.out.println(work03.MyUtil.calculateBMI(48, 160));
       System.out.println(work03.MyUtil.average(3, 4, 5));
   }

   static void work04UseOfObjectClass() {
       Person a1=new Person(1);
       a1.setId(1);
       Person a2=new Person(2);
       a2.setId(2);
       
       BankAccount b1=new BankAccount(1,a1);
       BankAccount b2=new BankAccount(2,a2);
       
       
       System.out.println(b1.deposit(10));
       System.out.println(b1.withdraw(2));
       
       b1.transfer(5,b2);
       System.out.println(b1.getBalance());
       System.out.println(b2.getBalance());
   }
}
