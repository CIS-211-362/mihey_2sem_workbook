package com.company;

import javax.swing.*;
import java.awt.*;

public class MoveCube extends JPanel { //View

    private Cube cube;

    public MoveCube(Cube cube, CubePanel cubePanel) {
        this.setBackground(Color.BLUE);
        ButtonUp buttonUp = new ButtonUp(cube, cubePanel);
        ButtonDown buttonDown = new ButtonDown(cube, cubePanel);
        ButtonLeft buttonLeft = new ButtonLeft(cube, cubePanel);
        ButtonRight buttonRight = new ButtonRight(cube, cubePanel);

        GridLayout grid = new GridLayout(2, 1);
        FlowLayout downLevel = new FlowLayout();

        this.setLayout(grid);
        this.add(buttonUp);
        this.add(buttonDown, downLevel);
        this.add(buttonLeft, downLevel);
        this.add(buttonRight, downLevel);

        this.cube = cube;
    }

//    @Override
//    public void update(Observable o, Object arg) {
//        panel.repaint();
//    }
}
