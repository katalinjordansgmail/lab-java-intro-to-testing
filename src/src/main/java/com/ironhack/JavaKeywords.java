package com.ironhack;

public class JavaKeywords {
    public static boolean isJavaKeyword(String string) {
        String[] keyWords = {"abstract","continue","for","new","switch","assert","default","goto","package",
                "synchronized","boolean","do","if","private","this","break","double","implements","protected","throw","byte",
                "else","import","public","throws","case","enum","instanceof","return","transient","catch","extends","int",
                "short","try","char","final","interface","static","void","class","finally","long","strictfp","volatile","const",
                "float","native","super","while"};
        String[] splitString = string.split(" ");
        for(String splitStringPart : splitString) {
            for(String keyWord : keyWords) {
                if (splitStringPart.equals(keyWord)) {
                    return true;
                }
            }
        }
        return false;
    }
}
