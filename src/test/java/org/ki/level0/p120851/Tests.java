package org.ki.level0.p120851;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("aAb1B2cC34oOp => 10")
    void t1() {
        assertThat(new Solution().solution("aAb1B2cC34oOp")).isEqualTo(10);
    }

    @Test
    @DisplayName("1a2b3c4d123 => 16")
    void t2() {
        assertThat(new Solution().solution("1a2b3c4d123")).isEqualTo(16);
    }
}
