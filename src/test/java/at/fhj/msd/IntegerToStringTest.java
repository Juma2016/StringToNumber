package at.fhj.msd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class IntegerToStringTest {

    @Test
    void testIntegerToString(){
        assertEquals("123",IntegerToString.turnIntegerToString(123));
    }
}
