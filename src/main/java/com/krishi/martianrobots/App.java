package com.krishi.martianrobots;

public class App {

    public static void main(String[] args) {
        //Pre-condition
        //Assert only one argument has been provided which specifies a file directory
        //Assert input coordinates <= 50
        //Assert instruction strings length <= 100 chars
        String fileDir = args[0];

        InputParser parser = new InputParser(fileDir);

        StateMachine stateMachine = parser.generateApplicationState();

        String output = stateMachine.triggerStateMachine();

        System.out.println(output);
    }
}
