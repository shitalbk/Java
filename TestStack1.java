/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shitalbk
 */
public class TestStack1 {
    public static void main(String args[])
    {
        Stack1 mystack1 = new Stack1();
        Stack1 mystack2 = new Stack1();
        
        //push some numbers onto the stack
        for(int i = 0;i<10;i++) 
            mystack1.push(i);
        for(int i = 10;i<20;i++)
            mystack2.push(i);
        
        //pop those numbers off the stack
        System.out.println("Stack in mystack1: ");
        for(int i=0;i<10;i++)
            System.out.println(mystack1.pop());
        System.out.println("Stack in mystack2: ");
        
        for(int i=0;i<10;i++)
            System.out.println(mystack2.pop());
        // these statements are not legal
        // mystack1.tos = -2;
        // mystack2.stck[3] = 100;
    }
}
