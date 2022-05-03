package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ConvexFrame extends JFrame {
    public static final int width = 800;
    public static final int height = 800;
    private ArrayList<R2Point> points = new ArrayList<>();

    ConvexFrame() {
        start();
    }

    private void start() {
        this.setSize(width, height);
        this.setTitle("Convex");
        this.setLocation(400, 400);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.translate(width / 2, height / 2);
        g.drawLine(-width/2, 0, width/2, 0);
        g.drawLine(0, height/2, 0, -height/2);
        g.setColor(Color.RED);

        if (points.size() == 0) {return;}

        for (int i = 0; i < points.size(); i++) {
            int j = i + 1;
            if (j == points.size()) {
                j = 0;
            }


            R2Point point1 = points.get(i);
            g.fillOval((int) point1.getX() - 5, (int) point1.getY() - 5, 10, 10);
            if (points.size() < 2) {
                break;
            }

            R2Point point2 = points.get(j);
            g.drawLine((int) point1.getX(), (int) point1.getY(),
                       (int) point2.getX(), (int) point2.getY());

        }
    }

    public void updPaint(Convex convex) {
        this.points = convex.getAllPoints();

        this.repaint();

    }
}