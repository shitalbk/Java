/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shitalbk
 */
public class Box3 {
    double width;
    double height;
    double depth;
    
    //Notice this constructor. It takes an object of type Box.
    Box3(Box3 ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    //constructor used when all dimensions specified
    Box3(double w, double h, double d)
    {
        width = w;
        height = h;
        depth = d;
    }
    //constructor used when no dimsensions specified
    Box3(){
        width = -1; // use -1 to indicate
        height = -1; //an uninitialized
        depth = -1; // box
        
    }
    //constructor used when cube is created
    Box3(double len){
        width = height = depth = len;
    }

    Box3(Boxi mybox1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //compute and return volume
    double volume(){
        return width * height * depth;
    }
    
}
