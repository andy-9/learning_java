package org.example;

public class Rectangle {
    private int height;
    private int width;

    public void setHeight(int h) {
        height = h;
    }

    public void setWidth(int w) {
        width = w;
    }

    public void printArea() {
        System.out.println(height * width);
    }
}
