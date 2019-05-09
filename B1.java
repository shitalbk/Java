/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shitalbk
 */
//A1's j is not accessible here.
public class B1 extends A1 {
    int total;
    
    void sum()
    {
        total = i + j; //ERROR, j is not accessible here
    }
    
}
