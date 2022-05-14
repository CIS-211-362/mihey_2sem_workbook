package com.company.Task10_2;



import java.util.ArrayList;

interface Figure{
    public double perimeter();
    public double area();
    public Figure addP(R2Point p);
    ArrayList<R2Point> getAllPoints();
}