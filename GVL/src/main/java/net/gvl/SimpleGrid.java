package net.gvl;

import java.awt.*;
import java.awt.event.MouseEvent;

public class SimpleGrid extends Grid {
    public SimpleGrid(String name, int size, int pointSize) {
        super(name, size, pointSize);
    }

    public SimpleGrid(int size, int pointSize) {
        super(size, pointSize);
    }

    public SimpleGrid(String name, int size, int pointSize, Color gridColor) {
        super(name, size, pointSize, gridColor);
    }

    public SimpleGrid(int size, int pointSize, Color gridColor) {
        super(size, pointSize, gridColor);
    }

    @Override
    public void onClick(MouseEvent event, Point point) {

    }

    @Override
    public void onEnter(MouseEvent event, Point point) {

    }

    @Override
    public void onExit(MouseEvent event, Point point) {

    }

    @Override
    public void onPress(MouseEvent event, Point point) {

    }

    @Override
    public void onRelease(MouseEvent event, Point point) {

    }
}
