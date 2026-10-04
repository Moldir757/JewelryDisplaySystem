package com.jewelrydisplay;

public class ElegantDisplayStyle implements DisplayStyle {

    @Override
    public void display(String jewelryName) {
        System.out.println(
                "Elegant display: " + jewelryName +
                        " is shown on a luxury velvet stand."
        );
    }
}
