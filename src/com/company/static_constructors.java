// Constructors are called only when an object is created.
// Static blocks get executed whenever the class is accessed, but only once.
// A class can have multiple static blocks.
// Static blocks get executed in the order in which they appear in the class.

package com.company;

class const_class{
    const_class(){
        System.out.println("Constructor was called.");
    }
    static int i;
    static{
        i=30;
        System.out.println("Static method 3 was called.");
    }
    static{
        i=10;
        System.out.println("Static method 1 was called.");
    }
    static{
        i=20;
        System.out.println("Static method 2 was called.");
    }


}

public class static_constructors {
    public static void main(String[]args){
        System.out.println("i="+const_class.i);
        const_class ob1=new const_class();
        const_class ob2=new const_class();
    }

}
