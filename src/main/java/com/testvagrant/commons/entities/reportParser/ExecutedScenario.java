package com.testvagrant.commons.entities.reportParser;

import java.util.List;

public class ExecutedScenario {

    private String deviceName;
    private String id;
    private List<Step> steps;
    private byte[] embeddedFailedScreen;

    public byte[] getEmbeddedFailedScreen() {
        return embeddedFailedScreen;
    }

    public void setEmbeddedFailedScreen(byte[] embeddedFailedScreen) {
        this.embeddedFailedScreen = embeddedFailedScreen;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public List<Step> getSteps() {
        return steps;
    }

    public void setSteps(List<Step> steps) {
        this.steps = steps;
    }
}
