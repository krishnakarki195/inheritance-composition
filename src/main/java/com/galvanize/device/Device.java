package com.galvanize.device;

import java.util.concurrent.ThreadLocalRandom;

public class Device {

    private ScreenSize screenSize;
    private final Long deviceNumber;
    private Power powerButton;
    private Volume volume;
    private String homeButton;
    private OS os;

    public Device(ScreenSize screenSize, Power powerButton, Volume volume, String homeButton, OS os) {
        this.screenSize = screenSize;
        this.deviceNumber = Device.generateDeviceNumber();
        this.powerButton = powerButton;
        this.volume = volume;
        this.homeButton = homeButton;
        this.os = os;
    }

    public static Long generateDeviceNumber() {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        return random.nextLong(10_000_000_000L, 100_000_000_000L);
    }

    public String deviceCategory(){
        return "Standard";
    }

    public Long getDeviceNumber(){
        return deviceNumber;
    }

    public ScreenSize getScreen() {
        return screenSize;
    }

    public void setScreen(ScreenSize screenSize) {
        this.screenSize = screenSize;
    }

    public Power getPowerButton() {
        return powerButton;
    }

    public void setPowerButton(Power powerButton) {
        this.powerButton = powerButton;
    }

    public Volume getVolume() {
        return volume;
    }

    public void setVolume(Volume volume) {
        this.volume = volume;
    }

    public String getHomeButton() {
        return homeButton;
    }

    public void setHomeButton(String homeButton) {
        this.homeButton = homeButton;
    }

    public String getHome() {
        return homeButton;
    }

    public void setHome(String homeButton) {
        this.homeButton = homeButton;
    }

    public OS getOs() {
        return os;
    }

    public void setOs(OS os) {
        this.os = os;
    }

    @Override
    public String toString() {
        return "Device{" +
                "screenSize=" + screenSize +
                ", deviceNumber=" + deviceNumber +
                ", powerButton=" + powerButton +
                ", volume=" + volume +
                ", homeButton='" + homeButton + '\'' +
                ", home='" + homeButton + '\'' +
                ", os=" + os +
                '}';
    }
}
