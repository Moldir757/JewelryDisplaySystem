package com.jewelrydisplay;

public class MinimalistDisplayStyle implements DisplayStyle {

    @Override
    public void display(String jewelryName) {
        System.out.println(
                "Minimalist display: " + jewelryName +
                        " is shown on a simple white stand."
        );
    }
}
