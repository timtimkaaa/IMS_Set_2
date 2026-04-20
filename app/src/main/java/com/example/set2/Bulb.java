package com.example.set2;



public class Bulb {
    private boolean isOn = false;
    private boolean isBurned = false;

    public void turnOn() {
        if (!isBurned)
            isOn = true;
    }
    public void turnOff() {
        isOn = false;
    }
    public boolean isOn() {
        return isOn;
    }
    public boolean isBurned() {
        return isBurned;
    }
    public void burn() {
        isBurned = true;
    }

}

