package com.driver;

public class Main {
 class Product{
   public static int product(int x,int y){
     return x*y;
   }
    public static int product(int x,int y,int z){
     return x*y*z;
   }
     public static double product(double x,double y){
     return x*y;
   }
  
}
  public static void main(String args []){
       Product p=new Product();
    p.product(6,8);
     p.product(6,8,5);
    p.product(6.0,8.1);
  }
}
