import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem4Test {

    @Test
    void romanNumerals() {
        Assertions.assertEquals(3, Problem4.romanToInt("III"));
    }
}