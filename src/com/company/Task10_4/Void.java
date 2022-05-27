package com.company.Task10_4;

import java.util.ArrayList;

//Класс "Нульугольник", реализующий интерфейс фигуры.
class Void implements Figure {
    public double perimeter(){
        return 0.0;
    }

    public double area(){
        return 0.0;
    }

    public Figure addP(R2Point p){
        return new Point(p);
    }

    @Override
    public ArrayList<R2Point> getAllPoints() {
        return new ArrayList<>();
    }
}