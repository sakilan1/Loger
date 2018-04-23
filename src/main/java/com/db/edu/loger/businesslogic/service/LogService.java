package com.db.edu.loger.businesslogic.service;

import com.db.edu.loger.dal.LogerSaver;

public class LogService {
    private LogMessageFilter filter = new LogMessageFilter();
    private LogMessageFormatter formatter = new LogMessageFormatter();
    private LogerSaver saver = new LogerSaver();

    public void log(String message) {
        if (filter.filter(message)) {
            saver.save(formatter.format(message));
        }
    }
}
