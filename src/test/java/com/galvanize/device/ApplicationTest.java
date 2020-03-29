package com.galvanize.device;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApplicationTest {

    @Test
    public void smartDeviceTest(){
        Smart smart = Application.getSmartDevice();
        assertEquals("LARGE", smart.getScreen().name());
        assertEquals("Smart", smart.deviceCategory());
    }

    @Test
    public void standardDeviceTest(){
        Standard standard = Application.getStandardDevice();
        assertEquals("SMALL", standard.getScreen().name());
        assertEquals("Standard", standard.deviceCategory());
    }

}
