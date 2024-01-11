import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem3Test {

    @Test
    void longestCommonPrefix() {
        Assertions.assertEquals("fl",Problem3.longestCommonPrefix(new String[]{"flower","flow","flight"}) );
    }
}