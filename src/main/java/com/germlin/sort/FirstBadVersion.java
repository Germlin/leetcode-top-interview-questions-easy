package com.germlin.sort;

public class FirstBadVersion extends VersionControl {
    public FirstBadVersion(int version) {
        super(version);
    }
    public int solution(int n) {
        int begin = 1;
        int end = n;
        if(isBadVersion(begin)) {
            return begin;
        }
        while(!isBadVersion(begin) && isBadVersion(end) && end - begin > 1) {
            int mid = begin + (end - begin) / 2;
            if(isBadVersion(mid)) {
                end = mid;
            } else {
                begin = mid;
            }
        }
        return end;
    }
}
