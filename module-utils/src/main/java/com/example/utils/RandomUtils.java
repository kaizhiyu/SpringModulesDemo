package com.example.utils;

import java.util.Random;
import java.util.UUID;

public class RandomUtils {

    public static String getUUID() {
        return UUID.randomUUID().toString();
    }

    public static String getRandom() {
        return Math.random() + "";
    }

}
