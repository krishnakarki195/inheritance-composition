package com.galvanize.device;

public class Power {

    private String state;

    public Power(){
        this.state = "off";
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Power{" +
                "state='" + state + '\'' +
                '}';
    }
}
