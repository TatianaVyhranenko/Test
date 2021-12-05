package oop_practice.cat_dog.cat;

import oop_practice.cat_dog.animal.Animal;

public class Cat extends Animal {
    String name;

    public Cat(String name) {
        this.name = name;
    }

    public void sound() {
        System.out.println("I'am a Cat. My name is " + name + ". Mew");
    }
}
