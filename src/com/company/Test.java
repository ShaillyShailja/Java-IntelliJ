// Static variables are called using class names or instances.
// Non-static variables are called using objects.
//Static blocks cannot be used to initialise non-static variables.

package com.company;

class Test {
    static int i;
    int j=20;
    static
    {
        i = 10;
        System.out.println("static block called ");
    }
}
class GFG {
    public static void main(String args[])
    {
        System.out.println(Test.i);
        Test ob = new Test();
        System.out.println(ob.j);
    }
}
