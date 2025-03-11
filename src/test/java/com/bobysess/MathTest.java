package com.bobysess;

import junit.framework.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MathTest {

    @Test
    void math () {
        Assertions.assertEquals(9, 4 + 5);
        Assertions.assertEquals(9, 19 - 10);
        Assertions.assertEquals(20, 4 * 5);
        Assertions.assertEquals(2, 10 / 5);
    }
}
