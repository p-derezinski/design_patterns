package pl.derezinski.design_patterns.observer_pattern.swing;

import javax.swing.*;
import java.awt.*;

public class SwingObserverExample2 {

    JFrame frame;

    public static void main(String[] args) {

        SwingObserverExample2 example = new SwingObserverExample2();
        example.go();

    }

    public void go() {
        frame = new JFrame();

        JButton button = new JButton("Should I do it?");
        button.addActionListener(event -> System.out.println("Don't do it!"));
        button.addActionListener(event -> System.out.println("Do it!"));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.setSize(300,300);
        frame.setVisible(true);
    }

}
