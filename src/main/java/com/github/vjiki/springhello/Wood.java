package com.github.vjiki.springhello;

import org.springframework.stereotype.Component;

@Component("woodBean")
public class Wood implements Material{
    @Override
    public void cover() {
        System.out.println("Put woods ");
    }
}