package com.jewelrydisplay;

public abstract class JewelryDisplay {

    protected DisplayStyle displayStyle;

    public JewelryDisplay(DisplayStyle displayStyle) {
        this.displayStyle = displayStyle;
    }

    public abstract void show();
}