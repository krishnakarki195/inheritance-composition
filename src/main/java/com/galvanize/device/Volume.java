package com.galvanize.device;

public class Volume {

    private int volumeLevel;

    public Volume(){
        this.volumeLevel = 5;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        this.volumeLevel = volumeLevel;
    }

    @Override
    public String toString() {
        return "Volume{" +
                "volumeLevel=" + volumeLevel +
                '}';
    }
}
