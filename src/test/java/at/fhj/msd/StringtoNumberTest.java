package at.fhj.msd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class StringtoNumberTest {
    

    @Test
     void checkThrowIllegalArgument(){
        assertThrows(IllegalArgumentException.class, ()->StringtoNumber.checkAndTurnString(null));
        assertThrows(IllegalArgumentException.class, ()->StringtoNumber.checkAndTurnString(" "));
        assertThrows(IllegalArgumentException.class, ()->StringtoNumber.checkAndTurnString(""));   
     }
     @Test
     void returnInteger(){
        assertEquals(123, StringtoNumber.checkAndTurnString("123"));
        assertEquals(456, StringtoNumber.checkAndTurnString("456"));
        assertEquals(789, StringtoNumber.checkAndTurnString("789"));
     }
     @Test
     void returnNotInteger(){
       
        assertThrows(NumberFormatException.class,
                () -> StringtoNumber.checkAndTurnString("1 2 3"));
        assertThrows(NumberFormatException.class,
                () -> StringtoNumber.checkAndTurnString("1 2 3m34"));
    }
     }

