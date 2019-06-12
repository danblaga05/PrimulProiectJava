package com.company.lab3.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(3,5));
        System.out.println(calc.dif(3,5));
        LogicalOp operator = new LogicalOp();
        System.out.println("numarul mai mare: "+operator.checkBiggerNumber(5,4));
        System.out.println(operator.compareStrings("FastTrack"));
        System.out.println(operator.nameNr("FastTrackIT", 4));
        System.out.println(operator.snowHeight(6));
        System.out.println(operator.greaterNr(4));
        operator.switchNr(3);
        System.out.println(operator.isNumberEven(4));
        System.out.println(operator.isEligibleToVote(18));
        System.out.println(operator.maxNr(9,10,2));

    }


   }

