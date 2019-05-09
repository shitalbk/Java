/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shitalbk
 */
public class AccessTest {
    public static void main(String args[])
    {
        Test3 ob = new Test3();
        //These are OK, a and b may be accessed directly
        ob.a = 10;
        ob.b = 20;
        
        //This is not OK and will cause an error
        //ob.b = 20; //Error!
        //You must access c through its methods
        ob.setc(100); //OK
        System.out.println("a, b and c: " + ob.a + " " + ob.b + " " + ob.getc());
    }
}
