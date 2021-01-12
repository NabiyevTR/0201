package ru.geekbrains.ntr_0201.competition.units;

import ru.geekbrains.ntr_0201.competition.equipment.IObstacle;

public interface ICompetitor {

    boolean run(IObstacle obstacle);

    boolean jump(IObstacle obstacle);

    boolean obstacleOvercome(IObstacle obstacle);

    String getTypeAndName();

}
