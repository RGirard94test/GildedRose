package com.gildedrose;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {
    @Test
    void foo() {
        ByteArrayOutputStream mainOutput = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(mainOutput);

        TexttestFixture.run(new String[]{"8"}, out);

        assertEquals("",mainOutput);
    }
}
