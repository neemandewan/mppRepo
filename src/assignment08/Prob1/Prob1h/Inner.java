/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment08.Prob1.Prob1h;

import java.util.function.Supplier;


/**
 *
 * @author John
 */
public class Inner {

    public class MyClass implements Supplier<Double> {

        @Override
        public Double get() {
            return Math.random()*100;
        }
    }

    public static void main(String[] args) {
        Inner inner =  new Inner();
        Supplier<Double> sup = inner.new MyClass();
        System.out.println(sup.get());
        //This is Class::instanceMethod
    }
}
