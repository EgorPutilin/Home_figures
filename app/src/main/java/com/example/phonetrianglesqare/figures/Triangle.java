package com.example.phonetrianglesqare.figures;

public class Triangle extends Figure {
    @Override
    public float getPerimeter() {
        return 0;
    }

    @Override
    public float getArea() {
        return 0;
    }

    //сторона и высота
    public void getArea(float side, float high) {
        float area = side * high / 2;
        System.out.println(area);
    }

    public void getPerimeter(float side, float high) {
        System.out.println("Ошибка");
    }

    //2 стороны и угол между ними
    public void getArea(float side1, float side2, float corner) {
        if (corner > 0 && corner < 180) {
            double side1InRad = Math.toRadians(corner);
            double area = ((side1 * side2 * Math.sin(side1InRad)) / 2);
            System.out.println(area);
        } else {
            System.out.println("Ошибка");
        }
    }

    public void getPerimeter(float side1, float side2, float corner) {
        double side1InRad = Math.toRadians(corner);
        double side3 = Math.sqrt(side1 * side1 + side2 * side2 - 2 * side1 * side2 * Math.cos(side1InRad));
        double P = side1 + side2 + side3;
        System.out.println(P);
    }

    //2 угла и сторона, a = 1
    public void getArea(float corner1, float corner2, float side, int a) {
        double corner1InRad = Math.toRadians(corner1);
        double corner2InRad = Math.toRadians(corner2);
        double ClearRad = Math.toRadians(180 - corner1 - corner2);
        double area = (side * side * Math.sin(corner1InRad) * Math.sin(corner2InRad)) / (2 * Math.sin(ClearRad));
        System.out.println(area);
    }

    public void getPerimeter(float corner1, float corner2, float side, int a) {
        double corner1InRad = Math.toRadians(corner1);
        double corner2InRad = Math.toRadians(corner2);
        double ClearRad = Math.toRadians(180 - corner1 - corner2);
        double b = a * Math.sin(corner1InRad) / Math.sin(ClearRad);
        double c = a * Math.sin(corner2InRad) / Math.sin(ClearRad);
        double P = a + b + c;
        System.out.println(P);
    }

    public void getArea(float side1, float side2, float side3, float a, float a1) {
        if ((side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side2)) {
            float pTr = (side1 + side2 + side3) / 2;
            double area = Math.sqrt(pTr * (pTr - side1) * (pTr - side2) * (pTr - side3));
            System.out.println(area);
        } else {
            System.out.println("Ошибка");
        }
    }

    public void getPerimeter(float side1, float side2, float side3, float a, float a1) {
        if ((side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side2)) {
            float Perm = side1 + side2 + side3;
            System.out.println(Perm);
        } else {
            System.out.println("Ошибка");
        }
    }
}
