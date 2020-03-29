package com.galvanize.device;

public class Application {

    public static void main(String[] args){

        Smart smartPhone, smartTablet;
        Standard standardPhone, standardTablet;
        smartPhone = getSmartDevice();
        standardPhone = getStandardDevice();
        smartTablet = getSmartDevice();
        standardTablet = getStandardDevice();

        deviceInfo(smartPhone);
        deviceInfo(standardPhone);
        deviceInfo(smartTablet);
        deviceInfo(standardTablet);

    }

    public static Standard getStandardDevice(){
        Power power = new Power();
        OS os = new OS("Windows 10", "Professional");
        Volume volume = new Volume();
        return new Standard(ScreenSize.SMALL, power, volume,"home", os);
    }

    public static Smart getSmartDevice(){
        Power power = new Power();
        OS os = new OS("Windows 10", "Professional");
        Volume volume = new Volume();
        return new Smart(ScreenSize.LARGE, power, volume,"home", os);
    }

    public static void deviceInfo(Device device){
        System.out.println(" ----- Device details -----");
        System.out.println(" Device Number: " + device.getDeviceNumber());
        System.out.println(" Screen Size: " + device.getScreen().name());
        System.out.println(" OS Name: " + device.getOs().getModel());
        System.out.println(" OS Model : " + device.getOs().getModel());
        System.out.println(" Category : " + device.deviceCategory());
        System.out.println();
    }

}
