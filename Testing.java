/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shitalbk
 */
import java.util.Scanner;


public class Testing{

     public static void main(String []args){
         Scanner sc = new Scanner(System.in);
        
         System.out.println("Please enter the size of the array: ");
       int num = sc.nextInt();
       int arr[] = new int[num];
       System.out.println("Input the numbers in the array: ");
       for(int i =0;i<arr.length;i++)
       {
          
           arr[i] = sc.nextInt();
       }
        for(int i=0;i<arr.length;i++)
        {
             
            if(arr[i] % 2==0)
            {
                System.out.println("Number is even");
            }
            else{
                System.out.println("Number is odd");
            }
            
        }
        int large = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(large < arr[i])
              large = arr[i];  
             
        }
       System.out.println("The large number is " + large);
     }
}
