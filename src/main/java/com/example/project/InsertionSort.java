package com.example.project;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

    public static int[] insertionSort(int[] elements) {
        int insertionCounter = 0; // Counter

        for (int i = 1; i < elements.length; i++) {
            int key = elements[i];
            int j = i - 1;

            while (j >= 0 && elements[j] > key) {
                elements[j + 1] = elements[j];
                j--;
                insertionCounter++;
            }
            elements[j + 1] = key;
        }
        return elements;
    }

    public static void selectionSort(int[] elements) {
        int selectionCounter = 0; // Counter

        for (int i = 0; i < elements.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < elements.length; j++) {
                selectionCounter++;
                if (elements[j] < elements[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap
            int temp = elements[minIndex];
            elements[minIndex] = elements[i];
            elements[i] = temp;
        }

        System.out.println("Selection Sort Iterations: " + selectionCounter);
    }

    public static ArrayList<String> insertionSortWordList(ArrayList<String> words) {
        for (int i = 1; i < words.size(); i++) {
            String key = words.get(i);
            int j = i - 1;

            while (j >= 0 && words.get(j).compareTo(key) > 0) {
                words.set(j + 1, words.get(j)); // Shift elements right
                j--;
            }
            words.set(j + 1, key);
        }

        return words;
    }

    public static void selectionSortWordList(ArrayList<String> words) {
        for (int i = 0; i < words.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < words.size(); j++) {
                if (words.get(j).compareTo(words.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }
            // Swap
            String temp = words.get(minIndex);
            words.set(minIndex, words.get(i));
            words.set(i, temp);
        }
    }

    // Load words from a file into an ArrayList
    public static ArrayList<String> loadWordsInto(ArrayList<String> wordList) {
        try {
            Scanner input = new Scanner(new File("src/main/java/com/example/project/words.txt"));
            while (input.hasNext()) {
                wordList.add(input.next());
            }
            input.close();
        } catch (IOException e) {
            System.out.println("Error loading words: " + e.getMessage());
        }
        return wordList;
    }

    public static void main(String[] args) {
        // Integer Sorting Tests
        int[] arrA = {13,14,17,31,32,33,36,41,43,50,51,61,69,81,83,89,92,97,98,99};
        int[] arrB = {13,14,17,31,32,33,36,41,43,50,51,61,69,81,83,89,92,97,98,99};

        System.out.println("Original Array A: " + Arrays.toString(arrA));
        selectionSort(arrA);
        System.out.println("Sorted Array A (Selection Sort): " + Arrays.toString(arrA));
        System.out.println();

        System.out.println("Original Array B: " + Arrays.toString(arrB));
        insertionSort(arrB);
        System.out.println("Sorted Array B (Insertion Sort): " + Arrays.toString(arrB));
        System.out.println();

        // Word List Sorting Tests
        ArrayList<String> wordListA = new ArrayList<>();
        ArrayList<String> wordListB = new ArrayList<>();

        // Load words into lists
        loadWordsInto(wordListA);
        wordListB.addAll(wordListA);

        System.out.println("Original Word List: " + wordListA);
        selectionSortWordList(wordListA);
        System.out.println("Sorted Word List (Selection Sort): " + wordListA);
        System.out.println();

        System.out.println("Original Word List: " + wordListB);
        insertionSortWordList(wordListB);
        System.out.println("Sorted Word List (Insertion Sort): " + wordListB);
    }
}

