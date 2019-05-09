/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shitalbk
 */
public class Box5 {
    double width;
    double height;
    double depth;
    
    //construct clone of an object
    Box5(Box5 ob){
        //pass object to constructor
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    //constructor used when all dimensions specified
    Box5(double w, double h, double d)
    {
        width = w;
        height = h;
        depth = d;
    }
    //constructor used when no dimensions specified
    Box5(){
        width = -1; // use -1 to indicate
        height =  -1; // an uninitialized
        depth = -1; //box
    }
    //constructor used when cube is created
    Box5(double len)
    {
        width = height = depth = len;
    }
    //compute and return volume
    double volume()
    {
        return width * height * depth;
    }
}
