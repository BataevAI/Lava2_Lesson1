package ru.geekbrains.lesson1;

public class Human implements Essence {

    String name = "Andrey";
    int makeRun = 4;
    int makeJump = 2;
    Racetrack race = new Racetrack();
    Wall wall = new Wall();


    public void getName() {
        System.out.println(name);
    }

    public int getMakeRun() {
        return makeRun;
    }

    public int getMakeJump() {
        return makeJump;
    }

    @Override
    public void run() {

        System.out.println(name + " run!");

        if (makeRun > race.getLenght()) System.out.println(name + " overcame the Racetrack!");
        else System.out.println(name + " failed to go that Racetrack");
    }

    @Override
    public void jump() {
        System.out.println(name + " jump");
        if (makeJump > wall.getHeight()) System.out.println(name + " overcame the Wall!");
        else System.out.println(name + " failed to go that Wall");
    }

    @Override
    public void hurdling() {           // метод преодоление препятствий

        if ((makeRun > race.getLenght()) && (makeJump > wall.getHeight())) {

            System.out.println(name + " is finish!!");
        } else if ((makeRun <= race.getLenght()) | (makeJump <= wall.getHeight())) {

            System.out.println(name + " failed to go that way");
        }
    }


}
