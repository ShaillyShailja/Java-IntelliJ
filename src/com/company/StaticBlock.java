// The static method gets executed by default whenever a class is called (directly or by creating object).
// If multiple objects is created for the same class, static block gets executed only once.
// static method of main class always get executed, even without a statement in the main method.

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
        }
}

