package com.kodilla.stream.beautifier;

public class DecorateMethods {
    public static String addABCAtTheBeginningAndEnd(String textToBeauty) {
        return "~ABC~ " + textToBeauty + " ~ABC~";
    }

    public static String toUpperCaseText(String textToBeauty) {
        return textToBeauty.toUpperCase();
    }

    public static String toLowerCaseText(String textToBeauty) {
        return textToBeauty.toLowerCase();
    }

    public static String addStarsAtTheBeginningAndEnd(String textToBeauty) {
        return "*****" + textToBeauty + "*****";
    }


}
