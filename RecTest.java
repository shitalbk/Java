/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shitalbk
 */
public class RecTest {
    int values[];
    RecTest(int i){
        values = new int [i];
    }
    //display array -- recursively
    void printArray(int i)
    {
        if(i==0)
            return;
        else
            printArray(i-1);
        System.out.println("[" + (i-1) + "]" + values[i-1]);
    }
}
