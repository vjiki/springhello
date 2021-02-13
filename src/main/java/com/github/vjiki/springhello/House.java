package com.github.vjiki.springhello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.Collection;
import java.util.Map;

//POJO
@Component // it will create a bean
public class House {
    private Window window;

    @Value("3") // здесь можно указывать SpEL
    private int height;

    //@Autowired(required=false)
    //@Qualifier("wood")
    //@WoodQualifier
    @Inject   // javax.inject
    @Named("woodBean") //javax.inject
    private Material wall;



    private Collection<Door> doors;
    // private List<Door> doors;
    // private Door[] doors;

    private Map<String,Door> doorsWithKey;

    //    public House() {
//    }

    @Autowired
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


    public void installDoorsWithKey() {
        for(Map.Entry<String, Door> e: doorsWithKey.entrySet()) {
            System.out.printf("Key %s. ", e.getKey() );
            e.getValue().install();
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


    public Map<String, Door> getDoorsWithKey() {
        return doorsWithKey;
    }

    public void setDoorsWithKey(Map<String, Door> doorsWithKey) {
        this.doorsWithKey = doorsWithKey;
    }
}
