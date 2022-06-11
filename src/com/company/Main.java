package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Main extends JFrame {
    int width = 800;
    int height = 800;
    CubePanel cubePanel;

    public Main(){
        this.setTitle("Сладкий кубик");
        this.setSize(width, height);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container pane = this.getContentPane();
        pane.setLayout(new GridLayout(2, 1));
        Cube cube = new Cube();
        cube.translate(-0.5, -0.5, -0.5);
        cube.scale(100);
        cube.rotate(0, 0, 0);
        cube.rotate(45, 45, 45);

        CubePanel cubePanel = new CubePanel(cube);
        this.cubePanel = cubePanel;
        MoveCube moveCubePanel = new MoveCube(cube, cubePanel);

        pane.add(cubePanel);
        pane.add(moveCubePanel);

        this.setVisible(true);
    }

    @Override
    public void paint(Graphics g){
        Graphics2D gr = (Graphics2D) g;
        BasicStroke pen1 = new BasicStroke(2); //толщина линии 20
        gr.setStroke(pen1);
        g.clearRect(0, 0, width, height);

        super.paint(g);
//        g.translate(width/2, height/2);

        cubePanel.draw();
    }


    public static void main(String[] args) {new Main();}

}
