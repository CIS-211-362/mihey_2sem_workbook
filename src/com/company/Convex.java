package com.company;

//Класс "Выпуклая оболочка".
class Convex{
    private Figure fig;

    public Convex(){
        fig = new Void();
    }

    public void addP(R2Point p){

        fig = fig.addP(p);
    }

    public double area(){
        return fig.area();
    }

    public double perimeter(){
        return fig.perimeter();
    }

    public java.util.ArrayList<R2Point> getAllPoints(){
        return fig.getAllPoints();
    }
}