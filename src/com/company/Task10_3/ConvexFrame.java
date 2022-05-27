package com.company.Task10_3;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class ConvexFrame extends JFrame {
    public static final int width = 800;
    public static final int height = 800;
    private final Convex convex;
    public ArrayList<int[]> figures = new ArrayList<>();

    ConvexFrame(Convex convex) {
        this.convex = convex;
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
//        super.paint(g);
//        g.clearRect(-width / 2, -height / 2, width, height);

        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics g2 = bufferedImage.createGraphics();
        g2.translate(width / 2, height / 2);
        //или Graphics2D

        //отрисовка выпуклой оболочки и осей координат в g2 (а не в g)
        g2.setColor(Color.BLACK);
        g2.drawLine(-width / 2, 0, width / 2, 0);
        g2.drawLine(0, height / 2, 0, -height / 2);
        g2.setColor(Color.RED);

        ArrayList<R2Point> points = convex.getAllPoints();
        if (points.size() == 0) {
            return;
        }

        for (int i = 0; i < points.size(); i++) {
            int j = i + 1;
            if (j == points.size()) {
                j = 0;
            }

            R2Point point1 = points.get(i);
            R2Point point2 = points.get(j);
            if (point1 == null) {
                return;
            }
            g2.fillOval((int) point1.getX() - 5, (int) point1.getY() - 5, 10, 10);
            if (point2 == null) {
                return;
            }
            g2.drawLine((int) point1.getX(), (int) point1.getY(),
                    (int) point2.getX(), (int) point2.getY());

        }
        g2.setColor(Color.BLUE);
        for (int[] f : figures) {
            g2.drawLine(f[0], f[1], f[2], f[3]);
        }
        figures.clear();
        g.drawImage(bufferedImage, 0, 0, null); //или в g2d .paint(g);
    }
}
