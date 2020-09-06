package com.germlin.sort;

public class VersionControl {
    private final int badVersion;

    public VersionControl() {
        this.badVersion = 0;
    }
    public VersionControl(int version) {
        this.badVersion = version;
    }

    public boolean isBadVersion(int version) {
        return version >= this.badVersion;
    }
}
