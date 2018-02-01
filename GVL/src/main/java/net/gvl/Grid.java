package net.gvl;

import net.gvl.events.*;

import java.awt.*;

public abstract class Grid extends EventContainer implements
        MouseClickedEvent, MouseEnteredEvent, MouseExitedEvent,
        MousePressEvent, MouseReleasedEvent {

    private final GridPanel gridPanel;
    private final GridFrame gridFrame;
    private final int size;
    private final int pointSize;
    private final Color gridColor;
    private final String name;

    private Point[][] points;

    public Grid(String name, int size, int pointSize) {
        this.points = new Point[size][size];
        this.size = size;
        this.fill();
        this.pointSize = pointSize;
        this.gridColor = Color.black;
        this.name = name;
        this.gridPanel = new GridPanel(this);
        this.gridFrame = new GridFrame(this);
    }

    public Grid(int size, int pointSize) {
        this.points = new Point[size][size];
        this.size = size;
        this.fill();
        this.pointSize = pointSize;
        this.gridColor = Color.black;
        this.name = "Grid";
        this.gridPanel = new GridPanel(this);
        this.gridFrame = new GridFrame(this);
    }

    public Grid(String name, int size, int pointSize, Color gridColor) {
        this.points = new Point[size][size];
        this.size = size;
        this.fill();
        this.pointSize = pointSize;
        this.gridColor = gridColor;
        this.name = name;
        this.gridPanel = new GridPanel(this);
        this.gridFrame = new GridFrame(this);
    }

    public Grid(int size, int pointSize, Color gridColor) {
        this.points = new Point[size][size];
        this.size = size;
        this.fill();
        this.pointSize = pointSize;
        this.gridColor = gridColor;
        this.name = "Grid";
        this.gridPanel = new GridPanel(this);
        this.gridFrame = new GridFrame(this);
    }

    public void showFrame() {
        this.gridFrame.show();
    }

    public void hideFrame() {
        this.gridFrame.hide();
    }

    public void exitFrame() {
        this.gridFrame.exit();
    }

    public Point getPoint(int x, int y) {
        int correctedY = y == size ? (y - 1) : y;
        int correctedX = x == size ? (x - 1) : x;

        if (notExist(correctedX, correctedY))
            return null;
        return points[correctedY][correctedX];
    }

    public Point last() {
        return points[size - 1][size - 1];
    }

    public Point first() {
        return points[0][0];
    }

    public Point getPointExact(int x, int y) {
        if (notExist(x, y))
            return null;
        return points[y][x];
    }

    private boolean notExist(int x, int y) {
        return x >= size
                || y >= size;
    }

    private void clear() {
        this.points = new Point[size][size];
        this.fill();
        this.gridPanel.update();
    }

    private void fill() {
        for (int x = 0; x < size; x++)
            for (int y = 0; y < size; y++)
                this.points[y][x] = new Point(this, x, y);
    }

    public int getSize() {
        return size;
    }

    public Point[][] getPoints() {
        return points;
    }

    public int getPointSize() {
        return pointSize;
    }

    public GridPanel getGridPanel() {
        return gridPanel;
    }

    public Color getGridColor() {
        return gridColor;
    }

    public String getName() {
        return name;
    }

    public GridFrame getGridFrame() {
         return gridFrame;
    }
}
