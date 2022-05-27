package com.company.Task10_3;

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
        double old_length = length;
        R2Point[] ps = new R2Point[2];

        ArrayList<R2Point> points = this.getAllPoints();
        for (int i = 0; i < points.size(); i++) {
            int j = i + 1;
            if (j == points.size()) {
                j = 0;
            }

            R2Point point1 = points.get(i);
            R2Point point2 = points.get(j);

            old_length = length;
            length = Math.min(
                    Math.min(lengthFromStraight(x1, y1, x2, y2, point1),
                             lengthFromStraight(x1, y1, x2, y2, point2)),
                    length
            );
            if (old_length != length){
                ps[0] = point1;
                ps[1] = point2;
            }
        }
        return length;
    }

    public double lengthFromStraight(int x1, int y1, int x2, int y2, R2Point p) {
        double numerator = (y1 - y2) * p.getX() + (x2 - x1) * p.getY() + (x1*y2 - x2*y1);
//        if (numerator == 0.0){
//            return Integer.MAX_VALUE;
//        }
        double denominator = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
        return Math.abs(numerator / denominator);
    }
    public java.util.ArrayList<R2Point> getAllPoints(){
        return fig.getAllPoints();
    }
}