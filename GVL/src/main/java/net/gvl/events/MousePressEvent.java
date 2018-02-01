package net.gvl.events;

import net.gvl.Point;

import java.awt.event.MouseEvent;

public interface MousePressEvent {
    void onPress(MouseEvent event, Point point);
}
