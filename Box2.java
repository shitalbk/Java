/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shitalbk
 */
/*Box uses a parameterized constructor to 
initialize the dimensions of a box.
*/
public class Box2 {
    double width;
    double height;
    double depth;
    
    // This is the constructor for Box.
    Box2(double w,double h, double d)
    {
        width = w;
        height = h;
        depth = d;
    }
    //compute and return volume
    double volume()
    {
        return width * height * depth;
    }
}
