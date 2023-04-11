package org.example;

public enum Region {
    POLYNESIE("+689"),
    MARTINIQUE("+596"),
    INDONESIE("+62"),
    FRANCE("+33");

    private String value;

    Region(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}