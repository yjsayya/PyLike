package com.sayya;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("PyLike - dictionary 테스트")
public class PlDictTest {

    @DisplayName("Pl: dict() 테스트(1)")
    @Test
    void dictTest1() {
        // given
        Map<String, Integer> map = Pl.dict();
        // when
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);
        // then
        assertThat(map).isEqualTo(Map.of("one",1,"two",2,"three",3));
    }

    @DisplayName("Pl: dict() 테스트(2)")
    @Test
    void dictTest2() {
        // given
        Map<String,Integer> map = Pl.dict("one",1,"two",2,"three",3);
        // then
        assertThat(map).isEqualTo(Map.of("one",1,"two",2,"three",3));
    }

    @DisplayName("Pl: keys() 테스트")
    @Test
    void keysTest() {
        // given
        Map<String,Integer> map = Pl.dict("one",1,"two",2,"three",3);
        // when & then
        assertThat(Pl.keys(map)).contains("one","two","three");
    }

    @DisplayName("Pl: values() 테스트")
    @Test
    void valuesTest() {
        // given
        Map<String,Integer> map = Pl.dict("one",1,"two",2,"three",3);
        // when & then
        assertThat(Pl.values(map)).contains(1,2,3);
    }

    @DisplayName("Pl: items() 테스트")
    @Test
    void itemsTest() {
        // given
        Map<String,Integer> map = Pl.dict("one",1,"two",2,"three",3);
        // when & then
        System.out.println(Pl.items(map));
        System.out.println(Pl.items(map).get(1));

    }

    @DisplayName("Pl: get() 테스트")
    @Test
    void getTest() {
        // given
        Map<String,Integer> map = Pl.dict("one",1);
        // when & then
        assertThat(Pl.get(map,"one")).isEqualTo(1);
    }

    @DisplayName("Pl: pop() 테스트")
    @Test
    void popTest() {
        // given
        Map<String,Integer> map = Pl.dict("one",1);
        // when & then
        assertThat(Pl.pop(map,"one")).isEqualTo(1);
    }

}