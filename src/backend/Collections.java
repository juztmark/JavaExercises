package backend;

import main.Person;

import java.util.*;
import java.util.stream.Collectors;


public class Collections {
    public static void createArrayList() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 4, 5));
    }
    public static void print(List<Integer> list) {
        if(list.isEmpty()) System.out.println("List is empty");
        list.forEach(System.out::println);
    }

    public static void addIfNotExists(List<Integer> list, int element) {
        if (!list.contains(element)) list.add(element);
    }

    public static void removeEvenNumbers(List<Integer> list) {
        list.removeIf(e -> e % 2 == 0);
    }

    public static ArrayList<Integer> getEvenNumbers(List<Integer> list) {
        return list.stream().filter(e -> e % 2 == 0).collect(Collectors.toCollection(ArrayList::new));
    }

    public static ArrayList<Integer> multiplyByLength(List<Integer> list) {
        return list.stream().map(e -> e *= list.size()).collect(Collectors.toCollection(ArrayList::new));
    }

    public static int getBudget(List<Person> people) {
        return people.stream().mapToInt(Person::getBudget).sum();
    }

    public static boolean anyNameContainsA(List<Person> people) {
        return people.stream().anyMatch(person -> person.getName().toLowerCase().contains("a"));
    }

    public static void createHashSet() {
        Set<Integer> set = new HashSet<>(Arrays.asList(1, 1, 1, 2, 2, 3, 4, 5));
        set.forEach(System.out::println);
    }

    public static void createHashMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Red", 1);
        map.put("Green", 2);
        map.put("Black", 3);
        map.put("White", 4);
        map.forEach((k, v) -> System.out.println(k + ", " + v));
    }

    public static void addToHashMap(Map<Object,Object> map, Object k, Object v) {
        map.putIfAbsent(k, v);
    }
}
