/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shitalbk
 */
public class OverloadDemo {
    //Demonstrate method overloading
    void test(){
        System.out.println("No parameters");
    }
    //Overload test for one integer parameter.
    void test(int a){
        System.out.println("a: " + a);
    }
    //Overload test for two integer parameters.
    void test (int a, int b){
        System.out.println("a and b: " + a + " " + b);
    }
    //Overload test for a double parameter
    double test(double a){
        System.out.println("double a: " + a);
        return a * a;
    }
}
