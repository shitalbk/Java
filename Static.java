/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shitalbk
 */
public class Static {
    //static keyword can be used to make the variables, methods class level and can be used without creating objects in the entire class
    //static method
    static int num;
    static String str;
    //static first block
    static{
            num = 89;
            str  = "Hello";
          };
    //static second block
   
    static{
         num = 98;
        str = "Hell Oh";
    }
    
    static void myMethod()
    {
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        myMethod();
        System.out.println(num);
        System.out.println(str);
        //if there are multiple static blocks with same variable names then the variable will over ride the last value over the first one
    }
}
