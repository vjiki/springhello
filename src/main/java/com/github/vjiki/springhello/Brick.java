package com.github.vjiki.springhello;

public class Brick implements Material{
    @Override
    public void cover() {
        System.out.println("Put bricks");
    }
}
