package com.amiltone.td_iem_411.model.pojo;

import java.util.List;

/**
 * Created by amiltonedev_lt027 on 01/11/2016.
 */

public interface BLEDevice {
    public static final int OFFLINE = 0;
    public static final int AVAILABLE = 1;
    public static final int CONNECTED = 2;

    int getStatus();
    String getLastValue();
    List<String> getLastValues();
    boolean pairConnectDevice();
}