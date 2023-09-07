package com.sayya;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("PyLike - String 테스트")
public class PlStringTest {

    @DisplayName("Pl: str(T element) 테스트")
    @Test
    public void strTest1() {
        // given
        int num1 = 123;
        long num2 = 34L;
        float num3 = 1;
        double num4 = 100.2;
        char c = 'a';
        boolean b = true;
        // when & then
        assertThat(Pl.str(num1)).isEqualTo("123");
        assertThat(Pl.str(num2)).isEqualTo("34");
        assertThat(Pl.str(num3)).isEqualTo("1.0");
        assertThat(Pl.str(num4)).isEqualTo("100.2");
        assertThat(Pl.str(c)).isEqualTo("a");
        assertThat(Pl.str(b)).isEqualTo("true");
    }

    @DisplayName("Pl: str(array) 테스트")
    @Test
    public void strTest2() {
        // given
        int num1 = 123;
        long num2 = 34L;
        float num3 = 1.2f;
        double num4 = 100.2;
        char c = 'a';
        boolean b = true;
        // when & then
        assertThat(Pl.str(num1)).isEqualTo("123");
        assertThat(Pl.str(num2)).isEqualTo("34");
        assertThat(Pl.str(num3)).isEqualTo("1.2");
        assertThat(Pl.str(num4)).isEqualTo("100.2");
        assertThat(Pl.str(c)).isEqualTo("a");
        assertThat(Pl.str(b)).isEqualTo("true");
    }

    @DisplayName("Pl: str(array) 테스트")
    @Test
    public void strTest3() {
        // given
        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        long[] arr2 = new long[]{1, 2, 3, 4, 5};
        float[] arr3 = new float[]{1, 2, 3, 4, 5};
        double[] arr4 = new double[]{1, 2, 3, 4, 5};
        char[] arr5 = new char[] {'1','2','3','4'};
        boolean[] arr6 = new boolean[]{true, true, false};
        // when & then
        assertThat(Pl.str(arr1)).isEqualTo("[1,2,3,4,5]");
        assertThat(Pl.str(arr2)).isEqualTo("[1,2,3,4,5]");
        assertThat(Pl.str(arr3)).isEqualTo("[1.0,2.0,3.0,4.0,5.0]");
        assertThat(Pl.str(arr4)).isEqualTo("[1.0,2.0,3.0,4.0,5.0]");
        assertThat(Pl.str(arr5)).isEqualTo("['1','2','3','4']");
        assertThat(Pl.str(arr6)).isEqualTo("[true,true,false]");

    }

    @DisplayName("Pl: str(Collection) 테스트")
    @Test
    public void strTest4() {
        // given
        List<Integer> li = Pl.list(1,2);
        Set<String> set = Pl.set("12","2456");
        // when
        assertThat(Pl.str(li)).isEqualTo("[1,2]");
        assertThat(Pl.str(set)).isEqualTo("[\"12\",\"2456\"]");
    }

    @DisplayName("Pl: str(Map) 테스트")
    @Test
    public void strTest5() {
        // given
        HashMap<String, String> dict = new HashMap<>();
        dict.put("one","two");
        dict.put("three","four");
        // when
        assertThat(Pl.str(dict)).isEqualTo("{\"one\":\"two\",\"three\":\"four\"}");

    }

    @DisplayName("Pl: find() 테스트")
    @Test
    public void findTest() {
        // given
        String str = "0123456789";
        // when & then
        assertThat(Pl.find(str,"24")).isEqualTo(-1);
        assertThat(Pl.find(str,"234")).isEqualTo(2);
    }

    @DisplayName("Pl: replace() 테스트")
    @Test
    public void replaceTest1() {
        // given
        String str = "0000_000_000_000";
        // when
        String check = Pl.replace(str, "_", "-");
        // then
        assertThat(check).isEqualTo("0000-000-000-000");
    }

    @DisplayName("Pl: replace() 테스트")
    @Test
    public void replaceTest2() {
        // given
        String str = "12345";
        // when
        String check = Pl.replace(str, "1", "*",2);
        // then
        assertThat(check).isEqualTo("*2345");
    }

    @DisplayName("Pl: indexing() 테스트")
    @Test
    public void indexingTest() {
        // given
        String str = "012345";
        // when
        String check1 = Pl.idx(str,-1);
        String check2 = Pl.idx(str,-3);
        String check3 = Pl.idx(str,2);
        // then
        assertThat(check1).isEqualTo("5");
        assertThat(check2).isEqualTo("3");
        assertThat(check3).isEqualTo("2");
    }

    @DisplayName("Pl: slicing() 테스트(1)")
    @Test
    public void slicingTest1() {
        // given
        String str = "0123456789";
        // when
        String check1 = Pl.slc(str,1,3);
        String check2 = Pl.slc(str,2,8);
        String check3 = Pl.slc(str,3,9);
        // then
        assertThat(check1).isEqualTo("12");
        assertThat(check2).isEqualTo("234567");
        assertThat(check3).isEqualTo("345678");
    }

    @DisplayName("Pl: slicing() 테스트(2)")
    @Test
    public void slicingTest2() {
        // given
        String str = "0123456789";
        // when
        String check1 = Pl.slc(str,1,8,2);
        String check2 = Pl.slc(str,9,3,-2);
        String check3 = Pl.slc(str,9,3,-1);
        // then
        assertThat(check1).isEqualTo("1357");
        assertThat(check2).isEqualTo("975");
        assertThat(check3).isEqualTo("987654");
    }

    @DisplayName("Pl: upper(),lower() 테스트")
    @Test
    public void lower_upper_Test() {
        // given
        String str = "ABCDefg";
        // when
        String check1 = Pl.upper(str);
        String check2 = Pl.lower(str);
        // then
        assertThat(check1).isEqualTo("ABCDEFG");
        assertThat(check2).isEqualTo("abcdefg");
    }

    @DisplayName("Pl: strip() 테스트(1)")
    @Test
    public void stripTest1() {
        // given
        String str = "     12345     ";
        // when
        String check1 = Pl.strip(str);
        String check2 = Pl.lstrip(str);
        String check3 = Pl.rstrip(str);
        // then
        assertThat(check1).isEqualTo("12345");
        assertThat(check2).isEqualTo("12345     ");
        assertThat(check3).isEqualTo("     12345");
    }

    @DisplayName("Pl: strip() 테스트(2)")
    @Test
    public void stripTest2() {
        // given
        String str = "1122문자열2233_____";
        // when
        String check1 = Pl.rstrip(str,"_32");
        String check2 = Pl.lstrip(str,"123");
        String check3 = Pl.strip(str,"123_");
        // then
        assertThat(check1).isEqualTo("1122문자열");
        assertThat(check2).isEqualTo("문자열2233_____");
        assertThat(check3).isEqualTo("문자열");
    }

    @DisplayName("Pl: split() 테스트(1)")
    @Test
    public void splitTest1() {
        // given
        String str = "12345";
        // when
        List<String> li = Pl.list("1", "2", "3", "4", "5");
        // then
        assertThat(li).isEqualTo(List.of("1","2","3","4","5"));
    }

    @DisplayName("Pl: split() 테스트(2)")
    @Test
    public void splitTest2() {
        // given
        String str = "1_2_3_4_5";
        // when
        List<String> li = Pl.list("1", "2", "3", "4", "5");
        // then
        assertThat(li).isEqualTo(List.of("1","2","3","4","5"));
    }

    @DisplayName("Pl: startswith() 테스트(2)")
    @Test
    public void startswithTest2() {
        // given
        String str = "hello world and java and python";
        // when
        boolean check1 = Pl.startswith(str, 16, "world", "java");
        boolean check2 = Pl.startswith(str, 16);
        // then
        assertThat(check1).isEqualTo(true);
        assertThat(check2).isEqualTo(false);
    }

}