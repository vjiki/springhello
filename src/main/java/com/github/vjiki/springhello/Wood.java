package com.github.vjiki.springhello;

public class Wood implements Material{
    @Override
    public void cover() {
        System.out.println("Put woods ");
    }
}
