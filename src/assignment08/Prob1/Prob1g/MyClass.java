/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment08.Prob1.Prob1g;

//we can't reference to this in a lambda expression. The semantic of this has been changed to reference to the

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

//instance of the surrounding class. There is no way to reference to the lambda expression from inside the lambda.
public class MyClass {

    int value1;
    String value2;
    public MyClass(int a, String b) {
        this.value1=a;
        this.value2=b;
    }
    Predicate<MyClass> p1 = this::equals;


    public void MyMethod(MyClass c1) {
        System.out.println("Is this instance equal to cl? " + p1.test(c1));
    }

    @Override
    public boolean equals(Object ob) {
        if (ob == null) {
            return false;
        }
        if (ob.getClass() != getClass()) {
            return false;
        }
        MyClass mc = (MyClass) ob;
        return mc.value1 == value1 && mc.value2.equals(value2);
    }

    public static void main(String[] args) {
        MyClass c1 = new MyClass(1,"Prabhab");
        c1.MyMethod(c1);
     
        
    }

}
