package com.example.phonetrianglesqare.figures;

public class Sqare extends Figure{
    @Override
    public float getPerimeter() {
        return 0;
    }

    @Override
    public float getArea() {
        return 0;
    }
    //диагональ
    public void getArea(float diagonal, float m1) {
        float area = 1 / 2 * (diagonal * diagonal);
        System.out.println(area);
    }

    public void getPerimeter(float diagonal, float m1) {
        float perm = (float) (2 * Math.sqrt(2) * diagonal);
        System.out.println(perm);
    }
    //сторона
    public void getArea(float side) {
        float area = side * side;
        System.out.println(area);
    }
    public void getPerimeter(float side) {
        float perm = 4 * side;
        System.out.println(perm);
    }
}
