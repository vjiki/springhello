package com.github.vjiki.springhello.builder;

public class MetalDoor implements Door{

    @Override
    public void install() {
        System.out.println("Install Metal Door ");
    }
}
