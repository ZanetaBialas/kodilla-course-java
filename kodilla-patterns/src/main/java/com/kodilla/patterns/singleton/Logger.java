package com.kodilla.patterns.singleton;

public enum Logger {
    LOGGER;
    private String lasLog = "";


    public void log (String log) {
        lasLog = log;
        System.out.println("Log: [" + log + "]");
    }

    public String getLastLog() {
        return lasLog;
    }

    public void openLogger(final String lasLog) {
        this.lasLog = lasLog;
        System.out.println("Opening the setting logger");
    }

    public void closeLogger() {
        this.lasLog = "";
        System.out.println("Closing the setting logger");
    }

    public boolean loadLogger() {
        System.out.println(new StringBuilder().append("Loading settings from logger: ").append(lasLog).toString());
        return true;
    }
}
