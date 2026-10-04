package com.jewelrydisplay;

public class RingDisplay extends JewelryDisplay {

    private final String ringName;

    public RingDisplay(
            String ringName,
            DisplayStyle displayStyle) {

        super(displayStyle);
        this.ringName = ringName;
    }

    @Override
    public void show() {
        displayStyle.display(ringName);
    }
}
