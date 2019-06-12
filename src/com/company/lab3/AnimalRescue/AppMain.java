package com.company.lab3.AnimalRescue;

public class AppMain {
    public static void main(String[] args) {
        Dog max = new Dog();
        System.out.println(max.breed);
        System.out.println(max.weight);
        max.drink();
        max.play();

    }
}
