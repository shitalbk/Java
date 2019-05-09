/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shitalbk
 */
public class SavingsAccount {
    int balance;
    
    public SavingsAccount(int initialBalance){
        balance = initialBalance;
    }
    
    public static void main(String[] args)
    {
        SavingsAccount savings = new SavingsAccount(5000);
        
        //check balance:
        System.out.println("Hello!");
        System.out.println("Your balance is " + savings.balance);
        
        //withdrawing:
        int afterWithdraw = savings.balance - 300;
        savings.balance = afterWithdraw;
        System.out.println("You just withdrew" + 300);
        
        //check balance:
        System.out.println("Hello!");
        System.out.println("Your balance is " + savings.balance);
        
        //Deposit:
        int afterDeposit = savings.balance + 600;
        savings.balance = afterDeposit;
        System.out.println("You just deposited " + 600);
        
        //check balance:
        System.out.println("Hello!");
        System.out.println("Your balance is " + savings.balance);
        
        //deposit:
        int afterDeposit2 = savings.balance + 600;
        savings.balance  = afterDeposit2;
        System.out.println("You just deposited " + 600);
         
        //check balance:
        System.out.println("Hello!");
        System.out.println("Your balance is "+ savings.balance);
    }
}
