package ru.geekbrains.lesson1;

public class Wall implements Obstacle{


    public int getHeight() {
        int height = 1;
        return height;
    }

    public void run (){

        System.out.println("Wall finished");
    }
}
