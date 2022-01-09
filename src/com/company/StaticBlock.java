// The static method gets executed by default whenever a class is called (directly or by creating object).
// If multiple objects is created for the same class, static block gets executed only once.
// static method of main class always get executed, even without a statement in the main method.

// static variables can be accessed with class name or instance.

package com.company;

class Scaler
{
    static int i;
    static
    {
        System.out.println("a");
        i = 100;
    }
}

public class StaticBlock {
       static {
            System.out.println("b");
        }
        public static void main(String args[])
        {
            Scaler obj1 = new Scaler();
            System.out.println("1. obj1.i: "+obj1.i);
            Scaler obj2 = new Scaler();
            obj2.i = obj2.i +20;
            System.out.println("2. obj1.i: "+obj1.i);
            System.out.println("3. obj2.i: "+obj2.i);
        }
}
