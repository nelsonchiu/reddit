package com.example;

/**
 * Created by nelson on 8/9/15.
 */
public class MyMainClass {

    public static void main(String [ ] args)
    {

// HW 8
        /* // Testing instances of the Employee, Manager and Peon Classes to make sure data is added correctly

        Employee e1 = new Employee("chiu", "nelson", 25214, "Engineering");
        Employee e2 = new Employee("choi", "anthony", 99929, "Sales");
        Employee e3 = new Employee("huang", "richard", 12345, "Operations");
        //String a = e3.toString(5);
        //System.out.println(a);
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        Manager m1 = new Manager("li", "edwin", 22222, "Finance"); //
        Manager m2 = new Manager("chang", "will", 33333, "Coffee"); //
        //System.out.println(m2.getLastName());
        System.out.println(m1);
        System.out.println(m2);

        */

        Employee e, e2;
        Manager m, m2;
        Peon p, p2;
        m = new Manager("BOB", "THE", 00, "BUILDER");
        e = new Employee("NIHAO", "KAILAN", 11, "XIEXIE");
        p = new Peon("CURIOUS", "GEORGE", 22, "MONKEY", 5000, 123);

        // set e2 to same as Employee e, then set e2 to Manager m (does e2 just inherit properties of the Employee instance variables of m?
        // , then cast e2 to be manager and execute fire
        p2 = p;
        System.out.println("p2 attributes: "+ p2.first + p2.last + p2.id + p2.dept);
        System.out.println(p2);
        //e2 = m;
        //System.out.println("e2 attributes: " + e2.first + e2.last + e2.id + e2.dept);
        //System.out.println(e2);
        //((Manager) e2 ).fire();

        // set m2 to Employee e2 casted to be a Manager e2
        //m2 = (Manager)e2;
        //System.out.println("m2 attributes: "+ m2.first + m2.last + m2.id + m2.dept);
        //System.out.println(m2);
        //m2.fire();

        // e2 retains a Manager class
        System.out.println(p2.getClass());
/*
// HW 7
        last_first p1 = new last_first("Pimpin Peter", "Nelson Chiu");
        last_first p2 = new last_first("Georgeous Gina", "Nelson Chiu");

        Driver d = new Driver();
        d.play(p1,p2);
*/

/*
/// HW Assigments 1 through 6
        BankAccount b1 = new BankAccount("peaches");
        BankAccount b2 = new BankAccount("nelson", "chiu", 120202, "george");
        BankAccount b3 = new BankAccount("wayne", "chiu", 123456, 300.00, "falls");
        b2.withdraw(200,"george");
        b3.withdraw(50,"falls");
        b3.withdraw(50,"falls");
        b3.withdraw(50,"falls");
        b3.withdraw(50,"falls");
        b3.withdraw(50,"falls");

        prnt(b1);
        prnt(b2);
        prnt(b3);

        b2.transfer(b3,100);
        prnt(b2);
        prnt(b3);

        b1.printNA();
        b2.printNA();
        b3.printNA();
*/

    }

/*    public static void prnt(BankAccount b){
        System.out.println("account num: " + b.acctnum);
        System.out.println("account fname: " + b.fname);
        System.out.println("account lname: " + b.lname);
        System.out.println("account balance: " + b.balance);
    }
*/



}
