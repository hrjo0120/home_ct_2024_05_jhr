import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.ki.TDDCalc;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TDDCalcTests {
    @Test
    @DisplayName("1 + 1 == 2")
    void t1() {
        assertThat(TDDCalc.run("1 + 1")).isEqualTo(2);
    }

    @Test
    @DisplayName("2 + 1 == 3")
    void t2() {
        assertThat(TDDCalc.run("2 + 1")).isEqualTo(3);
    }

    @Test
    @DisplayName("2 + 2 == 4")
    void t3() {
        assertThat(TDDCalc.run("2 + 2")).isEqualTo(4);
    }

    @Test
    @DisplayName("1000 + 200 == 1200")
    void t4() {
        assertThat(TDDCalc.run("1000 + 200")).isEqualTo(1200);
    }

    @Test
    @DisplayName("2 - 1 == 1")
    void t5() {
        assertThat(TDDCalc.run("2 - 1")).isEqualTo(1);
    }

    @Test
    @DisplayName("3 - 1 == 2")
    void t6() {
        assertThat(TDDCalc.run("3 - 1")).isEqualTo(2);
    }

    @Test
    @DisplayName("100 - 20 == 80")
    void t7() {
        assertThat(TDDCalc.run("100 - 20")).isEqualTo(80);
    }

    @Test
    @DisplayName("10 + 20 + 30 == 60")
    void t8() {
        assertThat(TDDCalc.run("10 + 20 + 30")).isEqualTo(60);
    }

    @Test
    @DisplayName("10 - 20 + 30 == 20")
    void t9() {
        assertThat(TDDCalc.run("10 - 20 + 30")).isEqualTo(20);
    }

    @Test
    @DisplayName("10 + 20 - 30 == 0")
    void t10() {
        assertThat(TDDCalc.run("10 + 20 - 30")).isEqualTo(0);
    }

    @Test
    @DisplayName("10 - 10 - 10 - 10 + 10 + 10 - 10 == -10")
    void t11() {
        assertThat(TDDCalc.run("10 - 10 - 10 - 10 + 10 + 10 - 10")).isEqualTo(-10);
    }
}
