package net.gvl;

import javax.swing.*;
import java.awt.*;

public class GridFrame {

    private final Grid grid;
    private final JFrame frame;

    public GridFrame(Grid grid) {
        this.grid = grid;
        GridPanel panel = grid.getGridPanel();
        frame = new JFrame(grid.getName());
        frame.setContentPane(panel);
        frame.setResizable(false);
        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        center();
    }

    public void center() {
        frame.setLocation(
                (Toolkit.getDefaultToolkit().getScreenSize().width - frame.getWidth()) / 2,
                (Toolkit.getDefaultToolkit().getScreenSize().height - frame.getHeight()) / 2);
    }

    public void show() {
        frame.setVisible(true);
    }

    public void hide() {
        frame.setVisible(false);
    }

    public void exit() {
        frame.dispose();
    }

    public Grid getGrid() {
        return grid;
    }

    public JFrame getFrame() {
         return frame;
    }
}
