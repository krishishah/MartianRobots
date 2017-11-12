package com.krishi.martianrobots;

import java.awt.*;
import java.util.Queue;

public class RobotState {

    private Queue<Instruction> instructions;
    private Orientation orientation;
    private Point currentPosition;

    public RobotState(Orientation orientation, Point position) {
        this.orientation = orientation;
        this.currentPosition = position;
        this.instructions = null;
    }

    public void addInstructions(Queue<Instruction> instructions) {
        this.instructions = instructions;
    }

    public void executeNextInstruction() {

    }

    public Orientation getOrientation() {
        return orientation;
    }

    public Point getCurrentPosition() {
        return currentPosition;
    }

    public Queue<Instruction> getInstructions() {
        return instructions;
    }
}
