package com.github.vjiki.springhello.builder;


public class WoodDoor implements Door {
    @Override
    public void install() {
        System.out.println("Install wood door ");
    }
}
