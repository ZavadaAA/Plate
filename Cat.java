package ru.geekbrains.Lesson_7;

public class Cat
{
    private String name;
    private int appetite;
    private boolean bellyful;

    public Cat(String name, int appetite)
    {
        this.name = name;
        this.appetite = appetite;
        this.bellyful = true;
    }

        void info()
        {
        System.out.println(name + " уровень аппетита " + appetite + ".\n" + name + " приступает к обеду!");
        String isHungry = !bellyful ? " сыт" : " по-прежнему голоден... В тарелке мало еды";
        System.out.println(name + isHungry);
        }

        public void eat(Plate plate)
        {
        if(bellyful && plate.decreaseFood(appetite))
            {
                bellyful = false;
            }
        }
}