/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shitalbk
 */
public class Test {
    // Objects may be passed to methods.
   int a,b;
   Test(int i,int j){
       a = i;
       b = j;
   }
   //return true if o is equal to the invoking object
   boolean equalTo(Test o){
       if(o.a == a && o.b == b)
           return true;
       
       else 
           return false;
   }
}
