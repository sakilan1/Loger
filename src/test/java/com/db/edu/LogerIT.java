package com.db.edu;

public class LogerIT{
    public static void main(String[] args) {
        LogerController loger = new LogerController();
        for (int i=0;i<10; i++) {
            loger.log("CSKA - champion!");
        }
    }
}