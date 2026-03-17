package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.powp.jobs2d.Job2dDriver;

public class LineDrawerAdapter implements Job2dDriver {
    private final DrawPanelController controller;
    private final ILine line;
    private int currentX, currentY;

    public LineDrawerAdapter(DrawPanelController controller, ILine line) {
        this.controller = controller;
        this.line = line;
    }
    @Override
    public void setPosition(int x, int y) {
        this.currentX = x;
        this.currentY = y;
    }

    @Override
    public void operateTo(int x, int y) {
        line.setStartCoordinates(currentX, currentY);
        line.setEndCoordinates(x, y);
        controller.drawLine(line);
        this.currentX = x;
        this.currentY = y;
    }
}
