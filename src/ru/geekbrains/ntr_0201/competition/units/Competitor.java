package ru.geekbrains.ntr_0201.competition.units;

import ru.geekbrains.ntr_0201.competition.equipment.*;

public abstract class Competitor implements ICompetitor {
    private String name;
    private String competitorType;
    private double maxDistance;
    private double maxJump;


    public Competitor(String competitorType, String name, double maxDistance, double maxJump) {
        this.competitorType = competitorType;
        this.name = name;
        this.maxDistance = maxDistance;
        this.maxJump = maxJump;
    }

    @Override
    public boolean run(IObstacle obstacle) {

        if (maxDistance >= obstacle.getValue()) {
            System.out.printf("%s %s пробежал %.0f метров.\n", competitorType, name, obstacle.getValue());
            return true;
        } else {
            System.out.printf("%s %s не смог пробежать %.0f метров.\n", competitorType, name, obstacle.getValue());
            return false;
        }
    }

    @Override
    public boolean jump(IObstacle obstacle) {
        if (maxJump >= obstacle.getValue()) {
            System.out.printf("%s %s перепрыгнул препятствие высотой %.0f сантиметров.\n", competitorType, name, obstacle.getValue() * 100);
            return true;
        } else {
            System.out.printf("%s %s не смог перепрыгнуть препятствие высотой %.0f сантиметров.\n", competitorType, name, obstacle.getValue() * 100);
            return false;
        }
    }

    @Override
    public boolean obstacleOvercome(IObstacle obstacle) {
        if (obstacle instanceof RunningTrack) {
            return run(obstacle);
        } else if (obstacle instanceof Wall) {
            return jump(obstacle);
        } else {
            System.out.println("Ошибка! Неизвестный тип препятствия.");
            return false;
        }
    }

    @Override
    public String getTypeAndName() {
        return competitorType + " " + name;
    }
}
