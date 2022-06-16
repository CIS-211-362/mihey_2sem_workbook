package com.company.Move.Decrease;


import com.company.Cube;
import com.company.CubePanel;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderDecrease extends JSlider{
    private SliderDecrease slider;
    private final Cube cube;
    private final CubePanel panel;
    private double oldValue = 0.01;

    public SliderDecrease(Cube cube, CubePanel panel){
        super(1, 10, 1);
        this.cube = cube;
        this.panel = panel;
        this.slider = this;

        SliderListener listener = new SliderListener();
        this.addChangeListener(listener);

    }

    private class SliderListener implements ChangeListener {
        @Override
        public void stateChanged(ChangeEvent e) {
            double currentValue = slider.getValue() / 100.0;
//            System.out.println(currentValue);
//            System.out.println(oldValue);
//            if(currentValue < oldValue){
//                k = (int) (Math.pow(0.5,Math.abs(currentValue-oldValue)));
//            }
//            else if(slider.getValue() > oldValue){
//                k = (int) (Math.abs(currentValue-oldValue));
//            }
//            k = (int) (k / oldValue * slider.getValue());
//            System.out.println(k);
            if (oldValue == currentValue){
                return;
            }
            System.out.println(oldValue);
            System.out.println(currentValue);
            System.out.println();
            cube.scale((1/oldValue));
            cube.scale(currentValue);
            oldValue = currentValue;
            panel.repaint();
        }
    }
}

