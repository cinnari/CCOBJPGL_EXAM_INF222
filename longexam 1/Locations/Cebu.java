package Locations;

import Tourist.Tourist;

public class Cebu implements Locations {

    public int airFare = 300;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
    
}