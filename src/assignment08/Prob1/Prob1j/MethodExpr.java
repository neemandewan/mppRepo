/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment08.Prob1.Prob1j;

import java.util.function.Supplier;

public class MethodExpr {
    

    public class MyRandom implements Supplier<Double> {

        @Override
        public Double get() {
            return Math.random()*100;
        }
    }
    public static void main(String[] args) 
    {
        MethodExpr rand =  new MethodExpr();
        Supplier<Double> sup = rand.new MyRandom();
        System.out.println(sup.get());

    }
            
}
