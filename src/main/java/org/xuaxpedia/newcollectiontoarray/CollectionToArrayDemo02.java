package org.xuaxpedia.newcollectiontoarray;

import java.util.Arrays;
import java.util.List;

public class CollectionToArrayDemo02 {

    public static void main(String[] args) {

        List<String> nameList = List.of("Luis", "Irene", "Sue", "Ulises", "Patricia");

        String[] nameArray = nameList.toArray(String[]::new);
        System.out.println(Arrays.toString(nameArray));

        Integer[] numberArray = nameList.stream().map(String::length).toArray(Integer[]::new);
        System.out.println(Arrays.toString(numberArray));

    }

}
