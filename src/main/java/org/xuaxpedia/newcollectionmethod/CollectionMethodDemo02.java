package org.xuaxpedia.newcollectionmethod;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionMethodDemo02 {

    public static void main(String[] args) {

        // New static factory methods, such as List.of(), Set.of(), and Map.of(),
        // simplify the creation of immutable collections, enhancing code
        // readability and safety by avoiding more complex constructions.

        System.out.println("Java 8 - Creating an immutable set of strings");
        Set<String> setNames;
        setNames = Set.of("Carlos", "Eduardo");
        System.out.println(setNames);

        System.out.println("Java 9 - Using the of() factory method of the Set interface");
        Set<String> setNames2 = Set.of("Carlos", "Eduardo");
        System.out.println(setNames2);

        System.out.println("Java 8 - Creating an immutable list of strings");
        List<String> listNames;
        listNames = List.of("Luis", "Miguel");
        System.out.println(listNames);

        System.out.println("Java 9 - Using the of() factory method of the Set interface");
        List<String> listNames2 = List.of("Luis", "Miguel");
        System.out.println(listNames2);

        System.out.println("Java 8 - Creating an immutable map");
        Map<Integer, String> mapPerson;
        mapPerson = Map.of(43302023, "Patricia", 44236584, "Geraldine");
        System.out.println(mapPerson);

        System.out.println("Java 9 - Using the ofEntries() and Entry() factory methods " +
                "of the Map interface");
        Map<Integer, String> mapPerson2 = Map.ofEntries(
                Map.entry(43302023, "Patricia"),
                Map.entry(44236584, "Geraldine"));
        System.out.println(mapPerson2);

    }

}
