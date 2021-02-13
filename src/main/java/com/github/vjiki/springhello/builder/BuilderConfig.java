package com.github.vjiki.springhello.builder;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


// аналог конфигурации xml
@Configuration
public class BuilderConfig {

    @Bean("wall")
    @Scope("prototype")
    public Brick bricks() {
        return new Brick();
    }

    @Bean
    public Window woodFrameWindow() {
        return new WoodFrameWindow();
    }

    @Bean
    public House house() {
        House house = new House(woodFrameWindow());
        house.setHeight(2);
        return house;

    }

}
