package com.bridgelabz;

public class LegacyAPI {

    // Marking this method as deprecated
    @Deprecated
    public static void oldFeature() {
        System.out.println("old");
    }

    public static void newFeature() {
        System.out.println("new");
    }

    public static void main(String[] args) {
        LegacyAPI.oldFeature();  // Warning suppressed
        LegacyAPI.newFeature();
    }
}
