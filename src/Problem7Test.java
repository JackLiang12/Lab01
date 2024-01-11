import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem7Test {

    @Test
    void plusOne() {
        Assertions.assertArrayEquals(new int[]{1,0,0,0,0},Problem7.plusOne(new int[]{9,9,9,9}));
    }
}