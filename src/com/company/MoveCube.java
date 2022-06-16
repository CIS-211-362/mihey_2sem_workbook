package com.company;


import com.company.Move.Decrease.SliderDecreasePanel;
import com.company.Move.Down.SliderDownPanel;
import com.company.Move.Left.SliderLeftPanel;
import com.company.Move.Right.SliderRightPanel;
import com.company.Move.Up.SliderUpPanel;
import com.company.Move.X.SliderXPanel;
import com.company.Move.Y.SliderYPanel;
import com.company.Move.Z.SliderZPanel;

import javax.swing.*;
import java.awt.*;

public class MoveCube extends JPanel { //View

    public MoveCube(Cube cube, CubePanel cubePanel) {
        this.setBackground(Color.BLUE);

//        ButtonUp buttonUp = new ButtonUp(cube, cubePanel);
//        ButtonDown buttonDown = new ButtonDown(cube, cubePanel);
//        ButtonLeft buttonLeft = new ButtonLeft(cube, cubePanel);
//        ButtonRight buttonRight = new ButtonRight(cube, cubePanel);

        SliderXPanel sliderXPanel = new SliderXPanel(cube, cubePanel);
        SliderYPanel sliderYPanel = new SliderYPanel(cube, cubePanel);
        SliderZPanel sliderZPanel = new SliderZPanel(cube, cubePanel);
        SliderUpPanel sliderUpPanel = new SliderUpPanel(cube, cubePanel);
        SliderDownPanel sliderDownPanel = new SliderDownPanel(cube, cubePanel);
        SliderLeftPanel sliderLeftPanel = new SliderLeftPanel(cube, cubePanel);
        SliderRightPanel sliderRightPanel = new SliderRightPanel(cube, cubePanel);
        SliderDecreasePanel sliderDecreasePanel = new SliderDecreasePanel(cube, cubePanel);

        GridLayout grid = new GridLayout(3, 3);
//        FlowLayout downLevel = new FlowLayout();
        this.setLayout(grid);
//        this.add(buttonUp);
//        this.add(buttonDown, downLevel);
//        this.add(buttonLeft, downLevel);
//        this.add(buttonRight, downLevel);
//        this.add(new JTextField("X"));
        this.add(sliderXPanel);
        this.add(sliderYPanel);
        this.add(sliderZPanel);
        this.add(sliderUpPanel);
        this.add(sliderDownPanel);
        this.add(sliderLeftPanel);
        this.add(sliderRightPanel);
        this.add(sliderDecreasePanel);
    }

//    @Override
//    public void update(Observable o, Object arg) {
//        panel.repaint();
//    }
}
