import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem5Test {

    @Test
    void validBrackets() {
        Assertions.assertEquals(true,Problem5.validBrackets("()()()()"));
    }
}