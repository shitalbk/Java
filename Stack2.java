/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shitalbk
 */
public class Stack2 {
    private int stck[];
    private int tos;
    //allocate and initialize stack
    Stack2(int size){
        stck = new int[size];
        tos = -1;
    }
    //push an item onto the stack
    void push(int item)
    {
        if(tos==stck.length-1)//use length member
            System.out.println("Stack is full.");
        else
            stck[++tos] = item;
    }
    //pop an item from the stack
    int pop(){
        if(tos < 0)
        {
            System.out.println("Stack underflow.");
        return 0;
        }
         else
    return stck[tos--];   
    }
    
}
