package com.krishi.martianrobots;

public enum Instruction {
    F("MOVE_FORWARD"),
    L("ROTATE_LEFT"),
    R("ROTATE_RIGHT");

    private String instruction;

    Instruction(String instruction) {
        this.instruction = instruction;
    }
}
