/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment08.Prob1.Prob1j;

import java.util.function.Supplier;

public class Lambda {
    public static void main(String[] args) {
        Supplier<Double> myrand = ()->Math.random()*100;
        System.out.println("This is random " + myrand.get());
    }
}
