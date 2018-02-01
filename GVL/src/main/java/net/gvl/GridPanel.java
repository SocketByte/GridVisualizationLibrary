package net.gvl;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GridPanel extends JPanel implements MouseListener {

    private final Grid grid;

    public GridPanel(Grid grid) {
        this.grid = grid;
        setPreferredSize(new Dimension(
                grid.getPointSize() * grid.getSize(),
                grid.getPointSize() * grid.getSize()));
        addMouseListener(this);
        setBackground(Color.white);
    }

    public Grid getGrid() {
        return grid;
    }

    public void update() {
        repaint();
    }

    private int findRow(int y) {
        return (int) (((double)y) / getHeight() * grid.getSize());
    }

    private int findColumn(int x) {
        return (int) (((double)x) / getWidth() * grid.getSize());
    }

    protected void paintComponent(Graphics g) {
        g.setColor(getBackground());
        g.fillRect(0,0, getWidth(), getHeight());

        for (int x = 0; x < grid.getSize(); x++) {
            for (int y = 0; y < grid.getSize(); y++) {
                if (grid.getPoint(x, y) != null
                        && (grid.getPoint(x, y).getColor() != Color.white)) {
                    g.setColor(grid.getPoint(x, y).getColor());
                    g.fillRect(
                            (int)(y * (double) getWidth() / grid.getSize()),
                            (int)(x * (double) getHeight() / grid.getSize()),
                            ((int)((y + 1) * (double) getWidth() / grid.getSize()) -
                                    (int)(y * (double) getWidth() / grid.getSize())),
                            ((int)((x + 1) * (double) getHeight() / grid.getSize()) -
                                    (int)(x * (double) getHeight() / grid.getSize())));
                }
            }
        }
        g.setColor(grid.getGridColor());
        for (int x = 1; x < grid.getSize(); x++)
            g.drawLine(0, (int) (x * (double) getHeight() / grid.getSize()), getWidth(),
                    (int) (x * (double) getHeight() / grid.getSize()));
        for (int y = 1; y < grid.getSize(); y++)
            g.drawLine((int) (y * (double) getWidth() / grid.getSize()),0,
                    (int) (y * (double) getWidth() / grid.getSize()), getHeight());
    }

    @Override
    public void mouseClicked(MouseEvent event) {
        int x = findRow(event.getY());
        int y = findColumn(event.getX());
        Point point = grid.getPointExact(x, y);
        if (point == null)
            return;

        grid.onClick(event, point);

        if (grid.getMouseClickedEvent() == null)
            return;

        grid.getMouseClickedEvent().onClick(
                event, point);
    }

    @Override
    public void mousePressed(MouseEvent event) {
        int x = findRow(event.getY());
        int y = findColumn(event.getX());
        Point point = grid.getPointExact(x, y);
        if (point == null)
            return;

        grid.onPress(event, point);

        if (grid.getMousePressEvent() == null)
            return;

        grid.getMousePressEvent().onPress(
                event, point);
    }

    @Override
    public void mouseReleased(MouseEvent event) {
        int x = findRow(event.getY());
        int y = findColumn(event.getX());
        Point point = grid.getPointExact(x, y);
        if (point == null)
            return;

        grid.onRelease(event, point);

        if (grid.getMouseReleasedEvent() == null)
            return;

        grid.getMouseReleasedEvent().onRelease(
                event, point);
    }

    @Override
    public void mouseEntered(MouseEvent event) {
        int x = findRow(event.getY());
        int y = findColumn(event.getX());
        Point point = grid.getPointExact(x, y);
        if (point == null)
            return;

        grid.onEnter(event, point);

        if (grid.getMouseEnteredEvent() == null)
            return;

        grid.getMouseEnteredEvent().onEnter(
                event, point);
    }

    @Override
    public void mouseExited(MouseEvent event) {
        int x = findRow(event.getY());
        int y = findColumn(event.getX());
        Point point = grid.getPointExact(x, y);
        if (point == null)
            return;

        grid.onExit(event, point);

        if (grid.getMouseExitedEvent() == null)
            return;

        grid.getMouseExitedEvent().onExit(
                event, point);
    }
}
