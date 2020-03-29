package com.galvanize.device;

public interface ISmart {

    public OS share();
    public  boolean connect(Device device);
    public boolean control(Device device);

}
