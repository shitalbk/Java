/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shitalbk
 */
public class Test2 {
    int a, b;
    Test2(int i,int j)
    {
        a = i;
        b = j;
    }
    //pass an object
    void meth(Test2 o)
    {
        o.a *= 2;
        o.b /= 2;
    }
}
