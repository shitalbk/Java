/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shitalbk
 */
public class Box {
    double width;
    double height;
    double depth;
    
    //compute and return volume
    double volume()
    {
        return width * height * depth;
    }
    //sets dimensions of box
    void setDim(double w, double h, double d)
    {
        width = w;
        height = h;
        depth = d;
    }
    
}
