/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shitalbk
 */
public class Box1 {
    double width;
    double height;
    double depth;
    
    //This is the constructor for Box.
    Box1(){
        System.out.println("Constructing Box");
        width = 10;
        height = 10;
        depth = 10;
    }
    //compute and return volume
    double volume()
    {
        return width * height * depth;
    }
}
