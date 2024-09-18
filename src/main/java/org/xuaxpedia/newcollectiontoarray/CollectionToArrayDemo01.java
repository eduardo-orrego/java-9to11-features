package org.xuaxpedia.newcollectiontoarray;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;

public class CollectionToArrayDemo01 {

    public static void main(String[] args) {

        // A new method in the Collection interface, toArray(IntFunction<T[]>),
        // facilitates converting collections into arrays of specific types.
        // This method uses a function that provides both the size and type of the desired array,
        // thus improving flexibility and efficiency in handling collections and arrays in Java.

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        IntFunction<Integer[]> arrayGenerator = size -> {
            Integer[] array = new Integer[size];
            Arrays.fill(array, 10);
            return array;
        };

        Integer[] resultArray = numbers.toArray(arrayGenerator);

        System.out.println(Arrays.toString(resultArray));
    }

}
