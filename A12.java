/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shitalbk
 */
public abstract class A12 {
    abstract void callme();
    
    //concrete methods are still allowed in abstract classes
    void callmetoo(){
        System.out.println("This is a concrete method.");
    }
}
