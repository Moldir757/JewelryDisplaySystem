package com.jewelrydisplay;

public class NecklaceDisplay extends JewelryDisplay {

    private final String necklaceName;

    public NecklaceDisplay(
            String necklaceName,
            DisplayStyle displayStyle) {

        super(displayStyle);
        this.necklaceName = necklaceName;
    }

    @Override
    public void show() {
        displayStyle.display(necklaceName);
    }
}
