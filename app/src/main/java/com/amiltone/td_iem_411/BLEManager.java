package com.amiltone.td_iem_411;

/**
 * Created by amiltonedev_lt027 on 01/11/2016.
 */
public class BLEManager {
    private static BLEManager ourInstance = new BLEManager();
    public static BLEManager getInstance() {
        return ourInstance;
    }

    private BLEDevice currentDevice;

    private BLEManager() {
        currentDevice = new BLEDevice();
    }

    public boolean connectDevice() {
        return currentDevice.pairConnectDevice();
    }

    public String getBLELastValue() {
        return "Last value : " + currentDevice.getLastValue();
    }

    public String getBLELastValues() {
        String result = "Last values : \n";
        for (String bleValue : currentDevice.getLastValues()) {
            result+=bleValue+"\n";
        }
        return result;
    }

    private boolean isConnected() {
        return currentDevice.getStatus() == BLEDevice.CONNECTED;
    }
}
