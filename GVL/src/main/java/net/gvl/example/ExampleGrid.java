package net.gvl.example;

import net.gvl.Grid;
import net.gvl.Point;

import java.awt.*;
import java.awt.event.MouseEvent;

public class ExampleGrid extends Grid {

    public ExampleGrid() {
        super("Example Grid", 40, 20);

        first().setColor(Color.green);
        last().setColor(Color.yellow);
    }

    @Override
    public void onPress(MouseEvent event, Point point) {
        point.setColor(Math.random() > .5 ? Color.red : Color.blue);

        System.out.println(point.getX() + ", " +
                        point.getY() + ", " +
                        point.getColor());
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
    public void onRelease(MouseEvent event, Point point) {

    }
}
