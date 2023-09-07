package com.sayya;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("PyLike - 내장함수 테스트")
public class PlBuiltInsTest {

    @DisplayName("Pl: abs() 테스트")
    @Test
    public void absTest() {
        // given
        int a = -1;
        long b = -2L;
        float c = -3.0f;
        double d = -4;
        // when
        int a_ = Pl.abs(a);
        long b_ = Pl.abs(b);
        float c_ = Pl.abs(c);
        double d_ = Pl.abs(d);
        //then
        assertThat(a_).isEqualTo(1);
        assertThat(b_).isEqualTo(2L);
        assertThat(c_).isEqualTo(3f);
        assertThat(d_).isEqualTo(4.0);
    }

    @DisplayName("Pl: divmod() 테스트")
    @Test
    public void divmodTest() {
        // given
        int num1 = 1000;
        int num2 = 3;
        // when
        int[] arr = Pl.divmod(num1,num2);
        //then
        assertThat(arr).isEqualTo(new int[] {333, 1});
    }

    @DisplayName("Pl: toInt() 테스트")
    @Test
    public void toIntTest() {
        // given
        String numStr = "123";
        // when
        int num = Pl.toInt(numStr);
        //then
        assertThat(num).isEqualTo(123);

    }

}