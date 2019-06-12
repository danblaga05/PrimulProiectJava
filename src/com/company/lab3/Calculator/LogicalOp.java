package com.company.lab3.Calculator;

public class LogicalOp {

    public int checkBiggerNumber(int first, int second) {

        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    public String compareStrings(String test){
        if(test.equals("FastTrackIT")){
            return "Learning text comparison";
        } else{
            return "Got to try some more";
        }
    }

    public String nameNr(String text, int nr) {
        String result="";

        if (text.equals("FastTrackIT") && nr <= 3) {
            result = text + nr;
        } else if (nr >= 4) {
            result = nr + text;
        }

        return result;
    }
    public String snowHeight(int nr) {
        String result="";

        if (nr > 8 || nr == 6) {
            result = "The amount of snow this winter was(cm): " + nr;
        } else  {
            result = "The forecast snow is(cm): " + nr;
        }

        return result;
    }
    public String greaterNr(int nr) {
        String result="";

        if (nr > 3 && nr != 4) {
            result = "The number is greater than 3 and not equal to 4";
        } else if(nr == 4) {
            result = "The number is equal to 4";
        }else {
            result = "The number is lower than 3";
        }


        return result;
    }
    public static void switchNr(int nr){
        switch (nr) {
            case 1:
                System.out.println("The number is:  1!");
                break;
            case 2:
                System.out.println("The number is:  2!");
                break;
            case 3:
                System.out.println("The number is:  3!");
                break;
            case 4:
                System.out.println("The number is:  4!");
                break;
            case 5:
                System.out.println("The number is:  5!");
                break;
            case 6:
                System.out.println("The number is:  6!");
                break;
            case 7:
                System.out.println("The number is:  7!");
                break;
        }
    }
    public boolean isNumberEven(int nr){
        if (nr % 2 == 0){
            return true;
        }else {
            return false;
        }
    }
    public boolean isEligibleToVote(int age){
        if (age >= 18){
            return true;
        }else {
            return false;
        }
    }
    public int maxNr(int nr1, int nr2, int nr3) {
        int max = 0;
        if (nr1 > max){
            max = nr1;
        }if (nr2 > max) {
            max = nr2;
        }if (nr3 > max){
             max = nr3;
        }
        return max;
    }
}
