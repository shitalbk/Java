/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shitalbk
 */
public class Triangle extends Figure {
    Triangle(double a, double b){
        super(a,b);
    }
    //override area for right triangle
    double area(){
        System.out.println("Inside Area for Triangle.");
        return dim1 * dim2 / 2;
    }
}
