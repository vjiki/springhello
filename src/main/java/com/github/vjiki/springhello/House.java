package com.github.vjiki.springhello;

//POJO
public class House {
    private Window window;
    private int height;

//    public House() {
//    }

    public House(Window window ) { //, int height) {
        this.window = window;
        //this.height = height;
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
}
