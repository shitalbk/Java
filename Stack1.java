/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shitalbk
 */
public class Stack1 {
    //now both the stck and tos are private. 
    //This means that they cannot be accidentally or maliciously
    //altered in a way that would be harmful to the stack.
    
    private int stck[] = new int[10];
    private int tos;
    //Initialize top-of-stack
    Stack1(){
        tos = -1;
    }
    //push an item onto the stack
    void push(int item)
    {
        if(tos == 9)
            System.out.println("Stack is full");
        else
            stck[++tos] = item;
    }
    //Pop an item from the stack
    int pop()
    {
        if(tos < 0){
            System.out.println("Stack underflow");
            return 0;
        }
        else
            return stck[tos--];
    }
}
