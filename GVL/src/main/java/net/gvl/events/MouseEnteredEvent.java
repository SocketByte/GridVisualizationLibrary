package net.gvl.events;

import net.gvl.Point;

import java.awt.event.MouseEvent;

public interface MouseEnteredEvent {
    void onEnter(MouseEvent event, Point point);
}
