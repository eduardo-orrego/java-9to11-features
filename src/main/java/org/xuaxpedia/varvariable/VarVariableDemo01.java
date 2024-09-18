package org.xuaxpedia.varvariable;

import java.util.ArrayList;

public class VarVariableDemo01 {

    public static void main(String[] args) {

        // Introduced in Java 10, this feature allows declaring local variables
        // using var so that the compiler can infer the variable type automatically,
        // simplifying the syntax. For example, var list = new ArrayList();
        // infers that list is of type ArrayList.

        var nameString = "Juan";
        var ageInt = 25;

        System.out.println("Name: " + nameString);
        System.out.println("Age: " + ageInt);

        var numberList = new ArrayList<Integer>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);

        for (var number : numberList) {
            System.out.println("Number : " + number);
        }
    }

}
