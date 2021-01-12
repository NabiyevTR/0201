package ru.geekbrains.ntr_0201.competition.equipment;

public class RunningTrack implements IObstacle {

    private double length;

    public RunningTrack(double length) {
        this.length = length;
    }

    @Override
    public double getValue() {
        return length;
    }
}
