package com.db.edu;

public class LogerController {
    private LogerSaver logerSaver = new LogerSaver();

    public void log(String message) {
        logerSaver.save(message);
    }
}
