/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shitalbk
 */
import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.*;
import javax.swing.JFrame;

public class Tic_Test {
    public Tic_Test()
    {
        
    }
    public static void main(String []args)
    {
        
         Tic_Test tile = new Tic_Test();
        Tic_Test tile1 = new Tic_Test();
        Tic_Test tile2 = new Tic_Test();
        Tic_Test tile3 = new Tic_Test();
        JFrame frame = new JFrame("Game Frame");
        int EXIT_ON_CLOSE = JFrame.EXIT_ON_CLOSE;
        frame.setSize(500,600);
        frame.getContentPane().setLayout(new GridLayout(4,1));
         frame.setVisible(true);
        
        
      
         
         
    }
}
