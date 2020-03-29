package com.galvanize.device;

public class Standard extends Device implements IStandard {

    public Standard(ScreenSize screenSize, Power power, Volume volume, String homeButton, OS os) {
        super(screenSize, power, volume, homeButton, os);
    }

    @Override
    public String deviceCategory(){
        return "Standard";
    }
}
