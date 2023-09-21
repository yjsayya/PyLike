package com.sayya;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("PyLike - set 테스트")
public class PlSetTest {

    @DisplayName("Pl: set() 테스트(1)")
    @Test
    void setTest1() {
        // given
        Set<Integer> set = Pl.set();
        set.add(1);
        set.add(2);
        // then
        assertThat(set).isEqualTo(Set.of(1, 2));
    }

    @DisplayName("Pl: set() 테스트(2)")
    @Test
    void setTest2() {
        // given
        Set<String> set = Pl.set("py", "like", "good");
        // then
        assertThat(set).isEqualTo(Set.of("py","like","good"));
    }

    @DisplayName("Pl: set() 테스트(3)")
    @Test
    void setTest3() {
        // given
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        // when
        Set<Integer> set = Pl.set(list);
        // then
        assertThat(set).isEqualTo(Set.of(1,2,3));
    }

    @DisplayName("Pl: set() 테스트(4)")
    @Test
    void setTest4() {
        // given
        Map<String, Integer> dict = new HashMap<>();
        dict.put("one",1);
        dict.put("two",2);
        dict.put("three",3);
        // when
        Set<String> set = Pl.set(dict);
        // then
        assertThat(set).isEqualTo(Set.of("one","two","three"));
    }

    @DisplayName("Pl: set() 테스트(5)")
    @Test
    void setTest5() {
        // given
        int[] int_arr = new int[] {1,2,3,4,5};
        long[] long_arr = new long[]{1,2,3,4,5};
        float[] float_arr = new float[]{1,2,3,4,5};
        double[] double_arr = new double[]{1,2,3,4,5};
        boolean[] boolean_arr = new boolean[]{true,true,false};
        char[] char_arr = new char[] {'a','b','c'};
        String[] str_arr = new String[] {"one","two","three"};
        // when
        Set<Integer> set1 = Pl.set(int_arr);
        Set<Long> set2 = Pl.set(long_arr);
        Set<Float> set3 = Pl.set(float_arr);
        Set<Double> set4 = Pl.set(double_arr);
        Set<Boolean> set5 = Pl.set(boolean_arr);
        Set<Character> set6 = Pl.set(char_arr);
        Set<String> set7 = Pl.set(str_arr);
        // then
        assertThat(set1).isEqualTo(Set.of(1,2,3,4,5));
        assertThat(set2).isEqualTo(Set.of(1L,2L,3L,4L,5L));
        assertThat(set3).isEqualTo(Set.of(1f,2f,3f,4f,5f));
        assertThat(set4).isEqualTo(Set.of(1.0,2.0,3.0,4.0,5.0));
        assertThat(set5).isEqualTo(Set.of(true,false));
        assertThat(set6).isEqualTo(Set.of('a','b','c'));
        assertThat(set7).isEqualTo(Set.of("one","two","three"));
    }

    @DisplayName("Pl: set() 테스트(6)")
    @Test
    void setTest6() {
        // given
        String str = "abcdef";
        // when
        Set<String> set = Pl.StringToSet(str);
        // then
        assertThat(set).isEqualTo(Set.of("a","b","c","d","e","f"));
    }

    @DisplayName("Pl: add() 테스트")
    @Test
    void addTest() {
        // given
        Set<Integer> set = Pl.set();
        // when
        Pl.add(set,1);
        Pl.add(set,2);
        Pl.add(set,3);
        // then
        assertThat(set).isEqualTo(Set.of(1,2,3));
    }

    @DisplayName("Pl: update() 테스트")
    @Test
    void updateTest() {
        // given
        Set<Integer> set = Pl.set(1,2,3);
        List<Integer> list = Pl.list(4,5,6);
        // when
        Pl.update(set,list);
        // then
        assertThat(set).isEqualTo(Set.of(1,2,3,4,5,6));
    }

    @DisplayName("Pl: remove() 테스트")
    @Test
    void removeTest() {
        // given
        Set<Integer> set = Pl.set(1,2,3);
        // when
        Pl.remove(set, 1);
        // then
        assertThat(set).isEqualTo(Set.of(2,3));
    }

    @DisplayName("Pl: discard() 테스트")
    @Test
    void discardTest() {
        // given
        Set<Integer> set1 = Pl.set(1,2,3);
        Set<Integer> set2 = Pl.set(1,2,3);
        // when
        Pl.discard(set1,0);
        Pl.discard(set2,1);
        // then
        assertThat(set1).isEqualTo(Set.of(1,2,3));
        assertThat(set2).isEqualTo(Set.of(2,3));
    }

    @DisplayName("Pl: pop() 테스트")
    @Test
    void popTest() {
        // given
        Set<Integer> set = Pl.set(1,2,3,4,5);
        // when
        int num = Pl.pop(set);
        // then
        Pl.print(set);
        Assertions.assertThat(set).doesNotContain(num);
    }

    @DisplayName("Pl: union() 테스트")
    @Test
    void unionTest() {
        // given
        Set<Integer> set1 = Pl.set(1,2,3,4,5);
        Set<Integer> set2 = Pl.set(4,5,6,7,8);
        // when
        Set<Integer> set = Pl.union(set1, set2);
        // then
        assertThat(set).isEqualTo(Set.of(1,2,3,4,5,6,7,8));
    }

    @DisplayName("Pl: intersection() 테스트")
    @Test
    void intersectionTest() {
        // given
        Set<Integer> set1 = Pl.set(1,2,3,4,5);
        Set<Integer> set2 = Pl.set(4,5,6,7,8);
        // when
        Set<Integer> set = Pl.intersection(set1, set2);
        // then
        assertThat(set).isEqualTo(Set.of(4,5));
    }

    @DisplayName("Pl: difference() 테스트")
    @Test
    void differenceTest() {
        // given
        Set<Integer> set1 = Pl.set(1,2,3,4,5);
        Set<Integer> set2 = Pl.set(4,5,6,7,8);
        // when
        Set<Integer> set = Pl.difference(set1, set2);
        // then
        assertThat(set).isEqualTo(Set.of(1,2,3));
    }

}