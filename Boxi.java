/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shitalbk
 */
public class Boxi {
    double width;
    double height;
    double depth;
    // This is the constructor for Boxi when all dimensions specified
    Boxi(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
    //constructor used when no dimensions specified
    Boxi(){
        width = -1; //use -1 to indicate
        height = -1; // an uninitialized 
        depth = -1; //box
    }
    // constructor used when cube is created
    Boxi(double len){
        width = height = depth = len;
    }
    //compute and return volume
    double volume(){
        return width * height * depth;
    }
}
