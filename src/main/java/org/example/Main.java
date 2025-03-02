package org.example;

public class Main {
    public static void main(String[] args) {
        Dog dogShar = new Dog();
        dogShar.jamp(" Шарик ", 5);

        Cats catBarsik = new Cats();
        catBarsik.swim(" Барсик ", 4);

        Bowl bowl = new Bowl(70);

        Cats cats = new Cats("ghf");



        System.out.println("Создано животных: " + Animal.getCountAnimals());
        System.out.println("Создано котиков: " + Cats.getCountCats());
        System.out.println("Сщздано сабачек: " + Dog.getCountDogs());
    }
}