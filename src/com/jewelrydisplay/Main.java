package com.jewelrydisplay;

public class Main {

    public static void main(String[] args) {

        DisplayStyle elegantStyle = new ElegantDisplayStyle();
        DisplayStyle minimalistStyle = new MinimalistDisplayStyle();

        JewelryDisplay necklace =
                new NecklaceDisplay(
                        "Diamond Necklace",
                        elegantStyle);

        JewelryDisplay ring =
                new RingDisplay(
                        "Gold Ring",
                        minimalistStyle);

        System.out.println("JEWELRY DISPLAY SYSTEM");
        System.out.println();

        necklace.show();
        ring.show();

        System.out.println();
        System.out.println("SWITCHING DISPLAY STYLE");
        System.out.println();

        necklace =
                new NecklaceDisplay(
                        "Diamond Necklace",
                        minimalistStyle);

        ring =
                new RingDisplay(
                        "Gold Ring",
                        elegantStyle);

        necklace.show();
        ring.show();
    }
}