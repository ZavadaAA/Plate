package ru.geekbrains.Lesson_7;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println("Познакомьтесь - наши котики: ");
        Cat[] cats = {
                new Cat("Furguson", 20),
                new Cat("GrumpyCat", 35),
                new Cat("Maru", 14)};
        Plate plate = new Plate(50);

        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();

            plate.info();
            plate.addFood(100);
            plate.info();
        }
    }
}

