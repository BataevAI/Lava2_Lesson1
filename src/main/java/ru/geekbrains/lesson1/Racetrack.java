package ru.geekbrains.lesson1;

public class Racetrack implements Obstacle{

    public int getLenght() {
        int lenght = 3;
        return lenght;
    }

    public void run (){

        System.out.println("Racetrack finished");
    }

}
