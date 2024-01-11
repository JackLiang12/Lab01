import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Problem1Test {

    @Test
    void problem1() {
        Assertions.assertArrayEquals(new int[]{0,1},Problem1.Problem1(new int[]{2,7,11,15},9));
    }
}