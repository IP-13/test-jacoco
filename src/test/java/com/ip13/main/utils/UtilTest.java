package com.ip13.main.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UtilTest {
    @Test
    void testDoubleString() {
        Assertions.assertEquals(Util.doubleString("hello"), "hellohello");
    }
}
