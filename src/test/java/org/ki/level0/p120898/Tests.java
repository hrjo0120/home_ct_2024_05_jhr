package org.ki.level0.p120898;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("happy birthday! => 30")
    void t1() {
        assertThat(new Solution().solution("happy birthday!")).isEqualTo(30);
    }

    @Test
    @DisplayName("I love you~ => 22")
    void t2() {
        assertThat(new Solution().solution("I love you~")).isEqualTo(22);
    }
}
