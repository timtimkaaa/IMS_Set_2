package com.example.set2;

public class Lamp {

    private boolean isOn = false;
    private int intensity = 0;
    private Bulb bulb;

    public void turnOn() {
        if(!bulb.isBurned()) {
            this.isOn = true;
            bulb.turnOn();
        }

        if (intensity == 0)
            intensity = 1;

    }
    public void turnOff() {
        this.isOn = false;
        intensity = 0;
        bulb.turnOff();
    }
    public void brighten() {
        if (!isOn) return;

        intensity++;
        if (intensity > 10) {
            bulb.burn();
            this.turnOff();
            intensity = 0;
        }
    }
    public void dim() {
        if (isOn) {
            intensity--;
        }
        if (intensity <= 1) {
            intensity = 0;
            turnOff();
        }
    }
    public boolean replaceBulb() {
        if (!isOn()) {
            bulb = new Bulb();
            return true;
        } else
            return false;

    }
    public boolean isOn() {
        return this.isOn;
    }
    public boolean isShining() {
        return bulb.isOn() && intensity == 0 && bulb.isOn() == true;
    }
    public boolean isBulbBurned() {
        return bulb.isBurned();
    }
    public int getIntensity() {
        return intensity;
    }
}
