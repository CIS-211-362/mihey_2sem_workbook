package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ButtonUp extends JButton {
    private final Cube cube;
    private final CubePanel panel;

    public ButtonUp(Cube cube, CubePanel panel) {
        this.setText("Up");

        ButtonUpListener up = new ButtonUpListener();
        this.addMouseListener(up);

        this.cube = cube;
        this.panel = panel;
    }

    private class ButtonUpListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {}

        @Override
        public void mousePressed(MouseEvent e) {
            cube.rotate(-1, 0, 0);
            panel.paint(panel.getGraphics());
        }

        @Override
        public void mouseReleased(MouseEvent e) {}
        @Override
        public void mouseEntered(MouseEvent e) {}

        @Override
        public void mouseExited(MouseEvent e) {}
    }
}


/*
import javax.swing.*;
import java.awt.event.*;

public class Controller extends JPanel {

    Cube cube;
    CubeFrame frame;

    public Controller(Cube cube, CubeFrame frame){

        JButton buttonUp = new JButton("Up");
        buttonUp.setLocation(0,0);
        JButton buttonDown = new JButton("Down");
        JButton buttonLeft = new JButton("Left");
        JButton buttonRight = new JButton("Right");

        add(buttonUp);
        add(buttonDown);
        add(buttonLeft);
        add(buttonRight);

        MouseListener Up = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cube.rotate(-1, 0, 0);
                frame.paint(frame.getGraphics());
            }
            @Override
            public void mousePressed(MouseEvent e) {;}
            @Override
            public void mouseReleased(MouseEvent e) {;}
            @Override
            public void mouseEntered(MouseEvent e) {;}
            @Override
            public void mouseExited(MouseEvent e) {;}
        };

        KeyListener keyListener = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                switch (keyCode) {
                    case KeyEvent.VK_UP:
                        cube.rotate(-1, 0, 0);
                        frame.paint(frame.getGraphics());
                        break;
                    case KeyEvent.VK_DOWN:
                        cube.rotate(1, 0, 0);
                        frame.paint(frame.getGraphics());
                        break;
                    case KeyEvent.VK_LEFT:
                        cube.rotate(0, 1, 0);
                        frame.paint(frame.getGraphics());
                        break;
                    case KeyEvent.VK_RIGHT:
                        cube.rotate(0, -1, 0);
                        frame.paint(frame.getGraphics());
                        break;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        };

        buttonUp.addMouseListener(Up);
        //buttonDown.addActionListener(Down);
        //buttonLeft.addActionListener(Left);
        //buttonRight.addActionListener(Right);
        frame.addKeyListener(keyListener);




        this.cube = cube;
        this.frame = frame;
    }

    private class MyButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            ;
        }
    }
}
 */
