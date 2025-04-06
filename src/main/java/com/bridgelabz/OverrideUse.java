package com.bridgelabz;

class Animal{
    public void makeSound(){
        System.out.println("Animal sound...");
    }
}
class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Dog sound...");
    }
}



public class OverrideUse {
    public static void main(String[] args) {
Dog dog =new Dog();
dog.makeSound();
    }
}
