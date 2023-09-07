package com.sayya;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Pl {

    public static int abs(int element) {
        return (element < 0) ? -element : element;
    }

    public static long abs(long element) {
        return (element < 0) ? -element : element;
    }

    public static float abs(float element) {
        return (element <= 0.0F) ? 0.0F - element : element;
    }

    public static double abs(double element) {
        return (element < 0.0D) ? 0.0D - element : element;
    }

    public static int[] divmod(int number1, int number2) {
        int quotient = number1 / number2;
        int remainder = number1 % number2;

        return new int[]{quotient, remainder};
    }

    public static long[] divmod(long number1, long number2) {
        long quotient = number1 / number2;
        long remainder = number1 % number2;

        return new long[]{quotient, remainder};
    }

    public static String input(String comment) {
        System.out.print(comment);
        String ans;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            ans = reader.readLine();
        } catch (IOException e) {
            ans = "";
        }
        return ans;
    }

    public static int toInt(String string) {
        try {
            return Integer.parseInt(string);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("ValueError: invalid literal for int()", e);
        }
    }

    public static long toLong(String string) {
        try {
            return Long.parseLong(string);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("ValueError: invalid literal for long()", e);
        }
    }

    public static float toFloat(String string) {
        try {
            return Float.parseFloat(string);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("ValueError: invalid literal for float()", e);
        }
    }

    public static double toDouble(String string) {
        try {
            return Double.parseDouble(string);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("ValueError: invalid literal for double()", e);
        }
    }

    public static <T> int len(Collection<T> collection) {
        return collection.size();
    }

    public static <K, V> int len(Map<K, V> map) {
        return map.size();
    }

    public static int len(String string) {
        return string.length();
    }

    public static int len(boolean[] array) {
        return array.length;
    }

    public static int len(char[] array) {
        return array.length;
    }

    public static int len(int[] array) {
        return array.length;
    }

    public static int len(long[] array) {
        return array.length;
    }

    public static int len(float[] array) {
        return array.length;
    }

    public static int len(double[] array) {
        return array.length;
    }

    public static int len(String[] array) {
        return array.length;
    }


    public static int max(int[] array) {
        return Arrays.stream(array)
                .max()
                .orElseThrow(() -> new NoSuchElementException("ValueError: max() arg is an empty sequence"));
    }

    public static long max(long[] array) {
        return Arrays.stream(array)
                .max()
                .orElseThrow(() -> new NoSuchElementException("ValueError: max() arg is an empty sequence"));
    }

    public static double max(double[] array) {
        return Arrays.stream(array)
                .max()
                .orElseThrow(() -> new NoSuchElementException("ValueError: max() arg is an empty sequence"));
    }

    public static char max(char[] array) {
        if (array == null || array.length == 0)
            throw new NoSuchElementException("ValueError: max() arg is an empty sequence");

        char max = array[0];
        for (char c : array) {
            if (c > max)
                max = c;
        }

        return (char) max;
    }

    public static String max(String[] array) {
        if (array == null || array.length == 0)
            throw new NoSuchElementException("ValueError: max() arg is an empty sequence");

        String maxStr = array[0];
        for (String str : array) {
            if (str.compareTo(maxStr) > 0)
                maxStr = str;
        }

        return maxStr;
    }

    public static <T extends Comparable<T>> T max(Collection<T> collection) {
        if (collection == null || collection.isEmpty())
            throw new NoSuchElementException("ValueError: max() arg is an empty sequence");

        T maxElement = null;
        for (T element : collection) {
            if (maxElement == null || element.compareTo(maxElement) > 0)
                maxElement = element;
        }

        return maxElement;
    }

    public static <K extends Comparable<K>, V> K max(Map<K, V> map) {
        if (map == null || map.isEmpty())
            throw new NoSuchElementException("ValueError: max() arg is an empty sequence");

        K maxElement = null;
        for (K element : map.keySet()) {
            if (maxElement == null || element.compareTo(maxElement) > 0)
                maxElement = element;
        }

        return maxElement;
    }

    public static String max(String string) {
        int max = string.chars()
                .max()
                .orElseThrow(() -> new NoSuchElementException("ValueError: max() arg is an empty sequence"));
        return Character.toString((char) max);
    }

    public static <T extends Comparable<T>> T min(Collection<T> collection) {
        if (collection == null || collection.isEmpty())
            throw new NoSuchElementException("ValueError: min() arg is an empty sequence");

        T minElement = null;
        for (T element : collection) {
            if (minElement == null || element.compareTo(minElement) < 0)
                minElement = element;
        }

        return minElement;
    }

    public static <K extends Comparable<K>, V> K min(Map<K, V> map) {
        if (map == null || map.isEmpty())
            throw new NoSuchElementException("ValueError: min() arg is an empty sequence");

        K minElement = null;
        for (K element : map.keySet()) {
            if (minElement == null || element.compareTo(minElement) < 0)
                minElement = element;
        }

        return minElement;
    }

    public static String min(String string) {
        int min = string.chars()
                .min()
                .orElseThrow(() -> new NoSuchElementException("ValueError: min() arg is an empty sequence"));
        return Character.toString((char) min);
    }

    public static char min(char[] array) {
        if (array == null || array.length == 0)
            throw new NoSuchElementException("ValueError: min() arg is an empty sequence");

        char min = array[0];
        for (char c : array) {
            if (c < min)
                min = c;
        }

        return min;
    }

    public static String min(String[] array) {
        if (array == null || array.length == 0)
            throw new NoSuchElementException("ValueError: min() arg is an empty sequence");

        String minStr = array[0];
        for (String str : array) {
            if (str.compareTo(minStr) < 0)
                minStr = str;
        }

        return minStr;
    }

    public static int min(int[] array) {
        return Arrays.stream(array)
                .min()
                .orElseThrow(() -> new NoSuchElementException("ValueError: min() arg is an empty sequence"));
    }

    public static long min(long[] array) {
        return Arrays.stream(array)
                .min()
                .orElseThrow(() -> new NoSuchElementException("ValueError: min() arg is an empty sequence"));
    }

    public static double min(double[] array) {
        return Arrays.stream(array)
                .min()
                .orElseThrow(() -> new NoSuchElementException("ValueError: min() arg is an empty sequence"));
    }

    public static double pow(double number1, double number2) {
        return Math.pow(number1, number2);
    }

    public static List<Integer> range(int end) {
        return IntStream.range(0, end)
                .boxed()
                .collect(Collectors.toList());
    }

    public static List<Integer> range(int start, int end) {
        return IntStream.range(start, end)
                .boxed()
                .collect(Collectors.toList());
    }

    public static List<Integer> range(int start, int end, int step) {
        if (step == 0)
            throw new IllegalArgumentException("ValueError: range() arg 3 must not be zero");

        if ((step > 0 && start >= end) || (step < 0 && start <= end))
            return Collections.emptyList();

        int limit = step > 0 ? (end - start + step - 1) / step :
                (start - end - step - 1) / (-step);

        return IntStream.iterate(start, i -> i + step)
                .limit(limit)
                .boxed()
                .collect(Collectors.toList());
    }

    public static <T> void print(T element) {
        System.out.println(element.toString());
    }

    public static <T> void print(T[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void print(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void print(long[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void print(float[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void print(double[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void print(boolean[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void print(char[] array) {
        System.out.println(Arrays.toString(array));
    }


    public static <T extends Comparable<T>> List<T> sorted(Collection<T> collection) {
        return collection.stream()
                .sorted()
                .collect(Collectors.toList());
    }

    public static <T extends Comparable<T>> List<T> sorted(Collection<T> collection, boolean reverse) {
        if (reverse) {
            return collection.stream()
                    .sorted(Comparator.reverseOrder())
                    .collect(Collectors.toList());
        } else {
            return collection.stream()
                    .sorted()
                    .collect(Collectors.toList());
        }
    }

    public static <K extends Comparable<K>, V> List<K> sorted(Map<K, V> map) {
        return map.keySet().stream()
                .sorted()
                .collect(Collectors.toList());
    }

    public static <K extends Comparable<K>, V> List<K> sorted(Map<K, V> map, boolean reverse) {
        if (reverse) {
            return map.keySet().stream()
                    .sorted(Comparator.reverseOrder())
                    .collect(Collectors.toList());
        } else {
            return map.keySet().stream()
                    .sorted()
                    .collect(Collectors.toList());
        }
    }

    public static List<String> sorted(String string) {
        return string.chars()
                .mapToObj(c -> String.valueOf((char) c))
                .sorted()
                .collect(Collectors.toList());
    }

    public static List<String> sorted(String string, boolean reverse) {
        if (reverse) {
            return string.chars()
                    .mapToObj(c -> String.valueOf((char) c))
                    .sorted(Comparator.reverseOrder())
                    .collect(Collectors.toList());
        } else {
            return string.chars()
                    .mapToObj(c -> String.valueOf((char) c))
                    .sorted()
                    .collect(Collectors.toList());
        }
    }

    public static List<Integer> sorted(int[] arr) {
        return Arrays.stream(arr)
                .boxed()
                .sorted()
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public static List<Integer> sorted(int[] arr, boolean reverse) {
        if (reverse) {
            return Arrays.stream(arr)
                    .boxed()
                    .sorted(Comparator.reverseOrder())
                    .collect(Collectors.toCollection(ArrayList::new));
        } else {
            return Arrays.stream(arr)
                    .boxed()
                    .sorted()
                    .collect(Collectors.toCollection(ArrayList::new));
        }
    }

    public static List<Long> sorted(long[] arr) {
        return Arrays.stream(arr)
                .boxed()
                .sorted()
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public static List<Long> sorted(long[] arr, boolean reverse) {
        if (reverse) {
            return Arrays.stream(arr)
                    .boxed()
                    .sorted(Comparator.reverseOrder())
                    .collect(Collectors.toCollection(ArrayList::new));
        } else {
            return Arrays.stream(arr)
                    .boxed()
                    .sorted()
                    .collect(Collectors.toCollection(ArrayList::new));
        }
    }

    public static List<Float> sorted(float[] arr) {
        List<Float> li = new ArrayList<>();
        for (float num : arr) {
            li.add(num);
        }

        return li.stream()
                .sorted()
                .collect(Collectors.toList());
    }

    public static List<Float> sorted(float[] arr, boolean reverse) {
        List<Float> li = new ArrayList<>();
        for (float num : arr) {
            li.add(num);
        }

        if (reverse) {
            return li.stream()
                    .sorted(Comparator.reverseOrder())
                    .collect(Collectors.toList());
        } else {
            return li.stream()
                    .sorted()
                    .collect(Collectors.toList());
        }
    }

    public static List<Double> sorted(double[] arr) {
        return Arrays.stream(arr)
                .boxed()
                .sorted()
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public static List<Double> sorted(double[] arr, boolean reverse) {
        if (reverse) {
            return Arrays.stream(arr)
                    .boxed()
                    .sorted(Comparator.reverseOrder())
                    .collect(Collectors.toCollection(ArrayList::new));
        } else {
            return Arrays.stream(arr)
                    .boxed()
                    .sorted()
                    .collect(Collectors.toCollection(ArrayList::new));
        }
    }

    public static List<Character> sorted(char[] arr) {
        return new String(arr).chars()
                .mapToObj(c -> (char) c)
                .sorted()
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public static List<Character> sorted(char[] arr, boolean reverse) {
        if (reverse) {
            return new String(arr).chars()
                    .mapToObj(c -> (char) c)
                    .sorted(Comparator.reverseOrder())
                    .collect(Collectors.toCollection(ArrayList::new));
        } else {
            return new String(arr).chars()
                    .mapToObj(c -> (char) c)
                    .sorted()
                    .collect(Collectors.toCollection(ArrayList::new));
        }
    }

    public static List<String> sorted(String[] arr) {
        return Arrays.stream(arr)
                .sorted()
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public static List<String> sorted(String[] arr, boolean reverse) {
        if (reverse) {
            return Arrays.stream(arr)
                    .sorted(Comparator.reverseOrder())
                    .collect(Collectors.toCollection(ArrayList::new));
        } else {
            return Arrays.stream(arr)
                    .sorted()
                    .collect(Collectors.toCollection(ArrayList::new));
        }
    }

    public static int sum(int[] arr) {
        if (arr == null || arr.length == 0)
            return 0;

        return Arrays.stream(arr).sum();
    }

    public static long sum(long[] arr) {
        if (arr == null || arr.length == 0)
            return 0;

        return Arrays.stream(arr).sum();
    }

    public static double sum(double[] arr) {
        if (arr == null || arr.length == 0)
            return 0;

        return Arrays.stream(arr).sum();
    }

    public static <T extends Number> double sum(Collection<T> collection) {
        if (collection == null || collection.size() == 0)
            return 0;

        return collection.stream()
                .mapToDouble(Number::doubleValue)
                .sum();
    }

    public static <K extends Number, V> double sum(Map<K, V> map) {
        if (map == null || map.size() == 0)
            return 0;

        return map.keySet().stream()
                .mapToDouble(Number::doubleValue)
                .sum();
    }

    public static <T> boolean in(Collection<T> collection, T elements) {
        return collection.contains(elements);
    }

    public static <K, V> boolean in(Map<K, V> map, K elements) {
        return map.containsKey(elements);
    }

    public static boolean in(String string1, String string2) {
        return string1.contains(string2);
    }

    public static boolean in(String string1, char ch) {
        return string1.contains(String.valueOf(ch));
    }


    public static <T> boolean not_in(Collection<T> collection, T elements) {
        return !collection.contains(elements);
    }

    public static <K, V> boolean not_in(Map<K, V> map, K elements) {
        return !map.containsKey(elements);
    }

    public static boolean not_in(String string1, String string2) {
        return !string1.contains(string2);
    }

    public static boolean not_in(String string1, char ch) {
        return !string1.contains(String.valueOf(ch));
    }

    public static <T> ArrayList<T> list() {
        return new ArrayList<T>();
    }

    public static <T> List<T> list(T... elements) {
        return new ArrayList<>(Arrays.asList(elements));
    }

    public static <T> List<T> list(Collection<T> collection) {
        return new ArrayList<>(collection);
    }

    public static <K, V> List<K> list(Map<K, V> dict) {
        return new ArrayList<>(dict.keySet());
    }

    public static List<Boolean> list(boolean[] arr) {
        List<Boolean> list = new ArrayList<>();
        for (boolean val : arr) {
            list.add(val);
        }
        return list;
    }

    public static List<Character> list(char[] arr) {
        List<Character> list = new ArrayList<>();
        for (char val : arr) {
            list.add(val);
        }
        return list;
    }

    public static List<Integer> list(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int val : arr) {
            list.add(val);
        }
        return list;
    }

    public static List<Long> list(long[] arr) {
        List<Long> list = new ArrayList<>();
        for (long val : arr) {
            list.add(val);
        }
        return list;
    }

    public static List<Double> list(double[] arr) {
        List<Double> list = new ArrayList<>();
        for (double val : arr) {
            list.add(val);
        }
        return list;
    }

    public static List<String> Stringtolist(String str) {
        List<String> li = new ArrayList<>();
        for (char ch : str.toCharArray()) {
            li.add(String.valueOf(ch));
        }
        return li;
    }

    public static <T> void append(List<T> pyList, T element) {
        pyList.add(element);
    }

    public static <T> void insert(List<T> pyList, int index, T element) {
        pyList.add(index, element);
    }

    public static <T> void extend(List<T> pyList1, List<T> pyList2) {
        pyList1.addAll(pyList2);
    }

    public static <T> void extend(List<T> list, Set<T> set) {
        list.addAll(set);
    }

    public static <T> void extend(List<T> list, Map<T, T> dict) {
        list.addAll(dict.keySet());
    }

    public static void extend(List<String> list, String string) {
        for (char ch : string.toCharArray()) {
            list.add(String.valueOf(ch));
        }
    }

    public static void extend(List<Boolean> list, boolean[] array) {
        for (boolean b : array) {
            list.add(b);
        }
    }

    public static void extend(List<Character> list, char[] array) {
        for (char b : array) {
            list.add(b);
        }
    }

    public static void extend(List<Integer> list, int[] array) {
        for (int b : array) {
            list.add(b);
        }
    }

    public static void extend(List<Long> list, long[] array) {
        for (long b : array) {
            list.add(b);
        }
    }

    public static void extend(List<Double> list, double[] array) {
        for (double b : array) {
            list.add(b);
        }
    }

    public static <T> T indexing(List<T> pyList, int index_) {
        int length = pyList.size();
        int index = (index_ < 0) ? length + index_ : index_;
        if (pyList.size() < index)
            throw new IllegalArgumentException("IndexError");

        return pyList.get(index);
    }

    public static <T> List<T> indexing(List<T> pyList, int index1_, int index2_) {
        int length = pyList.size();
        int index1 = (index1_ < 0) ? length + index1_ : index1_;
        int index2 = (index2_ < 0) ? length + index2_ : index2_;

        if (pyList.size() < index1 || pyList.size() < index2)
            throw new IllegalArgumentException("IndexError");

        List<T> li = new ArrayList<>();
        for (int i = index1; i < index2; i++) {
            li.add(pyList.get(i));
        }

        return li;
    }


    public static <T> void update(List<T> pyList, int index, T element) {
        pyList.set(index, element);
    }

    public static <T> void clear(List<T> pyList) {
        pyList.clear();
    }

    public static <T> T pop(List<T> pyList) {
        int idx = pyList.size() - 1;
        T element = pyList.get(idx);
        pyList.remove(idx);

        return element;
    }

    public static <T> T pop(List<T> pyList, int index) {
        if (index >= pyList.size())
            throw new IndexOutOfBoundsException("IndexError");

        T element = pyList.get(index);
        pyList.remove(index);
        return element;
    }

    public static <T> void remove(List<T> pyList, T element) {
        int index = pyList.indexOf(element);
        if (index == -1)
            throw new IllegalArgumentException("ValueError");

        pyList.remove(index);
    }

    public static <T> int count(List<T> pyList, T element) {
        return Collections.frequency(pyList, element);
    }

    public static int count(String string, String element) {
        return string.split(Pattern.quote(element), -1).length - 1;
    }

    public static <T> void reverse(List<T> pyList) {
        Collections.reverse(pyList);
    }

    public static String join(String element, char[] array) {
        StringBuilder sb = new StringBuilder();
        for (char ch : array) {
            sb.append(ch);
            sb.append(element);
        }
        if (element == null || element.equals(""))
            return sb.toString();

        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public static <T> String join(String element, Collection<T> collection) {
        StringBuilder sb = new StringBuilder();
        for (T i : collection) {
            sb.append(i);
            sb.append(element);
        }
        if (element == null || element.equals(""))
            return sb.toString();

        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public static <K, V> String join(String element, Map<K, V> map) {
        StringBuilder sb = new StringBuilder();
        for (K i : map.keySet()) {
            sb.append(i);
            sb.append(element);
        }
        if (element == null || element.equals(""))
            return sb.toString();

        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public static <T extends Number> void sort(List<T> list) {
        list.sort(Comparator.comparingDouble(Number::doubleValue));
    }

    public static <T> HashSet<T> set() {
        return new HashSet<>();
    }

    public static <T> HashSet<T> set(T... elements) {
        return new HashSet<>(Arrays.asList(elements));
    }

    public static <T> Set<T> set(Collection<T> collection) {
        return new HashSet<>(collection);
    }

    public static <K, V> Set<K> set(Map<K, V> map) {
        return new HashSet<>(map.keySet());
    }

    public static Set<String> set(String string) {
        Set<String> set = new HashSet<>();
        for (char ch : string.toCharArray()) {
            set.add(String.valueOf(ch));
        }
        return set;
    }

    public static Set<Integer> set(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }
        return set;
    }

    public static Set<Boolean> set(boolean[] arr) {
        Set<Boolean> set = new HashSet<>();
        for (boolean val : arr) {
            set.add(val);
        }
        return set;
    }

    public static Set<Long> set(long[] arr) {
        Set<Long> set = new HashSet<>();
        for (long val : arr) {
            set.add(val);
        }
        return set;
    }

    public static Set<Float> set(float[] arr) {
        Set<Float> set = new HashSet<>();
        for (float val : arr) {
            set.add(val);
        }
        return set;
    }

    public static Set<Double> set(double[] arr) {
        Set<Double> set = new HashSet<>();
        for (double val : arr) {
            set.add(val);
        }
        return set;
    }

    public static Set<Character> set(char[] arr) {
        Set<Character> set = new HashSet<>();
        for (char val : arr) {
            set.add(val);
        }
        return set;
    }

    public static Set<String> set(String[] arr) {
        return new HashSet<>(Arrays.asList(arr));
    }

    public static <T> void add(Set<T> set, T element) {
        set.add(element);
    }

    public static <T> void update(Collection<T> collection1, Collection<T> collection2) {
        collection1.addAll(collection2);
    }

    public static <T> void clear(Set<T> set) {
        set.clear();
    }

    public static <T> void remove(Set<T> set, T element) {
        if (!set.contains(element))
            throw new IllegalArgumentException("KeyError");

        set.remove(element);
    }

    public static <T> void discard(Set<T> set, T element) {
        set.remove(element);
    }

    public static <T> T pop(Set<T> set) {
        if (set.isEmpty())
            throw new IllegalArgumentException("KeyError: 'pop from an empty set'");

        List<T> list = new ArrayList<>(set);
        Random rand = new Random();

        T element = list.get(rand.nextInt(list.size()));
        set.remove(element);
        return element;
    }

    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> set = new HashSet<>(set1);
        set.addAll(set2);

        return set;
    }

    public static <T> Set<T> intersection(Set<T> set1, Set<T> set2) {
        Set<T> set = new HashSet<>(set1);
        set.retainAll(set2);

        return set;
    }

    public static <T> Set<T> difference(Set<T> set1, Set<T> set2) {
        Set<T> set = new HashSet<>(set1);
        set.removeAll(set2);

        return set;
    }

    public static <K, V> Map<K, V> dict() {
        return new HashMap<>();
    }

    public static <K, V> Map<K, V> dict(K k1, V v1) {
        HashMap<K, V> map = new HashMap<>();
        map.put(k1, v1);
        return map;
    }

    public static <K, V> Map<K, V> dict(K k1, V v1, K k2, V v2) {
        HashMap<K, V> map = new HashMap<>();
        map.put(k1, v1);
        map.put(k2, v2);
        return map;
    }

    public static <K, V> Map<K, V> dict(K k1, V v1, K k2, V v2, K k3, V v3) {
        HashMap<K, V> map = new HashMap<>();
        map.put(k1, v1);
        map.put(k2, v2);
        map.put(k3, v3);
        return map;
    }

    public static <K, V> Map<K, V> dict(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4) {
        HashMap<K, V> map = new HashMap<>();
        map.put(k1, v1);
        map.put(k2, v2);
        map.put(k3, v3);
        map.put(k4, v4);
        return map;
    }

    public static <K, V> Map<K, V> dict(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4,
                                        K k5, V v5) {
        HashMap<K, V> map = new HashMap<>();
        map.put(k1, v1);
        map.put(k2, v2);
        map.put(k3, v3);
        map.put(k4, v4);
        map.put(k5, v5);
        return map;
    }

    public static <K, V> Map<K, V> dict(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4,
                                        K k5, V v5, K k6, V v6) {
        HashMap<K, V> map = new HashMap<>();
        map.put(k1, v1);
        map.put(k2, v2);
        map.put(k3, v3);
        map.put(k4, v4);
        map.put(k5, v5);
        map.put(k6, v6);
        return map;
    }

    public static <K, V> Map<K, V> dict(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4,
                                        K k5, V v5, K k6, V v6, K k7, V v7) {
        HashMap<K, V> map = new HashMap<>();
        map.put(k1, v1);
        map.put(k2, v2);
        map.put(k3, v3);
        map.put(k4, v4);
        map.put(k5, v5);
        map.put(k6, v6);
        map.put(k7, v7);
        return map;
    }

    public static <K, V> Map<K, V> dict(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4,
                                        K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8) {
        HashMap<K, V> map = new HashMap<>();
        map.put(k1, v1);
        map.put(k2, v2);
        map.put(k3, v3);
        map.put(k4, v4);
        map.put(k5, v5);
        map.put(k6, v6);
        map.put(k7, v7);
        map.put(k8, v8);
        return map;
    }

    public static <K, V> Map<K, V> dict(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4,
                                        K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8,
                                        K k9, V v9) {
        HashMap<K, V> map = new HashMap<>();
        map.put(k1, v1);
        map.put(k2, v2);
        map.put(k3, v3);
        map.put(k4, v4);
        map.put(k5, v5);
        map.put(k6, v6);
        map.put(k7, v7);
        map.put(k8, v8);
        map.put(k9, v9);
        return map;
    }

    public static <K, V> Map<K, V> dict(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5,
                                        K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9, K k10, V v10) {
        HashMap<K, V> map = new HashMap<>();
        map.put(k1, v1);
        map.put(k2, v2);
        map.put(k3, v3);
        map.put(k4, v4);
        map.put(k5, v5);
        map.put(k6, v6);
        map.put(k7, v7);
        map.put(k8, v8);
        map.put(k9, v9);
        map.put(k10, v10);
        return map;
    }

    public static <K, V> List<K> keys(Map<K, V> dict) {
        return new ArrayList<>(dict.keySet());
    }

    public static <K, V> List<V> values(Map<K, V> dict) {
        return new ArrayList<>(dict.values());
    }

    public static <K, V> List<Map.Entry<K, V>> items(Map<K, V> dict) {
        return new ArrayList<>(dict.entrySet());
    }

    public static <K, V> V get(Map<K, V> dict, K key) {
        if (!dict.containsKey(key))
            return null;

        return dict.get(key);
    }

    public static <K, V> void update(Map<K, V> dict, K key, V value) {
        if (!dict.containsKey(key))
            throw new IllegalArgumentException(String.format("KeyError: %s", key.toString()));

        dict.put(key, value);
    }

    public static <K, V> V setdefault(Map<K, V> dict, K key, V value) {
        if (dict.containsKey(key))
            return dict.get(key);
        dict.put(key, value);
        return value;
    }

    public static <K, V> V pop(Map<K, V> dict, K key) {
        if (!dict.containsKey(key))
            return null;
        V ele = dict.get(key);
        dict.remove(key);
        return ele;
    }

    public static <K, V> void clear(Map<K, V> dict) {
        dict.clear();
    }

    public static <T> String str(T element) {
        if (element instanceof String)
            return "\"" + element.toString() + "\"";

        return element.toString();
    }

    public static String str(int[] array) {
        StringBuilder sb = new StringBuilder("[");
        boolean first = true;

        for (int i : array) {
            if (!first)
                sb.append(",");
            sb.append(i);
            first = false;
        }
        sb.append("]");
        return sb.toString();
    }

    public static String str(long[] array) {
        StringBuilder sb = new StringBuilder("[");
        boolean first = true;

        for (long i : array) {
            if (!first)
                sb.append(",");
            sb.append(i);
            first = false;
        }
        sb.append("]");
        return sb.toString();
    }

    public static String str(float[] array) {
        StringBuilder sb = new StringBuilder("[");
        boolean first = true;

        for (float i : array) {
            if (!first)
                sb.append(",");
            sb.append(i);
            first = false;
        }
        sb.append("]");
        return sb.toString();
    }

    public static String str(double[] array) {
        StringBuilder sb = new StringBuilder("[");
        boolean first = true;

        for (double i : array) {
            if (!first)
                sb.append(",");
            sb.append(i);
            first = false;
        }
        sb.append("]");
        return sb.toString();
    }

    public static String str(char[] array) {
        StringBuilder sb = new StringBuilder("[");
        boolean first = true;

        for (char i : array) {
            if (!first)
                sb.append(",");
            sb.append("'");
            sb.append(i);
            sb.append("'");
            first = false;
        }
        sb.append("]");
        return sb.toString();
    }

    public static String str(boolean[] array) {
        StringBuilder sb = new StringBuilder("[");
        boolean first = true;

        for (boolean i : array) {
            if (!first)
                sb.append(",");
            sb.append(i);
            first = false;
        }
        sb.append("]");
        return sb.toString();
    }

    public static String str(String[] array) {
        StringBuilder sb = new StringBuilder("[");
        boolean first = true;

        for (String i : array) {
            if (!first)
                sb.append(",");
            sb.append("\"");
            sb.append(i);
            sb.append("\"");
            first = false;
        }
        sb.append("]");
        return sb.toString();
    }

    public static <T> String str(Collection<T> collection) {
        StringBuilder sb = new StringBuilder("[");
        boolean first = true;

        for (T col : collection) {
            if (!first)
                sb.append(",");

            if (col instanceof Collection<?>)
                sb.append(str((Collection<?>) col));
            else
                sb.append(str(col));

            first = false;
        }
        sb.append("]");
        return sb.toString();
    }

    public static <K, V> String str(Map<K, V> dict) {
        StringBuilder sb = new StringBuilder("{");

        boolean first = true;
        for (Map.Entry<K, V> entry : dict.entrySet()) {
            if (!first)
                sb.append(",");
            K key = entry.getKey();
            V value = entry.getValue();

            sb.append(str(key)).append(":").append(str(value));
            first = false;
        }
        sb.append("}");
        return sb.toString();
    }

    public static String replace(String pyStr, String oldElement, String newElement) {
        if (pyStr == null || oldElement == null || newElement == null)
            throw new IllegalArgumentException("None of the arguments can be null");

        return pyStr.replace(oldElement, newElement);
    }

    public static String replace(String pyStr, String oldElement, String newElement, int time) {
        if (pyStr == null || oldElement == null || newElement == null)
            throw new IllegalArgumentException("None of the arguments can be null");

        if (time <= 0 || oldElement.equals(""))
            return pyStr;

        StringBuilder sb = new StringBuilder(pyStr);
        for (int i = 0; i < time; i++) {
            int index = sb.indexOf(oldElement);
            if (index == -1)
                break;
            sb.replace(index, index + oldElement.length(), newElement);
        }
        return sb.toString();
    }

    public static String indexing(String pyStr, int index_) {
        int length = pyStr.length();
        int index = (index_ < 0) ? length + index_ : index_;

        if (length <= index)
            throw new IllegalArgumentException("IndexError: string index out of range");

        return String.valueOf(pyStr.charAt(index));
    }

    public static String slicing(String pyStr, int index_) {
        int length = pyStr.length();
        int index = (index_ < 0) ? length + index_ : index_;

        if (pyStr.length() <= index)
            return "";

        StringBuilder sb = new StringBuilder();
        for (int i = index; i < length; i++) {
            sb.append(pyStr.charAt(i));
        }
        return sb.toString();
    }

    public static String slicing(String pyStr, int index1_, int index2_) {
        int length = pyStr.length();
        int index1 = (index1_ < 0) ? length + index1_ : index1_;
        int index2 = (index2_ < 0) ? length + index2_ : Math.min(index2_, length);

        if (index1 > length)
            return "";

        StringBuilder sb = new StringBuilder();
        for (int i = Math.max(index1, 0); i < Math.min(index2, length); i++) {
            sb.append(pyStr.charAt(i));
        }

        return sb.toString();
    }


    public static String slicing(String pyStr, int index1_, int index2_, int sliceStep) {
        if (sliceStep == 0)
            throw new IllegalArgumentException("ValueError: slice step cannot be zero");

        int length = pyStr.length();
        int index1 = (index1_ < 0) ? Math.max(0, length + index1_) : Math.min(length, index1_);
        int index2 = (index2_ < 0) ? Math.max(0, length + index2_) : Math.min(length, index2_);

        StringBuilder sb = new StringBuilder();
        if (sliceStep > 0) {
            for (int i = index1; i < index2; i += sliceStep) {
                sb.append(pyStr.charAt(i));
            }
        } else {
            for (int i = Math.min(index1, length - 1); i > index2; i += sliceStep) {
                sb.append(pyStr.charAt(i));
            }
        }
        return sb.toString();
    }

    public static int find(String string1, String string2) {
        return string1.indexOf(string2);
    }

    public static String upper(String string) {
        return string.toUpperCase();
    }

    public static String lower(String string) {
        return string.toLowerCase();
    }

    public static String strip(String string) {
        return string.strip();
    }

    public static String strip(String string, String element) {
        return rstrip(lstrip(string, element), element);
    }

    public static String rstrip(String string) {
        return string.stripTrailing();
    }

    public static String rstrip(String string, String element) {
        int i = string.length() - 1;
        while (i >= 0 && element.contains(String.valueOf(string.charAt(i)))) {
            i--;
        }
        return string.substring(0, i + 1);
    }

    public static String lstrip(String string) {
        return string.stripLeading();
    }

    public static String lstrip(String string, String element) {
        int i = 0;
        while (i < string.length() && element.contains(String.valueOf(string.charAt(i)))) {
            i++;
        }
        return string.substring(i);
    }

    public static List<String> split(String string) {
        return Arrays.asList(string.split(Pattern.quote("")));
    }

    public static List<String> split(String string, String delimiter) {
        return Arrays.asList(string.split(Pattern.quote(delimiter)));
    }

    public static boolean startswith(String string, String prefix) {
        return string.startsWith(prefix);
    }

    public static boolean startswith(String string, int offset, String... prefixes) {
        for (String prefix : prefixes) {
            if (string.startsWith(prefix, offset))
                return true;
        }
        return false;
    }


    public static boolean endswith(String string, String suffix) {
        return string.endsWith(suffix);
    }

    public static boolean endsWith(String string, int start, int end, String... suffixes) {
        String substring = string.substring(start, end);
        for (String suffix : suffixes) {
            if (substring.endsWith(suffix))
                return true;
        }
        return false;
    }

}