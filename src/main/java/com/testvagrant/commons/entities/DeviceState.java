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

public class DeviceState {

    private boolean clearADBLogs;
    private boolean grantAllPermissions;
    private String fakeGPSLatLong;
    private boolean clearNotification;
    private boolean captureVideo;
    private String videoName;

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public boolean isCaptureVideo() {
        return captureVideo;
    }

    public void setCaptureVideo(boolean captureVideo) {
        this.captureVideo = captureVideo;
    }

    public boolean isClearADBLogs() {
        return clearADBLogs;
    }

    public void setClearADBLogs(boolean clearADBLogs) {
        this.clearADBLogs = clearADBLogs;
    }

    public boolean isGrantAllPermissions() {
        return grantAllPermissions;
    }

    public void setGrantAllPermissions(boolean grantAllPermissions) {
        this.grantAllPermissions = grantAllPermissions;
    }

    public String getFakeGPSLatLong() {
        return fakeGPSLatLong;
    }

    public void setFakeGPSLatLong(String fakeGPSLatLong) {
        this.fakeGPSLatLong = fakeGPSLatLong;
    }

    public boolean isClearNotification() {
        return clearNotification;
    }

    public void setClearNotification(boolean clearNotification) {
        this.clearNotification = clearNotification;
    }
}
