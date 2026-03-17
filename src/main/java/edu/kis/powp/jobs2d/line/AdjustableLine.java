package edu.kis.powp.jobs2d.line;

import edu.kis.legacy.drawer.shape.ILine;
import java.awt.Color;

public class AdjustableLine implements ILine {

    private int startX, startY, endX, endY;
    private Color color = Color.BLACK;
    private float thickness = 1.0f;
    private boolean dotted = false;

    public void setColor(Color color) {
        this.color = color;
    }

    public void setThickness(float thickness) {
        this.thickness = thickness;
    }

    public void setDotted(boolean dotted) {
        this.dotted = dotted;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public float getThickness() {
        return thickness;
    }

    @Override
    public boolean isDotted() {
        return dotted;
    }

    @Override
    public int getStartCoordinateX() {
        return startX;
    }

    @Override
    public int getEndCoordinateX() {
        return endX;
    }

    @Override
    public int getStartCoordinateY() {
        return startY;
    }

    @Override
    public int getEndCoordinateY() {
        return endY;
    }

    @Override
    public void setStartCoordinates(int x, int y) {
        this.startX = x;
        this.startY = y;
    }

    @Override
    public void setEndCoordinates(int x, int y) {
        this.endX = x;
        this.endY = y;
    }
}