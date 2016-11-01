package com.amiltone.td_iem_411.model.pojo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by amiltonedev_lt027 on 01/11/2016.
 */

public class BLEDeviceMockImpl implements BLEDevice {
    private int status;

    public BLEDeviceMockImpl() {
        status = AVAILABLE;
    }

    public int getStatus() {
        return status;
    }

    public String getLastValue() {
        return getRandomValue();
    }

    public List<String> getLastValues() {
        List<String> resultValues = new ArrayList<>();
        for (int i = 0 ; i< 15;i++) {
            resultValues.add(getRandomValue());
        }
        return resultValues;
    }

    public boolean pairConnectDevice() {
        status = CONNECTED;
        return true;
    }

    private String getRandomValue() {
        return Integer.toString(ThreadLocalRandom.current().nextInt(20, 180 + 1));
    }
}
