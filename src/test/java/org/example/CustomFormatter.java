package org.example;

import ch.qos.logback.contrib.json.JsonFormatter;

import java.util.Map;

public class CustomFormatter implements JsonFormatter {
    @Override
    public String toJsonString(Map m) {
        return m.toString();
    }
}
