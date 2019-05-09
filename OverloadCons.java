/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shitalbk
 */
public class OverloadCons {
    public static void main(String args[])
    {
        // create boxes using the various constructors
        Boxi mybox1 = new Boxi(10, 20, 15);
        Boxi mybox2 = new Boxi();
        Boxi mycube = new Boxi(7);
        double vol;
        Box3 myclone = new Box3(mybox1); //create copy of mybox1
        //get volume of first box
        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is" + vol);
        
        //get volume of second box
        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " + vol);
        
        //get volume of cube
        vol = mycube.volume();
        System.out.println("Volume of mycube is " + vol);
        
     //   get volume clone
          vol = myclone.volume();
          System.out.println("Volume of clone is " + vol );
    }
}
