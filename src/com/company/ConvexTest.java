package com.company;

import java.util.Scanner;

//Тест для выпуклой оболочки.
class ConvexTest {
    public static void main(String[] args){
//        randomTest();
        writeTest();
    }

    static void randomTest() {
        Convex convex = new Convex();
        ConvexFrame frame = new ConvexFrame(convex);
        for (int i = 0; i < 5; i++) {
            System.out.println('f');
            int x = (int) (Math.random() * 700) - 350;
            int y = (int) (Math.random() * 700) - 350;
            convex.addP(new R2Point(x, y));
            System.out.println(convex.getAllPoints().size());
            frame.repaint();
        }
    }

    static void writeTest() {
        Scanner in = new Scanner(System.in);
        Convex convex = new Convex();
        ConvexFrame frame = new ConvexFrame(convex);


        while (true) {
            System.out.println("x -> ");
            double x = in.nextDouble();
            System.out.println("y -> ");
            double y = in.nextDouble();

            convex.addP(new R2Point(x, y));
            frame.repaint();
            System.out.println("S = " + convex.area() + ", P = " + convex.perimeter());
        }
    }
}