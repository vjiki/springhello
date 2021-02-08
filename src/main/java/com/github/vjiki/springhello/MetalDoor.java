package com.github.vjiki.springhello;

public class MetalDoor implements Door{

    @Override
    public void install() {
        System.out.println("Install Metal Door ");
    }
}
