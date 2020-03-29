package com.galvanize.device;

public class Smart extends Device implements IStandard {

    public Smart(ScreenSize screenSize, Power powerButton, Volume volume, String homeButton, OS os) {
        super(screenSize, powerButton, volume, homeButton, os);
    }

    @Override
    public String deviceCategory(){
        return "Smart";
    }

}
