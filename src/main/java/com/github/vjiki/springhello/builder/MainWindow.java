package com.github.vjiki.springhello.builder;


//ordinary singleton
//not the spring singleton

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class MainWindow
        implements InitializingBean, DisposableBean { // this is second approach
    private MainWindow() {}


    // lazy init of singleton
    // when first time this class
    // will be accessed
    // thread safe
    private static class MainWindowHolder {
        static MainWindow instance = new MainWindow();
    }

    public static MainWindow getInstance() {
        return MainWindowHolder.instance;
    }

    public void show() {
        System.out.println("Show main window");
    }

    public void openConnection() {
        System.out.println("Main window open connection");

    }

    public void closeConnection() {
        System.out.println("Main window close connection");

    }

    // second approach
    @Override
    public void afterPropertiesSet() throws Exception {
        openConnection();
    }

    // second approach
    @Override
    public void destroy() throws Exception {
        closeConnection();
    }
}
