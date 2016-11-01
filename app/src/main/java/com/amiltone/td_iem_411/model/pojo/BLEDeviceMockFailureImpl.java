package com.amiltone.td_iem_411.model.pojo;

import java.util.List;

/**
 * Created by amiltonedev_lt027 on 01/11/2016.
 */

public class BLEDeviceMockFailureImpl implements BLEDevice {
    private int status;

    public BLEDeviceMockFailureImpl() {
        status = OFFLINE;
    }

    public int getStatus() {
        return status;
    }

    public String getLastValue() {
        return null;
    }

    public List<String> getLastValues() {
        return null;
    }

    public boolean pairConnectDevice() {
        return false;
    }
}
