package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.powp.jobs2d.AbstractDriver;
import edu.kis.powp.jobs2d.features.DriverFeature;

public class FiguresJaneAdapter extends AbstractDriver {

    public FiguresJaneAdapter() {
        super(0, 0);
    }

    @Override
    public void operateTo(int x, int y) {
        DriverFeature.getDriverManager().getCurrentDriver().setPosition(getX(), getY());
        DriverFeature.getDriverManager().getCurrentDriver().operateTo(x, y);
    }
}