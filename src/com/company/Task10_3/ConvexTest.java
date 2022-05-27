package com.company.Task10_3;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

//Тест для выпуклой оболочки.
class ConvexTest {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("src/com/company/Task10_3/points.txt");
        Convex convex = new Convex();
        ConvexFrame frame = new ConvexFrame(convex);

//        randomTest(fileWriter, convex, frame);
//        writeTest(fileWriter, convex, frame);
        fromFileTest(fileWriter, convex, frame);

        fileWriter.close();
//        System.exit(0);
//        frame.disable();
    }

    static void randomTest(FileWriter fileWriter, Convex convex, ConvexFrame frame) throws IOException {
        for (int i = 0; i < 30; i++) {
            int x = (int) (Math.random() * 700) - 350;
            int y = (int) (Math.random() * 700) - 350;
            convex.addP(new R2Point(x, y));
            fileWriter.write("" + x + ", " + y + '\n');
            drawLine(frame, convex);
            frame.repaint();
        }
    }

    static void writeTest(FileWriter fileWriter, Convex convex, ConvexFrame frame) throws IOException {
        Scanner in = new Scanner(System.in);
        try {
            while (true) {
                System.out.println("x -> ");
                double x = in.nextDouble();
                System.out.println("y -> ");
                double y = in.nextDouble();
                convex.addP(new R2Point(x, y));
                fileWriter.write("" + x + ", " + y + '\n');
                drawLine(frame, convex);
                frame.repaint();
            }
        } catch (Exception e) {
//            e.printStackTrace();
        }

    }


    static void fromFileTest(FileWriter fileWriter, Convex convex, ConvexFrame frame) throws IOException {
        FileReader reader = new FileReader("src/com/company/Task10_3/input_points.txt");
        Scanner input_points = new Scanner(reader);
        while (input_points.hasNext()) {
            String[] cord = input_points.nextLine().split(", ");
            int x = Integer.parseInt(cord[0]);
            int y = Integer.parseInt(cord[1]);
            convex.addP(new R2Point(x, y));
            fileWriter.write("" + x + ", " + y + '\n');
            drawLine(frame, convex);
            frame.repaint();
        }
    }

    static void drawLine(ConvexFrame frame, Convex convex){
        int x1 = -50;
        int y1 = -20;
        int x2 = -50;
        int y2 = -60;
        frame.figures.add(new int[]{x1, y1, x2, y2});
        System.out.println("Длина:" + convex.getlengthFromStraight(x1, y1, x2, y2, frame));
    }
}