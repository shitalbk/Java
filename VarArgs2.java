/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shitalbk
 */
public class VarArgs2 {
    // Here, msg is a normal parameter and v is a 
    // varargs parameter.
    static void vaTest(String msg, int ...v)
    {
        System.out.print(msg + v.length + "Contents: ");
        for(int x : v)
            System.out.print(x + " ");
        System.out.println();
        
    }
    public static void main(String args[])
    {
        vaTest("One vararg: ",10);
        vaTest("Three varargs: ",1,2,3,4,5,6);
        vaTest("No varargs: ");
    }
}
