package org.example;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void earnings() {
        String str = "2000";
        InputStream in = new ByteArrayInputStream(str.getBytes());
        System.setIn(in);
        int res = (int) Main.Earnings(2000);
        assertEquals(120, res);
    }
}