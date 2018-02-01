package net.gvl.events;

import net.gvl.Point;

import java.awt.event.MouseEvent;

public interface MouseReleasedEvent {
    void onRelease(MouseEvent event, Point point);
}
