package com.example.project.Selection_Sort.Insertion_Sort;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

    // PART A. implementing insertion sort
    public static int[] insertionSort(int[] elements) {
        for (int i = 1; i < elements.length; i++) {
            int key = elements[i];  // element to be inserted
            int j = i - 1;

            // MOve elements to the right to make space for key
            while (j >= 0 && elements[j] > key) {
                elements[j + 1] = elements[j];
                j--;
            }
            elements[j + 1] = key; // Insert key at other position
        }
        return elements;
    }

    public static void main(String[] args) {
        int[] list = {5,4,3,2,1};
        System.out.println("Before: " + Arrays.toString(list));
        InsertionSort.insertionSort(list);
        System.out.println("After: " + Arrays.toString(list));
    }

    public static void selectionSort(int[] elements) {

    }

    // PART B. sorting a 1000-word list
    public static ArrayList<String> insertionSortWordList(ArrayList<String> words) {
        return words;
    }

    public static void selectionSortWordList(ArrayList<String> words) {
    }

    public static ArrayList<String> loadWordsInto(ArrayList<String> wordList) {
        try {
            Scanner input = new Scanner(new File("src/main/java/com/example/project/Selection_Sort/words.txt"));
            while (input.hasNext()) {
                String word = input.next();
                wordList.add(word);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return wordList;
    }


}