package ru.geekbrains.ntr_0201.competition;

import ru.geekbrains.ntr_0201.competition.equipment.*;
import ru.geekbrains.ntr_0201.competition.units.*;


import java.util.ArrayList;
import java.util.List;

public class Stadium {

    public static void main(String[] args) {

        List<ICompetitor> competitorList = new ArrayList<>();
        competitorList.add(new Robot("Робокоп", 100, 0.35));
        competitorList.add(new Human("Иван", 200, 0.8));
        competitorList.add(new Cat("Гриша", 70, 1.2));
        competitorList.add(new Robot("T-800", 120, 0.25));
        competitorList.add(new Human("Александр", 250, 0.3));
        competitorList.add(new Cat("Василий", 80, 1.0));

        List<IObstacle> obstacles = new ArrayList<>();
        obstacles.add(new Wall(0.3));
        obstacles.add(new RunningTrack(50));
        obstacles.add(new Wall(0.6));
        obstacles.add(new RunningTrack(100));
        obstacles.add(new Wall(0.4));

        for (ICompetitor competitor : competitorList) {
            boolean isFinished = true;
            for (IObstacle obstacle : obstacles) {
                if (!competitor.obstacleOvercome(obstacle)) {
                    isFinished = false;
                    break;
                }
            }
            if (isFinished) {
                System.out.printf("%s финишировал.\n", competitor.getTypeAndName());
            } else {
                System.out.printf("%s сошел с дистанции.\n", competitor.getTypeAndName());
            }
            System.out.println();
        }
    }
}
