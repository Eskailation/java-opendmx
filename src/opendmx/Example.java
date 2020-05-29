package opendmx;

import com.juanjo.openDmx.OpenDmx;

public class Example {

    public static void connectToDMX() {
        OpenDmx.connect(OpenDmx.OPENDMX_TX);
    }
    
    public static void setLight(int channel, int value) {
        OpenDmx.setValue(channel, value);
    }
}
