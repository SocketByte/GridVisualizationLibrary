package net.gvl.events;

public class EventContainer {

    private MouseClickedEvent mouseClickedEvent;
    private MouseEnteredEvent mouseEnteredEvent;
    private MouseExitedEvent mouseExitedEvent;
    private MousePressEvent mousePressEvent;
    private MouseReleasedEvent mouseReleasedEvent;

    public MouseClickedEvent getMouseClickedEvent() {
        return mouseClickedEvent;
    }

    public void setMouseClickedEvent(MouseClickedEvent mouseClickedEvent) {
        this.mouseClickedEvent = mouseClickedEvent;
    }

    public MouseEnteredEvent getMouseEnteredEvent() {
        return mouseEnteredEvent;
    }

    public void setMouseEnteredEvent(MouseEnteredEvent mouseEnteredEvent) {
        this.mouseEnteredEvent = mouseEnteredEvent;
    }

    public MouseExitedEvent getMouseExitedEvent() {
        return mouseExitedEvent;
    }

    public void setMouseExitedEvent(MouseExitedEvent mouseExitedEvent) {
        this.mouseExitedEvent = mouseExitedEvent;
    }

    public MousePressEvent getMousePressEvent() {
        return mousePressEvent;
    }

    public void setMousePressEvent(MousePressEvent mousePressEvent) {
        this.mousePressEvent = mousePressEvent;
    }

    public MouseReleasedEvent getMouseReleasedEvent() {
        return mouseReleasedEvent;
    }

    public void setMouseReleasedEvent(MouseReleasedEvent mouseReleasedEvent) {
        this.mouseReleasedEvent = mouseReleasedEvent;
    }
}
