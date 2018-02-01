package net.gvl.events;

import net.gvl.Point;

import java.awt.event.MouseEvent;

public interface MouseClickedEvent {
    void onClick(MouseEvent event, Point point);
}
