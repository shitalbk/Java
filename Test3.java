/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shitalbk
 */
public class Test3 {
    int a; //default access
    public int b; // public access
    private int c; //private access
    //methods to access c
    void setc(int i){
        c = i;
    }
    int getc(){
        return c;
    }
}
