package com.company.Task10_4;

import java.util.ArrayList;

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

    public double getlengthFromStraight(int x1, int y1, int x2, int y2, ConvexFrame frame){
        double length = Integer.MAX_VALUE;

        ArrayList<R2Point> points = this.getAllPoints();
        for (int i = 0; i < points.size(); i++) {
            int j = i + 1;
            if (j == points.size()) {
                j = 0;
            }

            R2Point point1 = points.get(i);
            R2Point point2 = points.get(j);

            length = Math.min(
                    Math.min(lengthFromStraight(x1, y1, x2, y2, point1),
                             lengthFromStraight(x1, y1, x2, y2, point2)),
                    length
            );
        }
        return length;
    }

    public double lengthFromStraight(int x1, int y1, int x2, int y2, R2Point p) {
        double numerator = (y1 - y2) * p.getX() + (x2 - x1) * p.getY() + (x1*y2 - x2*y1);
        double denominator = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
        return Math.abs(numerator / denominator);
    }
    public java.util.ArrayList<R2Point> getAllPoints(){
        return fig.getAllPoints();
    }
}