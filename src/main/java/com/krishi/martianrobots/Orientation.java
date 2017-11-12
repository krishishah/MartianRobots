package com.krishi.martianrobots;

public enum Orientation {
    N("NORTH"),
    S("SOUTH"),
    E("EAST"),
    W("WEST");

    private String orientation;

    Orientation(String orientation) {
        this.orientation = orientation;
    }

    public String getOrientation() {
        return orientation;
    }
}
