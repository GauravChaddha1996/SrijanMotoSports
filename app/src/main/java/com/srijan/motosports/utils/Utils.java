package com.srijan.motosports.utils;

/**
 * Created by Batdroid on 14/1/17 for Srijan.
 */

public class Utils {
    public static int[] splitToComponentTimes(long biggy) {
        int hours = (int) biggy / 3600;
        int remainder = (int) biggy - hours * 3600;
        int mins = remainder / 60;
        remainder = remainder - mins * 60;
        int secs = remainder;

        return new int[]{hours, mins, secs};
    }
}
