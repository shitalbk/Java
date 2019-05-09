/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shitalbk
 */
public class Store {
    // instance fields
  String productType;
  double price;
  
  // constructor method
  public Store(String product, double initialPrice){
      productType = product;
      price = initialPrice;
  }
  
  //increase price method
  public void increasePrice(double priceToAdd)
  {
      double newPrice = price + priceToAdd;
      price = newPrice;
  }
  public double getPriceWithTax()
  {
      double totalPrice = price + price * 0.08;
      return totalPrice;
  }
  
  //main method
  public static void main(String[] args)
  {
      Store lemonadeStand = new Store("Lemonade", 3.75);
      double lemonadePrice = lemonadeStand.getPriceWithTax();
      System.out.println(lemonadePrice);
  }
}
