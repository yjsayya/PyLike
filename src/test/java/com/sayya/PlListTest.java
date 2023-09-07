package com.sayya;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Pl - list 테스트")
public class PlListTest {

    @DisplayName("Pl: list() - 선언")
    @Test
    public void listTest1() {
        // given
        List<Integer> pylist = Pl.list();
        pylist.add(1);
        pylist.add(2);
        pylist.add(3);
        // when
        List<Integer> li = List.of(1, 2, 3);
        // then
        assertThat(pylist).isEqualTo(li);
    }

    @DisplayName("Pl: list() - 선언 및 초기화")
    @Test
    public void listTest2() {
        // given
        List<String> li = new ArrayList<>();
        li.add("123");
        li.add("234");
        li.add("345");
        // when
        List<String> PyList = Pl.list("123", "234", "345");
        // then
        assertThat(li).isEqualTo(PyList);
    }

    @DisplayName("Pl: list() - set을 list화 하기")
    @Test
    public void listTest3() {
        // given
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        // when
        List<Integer> PyList = Pl.list(set);
        // then
        assertThat(PyList).isEqualTo(List.of(1,2));
    }

    @DisplayName("Pl: list() - dict을 list화 하기")
    @Test
    public void listTest4() {
        // given
        HashMap<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        // when
        List<String> PyList = Pl.list(map);
        // then
        assertThat(PyList).contains("one","two");
    }

    @DisplayName("Pl: list() - 문자열을 list화 하기")
    @Test
    public void listTest5() {
        // given
        String str = "123";
        // when
        List<String> PyList = Pl.Stringtolist(str);
        // then
        assertThat(PyList).isEqualTo(List.of("1","2","3"));
    }

    @DisplayName("Pl: list() - 배열을 list화 하기")
    @Test
    public void listTest6() {
        // given
        int[] arr = new int[]{1,2,3,4,5};
        // when
        List<Integer> PyList = Pl.list(arr);
        // then
        assertThat(PyList).isEqualTo(List.of(1,2,3,4,5));
    }

    @DisplayName("Pl: append() 테스트")
    @Test
    public void appendTest() {
        // given
        List<Integer> li = Pl.list(1,2,3);
        // when
        Pl.append(li, 4);
        // then
        assertThat(li).isEqualTo(List.of(1,2,3,4));
    }

    @DisplayName("Pl: insert() 테스트")
    @Test
    public void insertTest() {
        // given
        List<Integer> li = Pl.list(0,1,2);
        // when
        Pl.insert(li, 1,100);
        // then
        assertThat(li).isEqualTo(List.of(0,100,1,2));
    }

    @DisplayName("Pl: extend() - list + set")
    @Test
    public void extendTest1() {
        // given
        List<Integer> li = Pl.list(0,1,2);
        Set<Integer> se = Pl.set(3,4);
        // when
        Pl.extend(li,se);
        // then
        assertThat(li).contains(0,1,2,3,4);
    }

    @DisplayName("Pl: extend() - list + array")
    @Test
    public void extendTest2() {
        // given
        List<Boolean> li = Pl.list();
        boolean[] array = new boolean[]{true, true, false, false};
        // when
        Pl.extend(li,array);
        // then
        assertThat(li).isEqualTo(List.of(true,true,false,false));
    }

    @DisplayName("Pl: indexing() 테스트(1)")
    @Test
    public void indexingTest1() {
        // given
        List<Integer> li = Pl.list(0,1,2,3,4,5);
        // when
        int number = Pl.indexing(li, 3);
        // then
        assertThat(number).isEqualTo(3);
    }

    @DisplayName("Pl: indexing() 테스트(2)")
    @Test
    public void indexingTest2() {
        // given
        List<Integer> li = Pl.list(0,1,2,3,4,5);
        // when
        List<Integer> check = Pl.indexing(li, 2,4);
        // then
        assertThat(check).isEqualTo(List.of(2,3));
    }

    @DisplayName("Pl: update() 테스트")
    @Test
    public void updateTest() {
        // given
        List<Integer> li = Pl.list(0,1,2,3,4,5);
        // when
        Pl.update(li, 2, 1000);
        // then
        assertThat(li).isEqualTo(List.of(0,1,1000,3,4,5));
    }

    @DisplayName("Pl: pop() 테스트(1)")
    @Test
    public void popTest1() {
        // given
        List<Integer> li = Pl.list(0,1,2,3,4,5);
        // when
        int number = Pl.pop(li);
        // then
        assertThat(number).isEqualTo(5);
    }

    @DisplayName("Pl: pop() 테스트(2)")
    @Test
    public void popTest2() {
        // given
        List<Integer> li = Pl.list(0,1,2,3,4,5);
        // when
        int number = Pl.pop(li,0);
        // then
        assertThat(li).isEqualTo(List.of(1,2,3,4,5));
    }

    @DisplayName("Pl: remove() 테스트")
    @Test
    public void removeTest() {
        // given
        List<Integer> li = Pl.list(0,1,2,3,4,5);
        // when
        Pl.remove(li,4);
        // then
        assertThat(li).isEqualTo(List.of(0,1,2,3,5));
    }

    @DisplayName("Pl: count() 테스트")
    @Test
    public void countTest() {
        // given
        List<Integer> li = Pl.list(0,0,0,1,2,3);
        // when
        int number = Pl.count(li,0);
        // then
        assertThat(number).isEqualTo(3);
    }

    @DisplayName("Pl: join() 테스트(1)")
    @Test
    public void joinTest1() {
        // given
        List<Integer> li = Pl.list(0,1,2,3,4,5);
        // when
        String str = Pl.join("", li);
        // then
        assertThat(str).isEqualTo("012345");
    }

    @DisplayName("Pl: join() 테스트(2)")
    @Test
    public void joinTest2() {
        // given
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        // when
        String str = Pl.join("", map);
        // then
        assertThat(str).isEqualTo("onetwothree");
    }

    @DisplayName("Pl: reverse() 테스트")
    @Test
    public void reverseTest() {
        // given
        List<Integer> li = Pl.list(1,2,3,4);
        // when
        Pl.reverse(li);
        // then
        assertThat(li).isEqualTo(List.of(4,3,2,1));
    }

    @DisplayName("Pl: sort() 테스트")
    @Test
    public void sortTest() {
        // given
        List<Integer> li = Pl.list(4,2,3,1);
        // when
        Pl.sort(li);
        // then
        assertThat(li).isEqualTo(List.of(1,2,3,4));
    }


}