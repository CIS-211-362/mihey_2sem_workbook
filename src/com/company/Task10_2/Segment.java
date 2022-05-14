package com.company.Task10_2;

import com.company.Task10_2.Figure;
import com.company.Task10_2.Polygon;
import com.company.Task10_2.R2Point;

import java.util.ArrayList;

//Класс "Двуугольник", реализующий интерфейс фигуры.
class Segment implements Figure {
    private R2Point p, q;

    public Segment(R2Point p, R2Point q){
        this.p = p;
        this.q = q;
    }

    public double perimeter(){
        return 2.0 * R2Point.dist(p, q);
    }

    public double area(){
        return 0.0;
    }

    public Figure addP(R2Point r){
        if(R2Point.isTriangle(p, q, r))
            return new Polygon(p, q, r);

        if(q.inside(p, r))
            q = r;

        if(p.inside(r, q))
            p = r;

        return this;
    }

    @Override
    public ArrayList<R2Point> getAllPoints() {
        ArrayList<R2Point> points = new ArrayList<>();
        points.add(p);
        points.add(q);
        return points;
    }
}