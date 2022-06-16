package com.company.Move.Decrease;

import com.company.Cube;
import com.company.CubePanel;

import javax.swing.*;
import java.awt.*;

public class SliderDecreasePanel extends JPanel {

    public SliderDecreasePanel(Cube cube, CubePanel cubePanel) {
        FlowLayout grid = new FlowLayout();
        this.setLayout(grid);

        this.add(new JTextField("-"));
        this.add(new SliderDecrease(cube, cubePanel));
    }
}
