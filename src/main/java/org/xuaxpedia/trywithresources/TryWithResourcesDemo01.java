package org.xuaxpedia.trywithresources;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;

public class TryWithResourcesDemo01 {

    public static void main(String[] args) throws IOException {

        // Introduced in Java 7, the try-with-resources block automatically
        // manages the closing of resources that implement AutoCloseable.
        // In Java 11, it is enhanced to allow the use of variables already
        // declared outside the block, simplifying code and improving
        // readability by avoiding the redeclaration of variables.

        Logger logger = Logger.getLogger(TryWithResourcesDemo01.class.getName());

        String pathFile = "numbers.txt";

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathFile));

        try (bufferedWriter) {
            for (int i = 1; i <= 10; i++) {
                bufferedWriter.write(i + "\n");
            }
        } catch (IOException e) {
            logger.warning("Interrupted!\n" + e);
            Thread.currentThread().interrupt();
        }

        System.out.println("Successful Created File: " + pathFile);
    }

}
