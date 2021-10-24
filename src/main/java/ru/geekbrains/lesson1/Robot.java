package ru.geekbrains.lesson1;

import java.sql.SQLOutput;

public class Robot implements Essence {

    String name = "AndRoid";
    int makeRun = 3;
    int makeJump = 6;
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

        if (makeRun > race.getLenght()) {
            System.out.println(name + " overcame the Racetrack!");
        } else if (makeRun <= race.getLenght()) {
            System.out.println(name + " failed to go that Racetrack");
        }

    }

    @Override
    public void jump() {
        System.out.println(name + " jump");
        if (makeJump > wall.getHeight()) System.out.println(name + " overcame the Wall!");
        else System.out.println(name + " failed to go that Wall");
    }


    @Override
    public void hurdling() {           // метод преодоления всех препятствий

        if ((makeRun > race.getLenght()) && (makeJump > wall.getHeight())) {

            System.out.println(name + " is finish!!");
        } else if ((makeRun <= race.getLenght()) | (makeJump <= wall.getHeight())) {

            System.out.println(name + " failed to go that way");
        }
    }


}


