package com.github.vjiki.springhello;

import org.springframework.stereotype.Component;

@Component
public class PlasticWindow implements Window{
    @Override
    public void open() {
        System.out.println("Plastic window opened");
    }
}
