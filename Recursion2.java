/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shitalbk
 */
public class Recursion2 {
    public static void main(String args[])
    {
        RecTest ob = new RecTest(10);
        int i;
        for(i = 0;i<10;i++)
            ob.values[i] = i;
        ob.printArray(10);
    }
}
