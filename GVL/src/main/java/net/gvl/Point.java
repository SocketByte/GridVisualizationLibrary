package net.gvl;

import java.awt.*;

public class Point {

    private final Grid grid;
    private final int x;
    private final int y;
    private Color color;

    public Point(Grid grid, int x, int y) {
        this.grid = grid;
        this.x = x;
        this.y = y;
        this.color = Color.white;
    }

    private void update() {
        this.grid.getGridPanel().update();
    }

    public void reset() {
        this.color = Color.white;
        update();
    }

    public void setColor(Color color) {
        this.color = color;
        update();
    }

    public void setColor(int rgba) {
        this.color = new Color(rgba, true);
        update();
    }

    public void setColor(int r, int g, int b) {
        this.color = new Color(r, g, b);
        update();
    }

    public void setColor(int r, int g, int b, int a) {
        this.color = new Color(r, g, b, a);
        update();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Color getColor() {
        return color;
    }

    public Grid getGrid() {
        return grid;
    }
}
