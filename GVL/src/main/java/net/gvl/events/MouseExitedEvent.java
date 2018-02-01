package net.gvl.events;

import net.gvl.Point;

import java.awt.event.MouseEvent;

public interface MouseExitedEvent {
    void onExit(MouseEvent event, Point point);
}
