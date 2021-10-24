package ru.geekbrains.lesson1;

public class Main {

    public static void main(String[] args) {

        Robot robot = new Robot();
        Human human = new Human();
        Cat cat = new Cat();
        Racetrack racetrack = new Racetrack();
        Wall wall = new Wall();

        Essence[] essence = {robot, human, cat};
        Obstacle[] obstacle = {racetrack, wall};
        System.out.println(" Task 3 ");
// Задание 3
        // Для каждого объекта - человек, робот, кот вызываем свои методы преодоления препятствий
        for (Essence o : essence) {
            o.run();
            o.jump();
            System.out.println(" ");
        }
        // Для каждого препятствия - стены, беговой дорожки вызываем свои методы преодоления данных препятствий

        for (Obstacle o : obstacle) {

            o.run();

        }
        System.out.println(" Task 4 ");
// Задание 4
        for (Essence o : essence) {
            o.hurdling();
            System.out.println(" ");
        }


    }

}
