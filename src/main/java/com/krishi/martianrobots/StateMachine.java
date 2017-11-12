package com.krishi.martianrobots;

import java.awt.*;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

public class StateMachine {

    private final Queue<RobotState> robotStates;
    private final Point gridBounds;
    private Set<Point> robotScents;

    public StateMachine(Queue<RobotState> robotStates, Point gridBounds) {
        this.robotStates = robotStates;
        this.gridBounds = gridBounds;
        this.robotScents = new HashSet<>();
    }

    public Point getGridBounds() {
        return gridBounds;
    }

    public Set<Point> getRobotScents() {
        return robotScents;
    }

    public Queue<RobotState> getRobotStates() {
        return robotStates;
    }

    public String triggerStateMachine() {
        return null;
    }

    private void executeRobotInstructions(RobotState state) {

    }

}
