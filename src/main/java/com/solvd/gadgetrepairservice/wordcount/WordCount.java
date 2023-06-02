package com.solvd.gadgetrepairservice.wordcount;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordCount {
    public static void main(String[] args) {
        String inputFile = "src/main/resources/input.txt";
        String outputFile = "src/main/resources/output.txt";

        try {
            // Read the text file
            List<String> lines = FileUtils.readLines(new File(inputFile), "UTF-8");

            // Concatenate all lines into a single string
            String text = StringUtils.join(lines, " ");

            // Split the text into words
            String[] words = StringUtils.split(text);

            // Create a set to store unique words
            Set<String> uniqueWords = new HashSet<>();

            // Count the number of unique words
            for (String word : words) {
                uniqueWords.add(word);
            }

            int uniqueWordCount = uniqueWords.size();

            // Write the result to the output file
            FileUtils.writeStringToFile(new File(outputFile), "Unique word count: " + uniqueWordCount, "UTF-8");

            System.out.println("Unique word count: " + uniqueWordCount);
            System.out.println("Result written to " + outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}