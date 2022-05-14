package com.company.Task10_2;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//Тест для выпуклой оболочки.
class ConvexTest {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("src/com/company/Task10_2/points.txt");
        Convex convex = new Convex();
        ConvexFrame frame = new ConvexFrame(convex);

        randomTest(fileWriter, convex, frame);
//        writeTest(fileWriter, convex, frame);
        fileWriter.close();
//        System.exit(0);
//        frame.disable();
    }

    static void randomTest(FileWriter fileWriter, Convex convex, ConvexFrame frame) throws IOException {
        for (int i = 0; i < 10000000; i++) {
            int x = (int) (Math.random() * 700) - 350;
            int y = (int) (Math.random() * 700) - 350;
            convex.addP(new R2Point(x, y));
            fileWriter.write("" + x + ", " + y + '\n');
            frame.repaint();
        }
    }

    static void writeTest(FileWriter fileWriter, Convex convex, ConvexFrame frame) throws IOException {
        Scanner in = new Scanner(System.in);
        try{
            while (true) {
                System.out.println("x -> ");
                double x = in.nextDouble();
                System.out.println("y -> ");
                double y = in.nextDouble();
                convex.addP(new R2Point(x, y));
                fileWriter.write("" + x + ", " + y + '\n');
                frame.repaint();
                System.out.println("S = " + convex.area() + ", P = " + convex.perimeter());
            }
        } catch (Exception e) {
//            e.printStackTrace();
        }

    }
}