package com.github.vjiki.springhello;

import java.util.Collection;

//POJO
public class House {
    private Window window;
    private int height;
    private Material wall;

    private Collection<Door> doors;

    //    public House() {
//    }

    public House(Window window ) { //, int height) {
        this.window = window;
        //this.height = height;
    }

    public void buildWall() {
        for (int i=1; i <= getHeight(); i++) {
            System.out.printf("Floor %d. ", i);
            getWall().cover();
        }
    }

    public void installDoors() {
        for(Door door : doors) {
            door.install();
        }
    }

    public Material getWall() {
        return wall;
    }

    public void setWall(Material wall) {
        this.wall = wall;
    }

    public Window getWindow() {
        return window;
    }

    public void setWindow(Window window) {
        this.window = window;
    }

    public void view() {
        this.window.open();
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Collection<Door> getDoors() {
        return doors;
    }

    public void setDoors(Collection<Door> doors) {
        this.doors = doors;
    }
}
