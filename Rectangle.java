/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shitalbk
 */
public class Rectangle extends Figure{
    Rectangle (double a, double b){
        super(a,b);
    }
    //override area for rectangle
    double area(){
        System.out.println("Inside Area for Retangle.");
        return dim1 * dim2;
    }
    
    
}
