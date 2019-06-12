package com.company.lab2.Calculator;

public class Main {
    public static void main(String[] args) {
        int adunare = sum(9, 11);
        int scadere = dif(3,5);
        int inmultire = multi(6,7);
        int impartire = div(123,3);
        int temperatura = calcTemp(90);
        System.out.println(adunare);
        System.out.println(scadere);
        System.out.println(inmultire);
        System.out.println(impartire);
        Main.printJava();
        System.out.println("\n");
        Main.printFace();
        System.out.println(temperatura);
    }
   public static int sum(int firstnr, int secondnr) {
      int result = firstnr + secondnr;
      return result;
   }
   public static int dif(int firstnr, int secondnr){
       int result = firstnr - secondnr;
       return result;
   }
   public static int multi(int firstnr, int secondnr) {
        int result = firstnr * secondnr;
        return result;
   }
   public static int div(int firstnr, int secondnr){
        int result = firstnr / secondnr;
        return result;
     }
    public static void printJava(){
        System.out.println("   J    a   v     v  a");
        System.out.println("   J   a a   v   v  a a");
        System.out.println("J  J  aaaaa   v v  aaaaa");
        System.out.println(" JJ  a     a   v  a     a");
    }
    public static void printFace(){
        System.out.println(" +\"\"\"\"\"+");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  |");
        System.out.println(" | '-' |");
        System.out.println(" +-----+");
    }

    public static int calcTemp(int F){
        int C = 5/9*(F-32);
        return C;
    }
}
