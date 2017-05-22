/*
 * Copyright (c) 2017.  TestVagrant Technologies
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.testvagrant.commons.entities;


import java.util.Date;

public class DeviceDetails {

    private String deviceName;
    private String udid;
    private String status;
    private String platform;
    private String platformVersion;
    private String runsOn;
    private Date buildStartTime;


    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getUdid() {
        return udid;
    }

    public void setUdid(String udid) {
        this.udid = udid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPlatformVersion() {
        return platformVersion;
    }

    public void setPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getRunsOn() {
        return runsOn;
    }

    public void setRunsOn(String runsOn) {
        this.runsOn = runsOn;
    }

    public Date getBuildStartTime() {
        return buildStartTime;
    }

    public void setBuildStartTime(Date buildStartTime) {
        this.buildStartTime = buildStartTime;
    }

    @Override
    public String toString() {
        return "DeviceDetails{" +
                "deviceName='" + deviceName + '\'' +
                ", udid='" + udid + '\'' +
                ", status='" + status + '\'' +
                ", platform=" + platform +
                ", platformVersion='" + platformVersion + '\'' +
                ", runsOn=" + runsOn +
                ", buildStartTime=" + buildStartTime +
                '}';
    }
}
