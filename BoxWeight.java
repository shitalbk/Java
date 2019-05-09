/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shitalbk
 */
// Here, Box is extended to include weight
public class BoxWeight extends Box5{
    double weight; // weight of box
    // constructor for BoxWeight
    BoxWeight (double w, double h, double d, double m)
    {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
    
    
}
