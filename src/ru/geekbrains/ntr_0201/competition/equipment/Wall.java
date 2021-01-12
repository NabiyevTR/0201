package ru.geekbrains.ntr_0201.competition.equipment;

public class Wall implements IObstacle {

    private double height;

    public Wall(double height) {
        this.height = height;
    }

    @Override
    public double getValue() {
        return height;
    }
}
