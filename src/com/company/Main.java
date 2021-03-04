package com.company;

public class Main {

    public static void main(String[] args) {

        Cat kot = new Cat();
        Dog pies = new Dog();

        kot.name = "Mruczek";
        kot.color = "Biały";
        kot.makeSound();

        pies.name = "Stary";
        pies.color = "Czarny";
        pies.makeSound();
    }
}
