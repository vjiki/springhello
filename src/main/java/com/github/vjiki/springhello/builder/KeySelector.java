package com.github.vjiki.springhello.builder;

public class KeySelector {
    public String getKey(Door door) {
        if (door.getClass().equals(MetalDoor.class)){
            return "a";
        } else {
            return "b";
        }

    }
}
