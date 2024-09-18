package org.xuaxpedia.newcollectionmethod;

import java.util.*;
import java.util.logging.Logger;

public class CollectionMethodDemo01 {

    public static void main(String[] args) {

        // Factory methods like List.copyOf(), Set.copyOf(), and Map.copyOf()
        // create immutable copies of existing collections, protecting the original data
        // from accidental modifications.

        Logger logger = Logger.getLogger(CollectionMethodDemo01.class.getName());

        Optional<String> nameOptional = Optional.empty();
        try {
            String name = nameOptional.orElseThrow(() -> new IllegalArgumentException("Name is missing"));
        } catch (IllegalArgumentException e) {
            logger.warning("Interrupted!\n" + e);
            Thread.currentThread().interrupt();
        }

        List<String> nameList = Arrays.asList("Pedro", "Ana", "María");
        List<String> nameImmutableList = List.copyOf(nameList);
        System.out.println("Name List : " + nameImmutableList);
        try {
            nameImmutableList.add("Luis");
        } catch (UnsupportedOperationException e) {
            System.out.println("UnsupportedOperationException - Immutable List - " +
                    "Add operation is not supported by this list");
        }


        Set<Integer> numberSet = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> numberImmutableSet = Set.copyOf(numberSet);
        System.out.println("Number Set : " + nameImmutableList);
        try {
            numberImmutableSet.remove(1);
        } catch (UnsupportedOperationException e) {
            System.out.println("UnsupportedOperationException - Immutable Set - " +
                    "Remove operation is not supported by this Set");
        }

        Map<String, Integer> ageMap = new HashMap<>();
        ageMap.put("Juan", 30);
        ageMap.put("Ana", 25);
        Map<String, Integer> ageImmutableMap = Map.copyOf(ageMap);
        System.out.println("Age Map" + ageImmutableMap);
        try {
            ageImmutableMap.put("María", 22);
        } catch (UnsupportedOperationException e) {
            System.out.println("UnsupportedOperationException - Immutable Map - " +
                    "Put operation is not supported by this Map");
        }

    }

}
