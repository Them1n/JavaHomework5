package org.example;

import org.example.IntValues.MyInt;
import org.example.Points.Point;

public class Main {
    public static void main(String[] args) {
        MyInt a1 = new MyInt(3);
        MyInt a2 = a1;
        System.out.println("Initial values: ");
        System.out.println("a1.x = " +a1.getX());
        System.out.println("a1.x = " +a2.getX());

        a1.setX(15);

        System.out.println("After change of a1: ");
        System.out.println("a1.x = " +a1.getX());
        System.out.println("a1.x = " +a2.getX());

        Point xy1 = new Point(5,10);
        Point xy2 = new Point(8,4);
        Point xy3 = new Point(1,7);
        Point xy4 = new Point(22,55);
        Point[] pointsArray = new Point[]{xy1, xy2, xy3, xy4};

        for (int i=0; i <pointsArray.length; i++){
            pointsArray[i].info();
        }
        System.out.println("**********************");
        for (int i=0; i <pointsArray.length; i++){
            if (pointsArray[i].getX() % 2 == 0 && pointsArray[i].getY() % 2 == 0){
                pointsArray[i].info();
            }
        }
    }
}