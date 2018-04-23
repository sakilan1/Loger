package com.db.edu;

import com.db.edu.loger.api.LogerController;
import org.junit.Assert;
import org.junit.Test;

public class LogerTest {
    public static void main(String[] args) {
        LogerController loger = new LogerController();
        for (int i=0;i<10; i++) {
            loger.log("CSKA - champion!");
        }
    }

    @Test
    public void dummy() {
        Assert.assertEquals(2, 1);
    }
}