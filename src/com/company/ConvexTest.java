package com.company;

import java.util.Scanner;

//Тест для выпуклой оболочки.
class ConvexTest {
    public static void main(String[] args){
        randomTest();
//        writeTest();
    }

    static void randomTest() {
        ConvexFrame frame = new ConvexFrame();
        Convex convex = new Convex();
        for (int i = 0; i < 4234234; i++) {
            int x = (int) (Math.random() * 700) - 350;
            int y = (int) (Math.random() * 700) - 350;
            convex.addP(new R2Point(x, y));
            frame.updPaint(convex);
        }
    }

    static void writeTest() {
        ConvexFrame frame = new ConvexFrame();
        Scanner in = new Scanner(System.in);

        Convex convex = new Convex();

        while (true) {
            System.out.println("x -> ");
            double x = in.nextDouble();
            System.out.println("y -> ");
            double y = in.nextDouble();

            convex.addP(new R2Point(x, y));
            frame.updPaint(convex);
            System.out.println("S = " + convex.area() + ", P = " + convex.perimeter());
        }
    }
}