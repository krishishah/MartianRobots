package com.krishi.martianrobots;

import org.junit.Assert;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

public class RobotStateTests {

    @Test
    public void getOrientationShouldReturnRobotStateCurrentOrientation() throws Exception {
        //Arrange
        RobotState state = new RobotState(Orientation.E, null);

        //Act
        Orientation o = state.getOrientation();

        //Assert
        Assert.assertEquals(Orientation.E, o);
    }

    @Test
    public void getCurrentPositionShouldReturnRobotCurrentPosition() throws Exception {
        //Arrange
        RobotState state = new RobotState(Orientation.E, new Point(1, 2));

        //Act
        Point p = state.getCurrentPosition();

        //Assert
        Assert.assertEquals(new Point(1, 2), p);
    }

    @Test
    public void getPreviousPositionShouldBeNullAtInitialisation() throws Exception {
        //Arrange
        RobotState state = new RobotState(Orientation.E, new Point(1, 2));

        //Act
        Point p = state.getPreviousPosition();

        //Assert
        Assert.assertEquals(null, p);
    }

    @Test
    public void setLostState() throws Exception {
    }

    @Test
    public void getInstructions() throws Exception {
    }

    @Test
    public void addInstructions() throws Exception {
    }

    @Test
    public void dequeueNextInstruction() throws Exception {
    }

    @Test
    public void canExecuteNextInstructionShouldReturnFalseIfInstructionSetIsEmpty() throws Exception {
        //Arrange
        RobotState state = new RobotState(Orientation.E, new Point(1, 2));

        //Act
        boolean canExecuteNextInstruction = state.canExecuteNextInstruction();

        //Assert
        Assert.assertFalse(canExecuteNextInstruction);
    }

    @Test
    public void executeNextInstruction() throws Exception {
        //Arrange
        RobotState state = new RobotState(Orientation.E, new Point(1, 2));

        //Act
        boolean canExecuteNextInstruction = state.canExecuteNextInstruction();

        //Assert
        Assert.assertFalse(canExecuteNextInstruction);
    }

    @Test
    public void peekNextInstructionExecutionPositionResult() throws Exception {
    }

}