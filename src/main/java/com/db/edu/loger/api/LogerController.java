package com.db.edu.loger.api;

import com.db.edu.loger.businesslogic.service.LogService;

public class LogerController {
    private LogService logService = new LogService();


    public void log(String message) {
        logService.log(message);
    }
}