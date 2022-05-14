package com.company.Task10_2;


import java.util.ArrayList;

//Класс "Одноугольник", реализующий интерфейс фигуры.
class Point implements Figure {
    private R2Point p;

    public Point(R2Point p){
        this.p = p;
    }

    public double perimeter(){
        return 0.0;
    }

    public double area(){
        return 0.0;
    }

    public Figure addP(R2Point q){
        if(!R2Point.equals(p, q))
            return new Segment(p, q);
        else
            return this;
    }

    @Override
    public ArrayList<R2Point> getAllPoints() {
        ArrayList<R2Point> points = new ArrayList<>();
        points.add(p);
        return points;
    }
}