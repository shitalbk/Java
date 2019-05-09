/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shitalbk
 */
public class Access {
    public static void main(String args[])
    {
        B1 subOb = new B1();
        subOb.setij(10,12);
        subOb.sum();
        System.out.println("Total is " + subOb.total);
    }
}
