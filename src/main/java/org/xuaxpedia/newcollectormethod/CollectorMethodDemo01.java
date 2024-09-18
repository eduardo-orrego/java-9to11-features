package org.xuaxpedia.newcollectormethod;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorMethodDemo01 {

    public static void main(String[] args) {

        // Methods in the Collectors class, such as Collectors.toUnmodifiableList(), toUnmodifiableSet(),
        // and toUnmodifiableMap(), allow for creating immutable collections directly from streams,
        // simplifying their construction and preventing accidental modifications. For example,
        // toUnmodifiableList() creates an immutable list from a stream.

        List<Integer> numberList = Stream.of(1, 2, 3, 4, 5)
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toUnmodifiableList());

        System.out.println("Number List : " + numberList);

        try {
            numberList.add(6);
        } catch (UnsupportedOperationException e) {
            System.out.println("UnsupportedOperationException - Immutable List - " +
                    "Add operation is not supported by this List");
        }

        Set<String> countrySet = Stream.of("Perú", "Chile", "Argentina", "Brasil")
                .collect(Collectors.toUnmodifiableSet());

        System.out.println("Country Set : " + countrySet);

        try {
            countrySet.remove("Perú");
        } catch (UnsupportedOperationException e) {
            System.out.println("UnsupportedOperationException - Immutable Set - " +
                    "Remove operation is not supported by this Set");
        }

        Map<String, String> countryMap = Stream.of("Perú:Lima", "Chile:Santiago")
                .map(s -> s.split(":"))
                .collect(Collectors.toUnmodifiableMap(entry -> entry[0], entry -> entry[1]));

        System.out.println("Country Map : " + countryMap);

        try {
            countryMap.put("Argentina", "Buenos Aires");
        } catch (UnsupportedOperationException e) {
            System.out.println("UnsupportedOperationException - Immutable Map - " +
                    "Put operation is not supported by this Map");
        }
    }

}
