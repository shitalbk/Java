/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shitalbk
 */
//Search an array using for-each style for.
import java.util.*;
public class Search {
    public static void main(String []args)
    {
        int nums[] = {6,8,3,7,5,6,1,4};
        
        boolean found = false;
        //take input from user
        System.out.println("Please enter a number: ");
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        
        //use for-each style for to search nums for val
        for(int x : nums)
        {
            if(x == val)
            {
                found = true;
                break;
            }
        }
        if(found)
            System.out.println("Value found!");
        else
            System.out.println("The number does not exist.");
        
        //nested loops to print tara
        int l,m;
        for(l=1;l<=5;l++)
        {
            for(m=0;m<l;m++)
                System.out.print("*");
            System.out.println();
        }
        int i,j;
        for(i=5;i>0;i--)
        {
            for(j=i;j>0;j--)
                System.out.print("*");
            System.out.println();
        }
        
        // int l,m;
        for(l=1;l<=5;l++)
        {
            for(m=0;m<l;m++)
                System.out.print("*");
            System.out.println();
        }
        
        for(i=5;i>0;i--)
        {
            for(j=i;j>0;j--)
                System.out.print("*");
            System.out.println();
        }
        
        //break loop
        for(i=0; i<100 ; i++)  
        {
           if(i == 10)
               break; //terminate loop if i is 10
           System.out.println("i: " + i);  
        }
        System.out.println("Loop complete.");
        
        //break to exit a while loop
        while(i<100)
        {
            if(i == 10)
                break; //terminate loop if i is 10
            System.out.println("i: " + i);
            i++;
        }
        System.out.println("Loop complete.");
        
        //using break with nested loops
        for(i =0;i<3;i++)
        {
            System.out.println("Pass " + i + ": ");
        
        for(j=0;j<100;j++)
        {
           if(j == 10)
               break; // terminate loop if j is 10
           System.out.print(j + " ");
        }
        System.out.println();
        }
        System.out.println("Loops complete");
        
        //Using break as a civilized form of goto.
        boolean t = false;
        first: {
            second: {
                third: {
                    System.out.println("Before the break.");
                    if(t)
                        break second; // break out of second block
                    System.out.println("This won't execute");
                }
                System.out.println("This won't execute");
            }
            System.out.println("This is after second block.");
        }
        
        //using break to exit from nested loops
        outer:for(i=0;i<3;i++){
            System.out.print("Pass " + i + ": ");
            for(j=0;j<100;j++){
                if(j == 10)
                    break outer; //exit both loops
                System.out.print(j + " ");
            }
            System.out.println("This will not print");
        }
        System.out.println("Loops complete.");
        
        //this program contains an error.
        one: for(i = 0; i<3;i++){
            System.out.print("Pass " + i + ": ");
        }
        one:for(j = 0;j<100; j++){
            if(j == 10)
                break one; // wrong
            System.out.print(j + " ");
        }
        System.out.println();
        
        //continue statement
        for(i =0;i<10;i++)
        {
            System.out.print(i + " ");
            if(i%2 == 0)
                continue;
            System.out.println("");
        }
        
        //using continue with a label
        outer: for(i=0;i<10;i++)
        {
            for(j=0;j<10;j++)
            {
                if(j>i)
                {
                    System.out.println();
                    continue outer;
                }
                System.out.print(" " + (i*j));
            }
        }
        System.out.println();
        
        //demonstrate return
          boolean to = true;
        System.out.println("Before the return.");
        if(to)
            return;
        //return to caller
        System.out.println("This won't execute.");
    }
}
