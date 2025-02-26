package com.example.project.Selection_Sort.Insertion_Sort;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class InsertionSort {

    // PART A. implementing insertion sort
    public static int[] insertionSort(int[] elements) {
        for (int i = 0; i < elements.length - 1; i++) {
            while (elements[i] < elements[i + 1]) {
                int temp = elements[i + 1];
                elements[i + 1] = elements[i];
                elements[i] = temp;
            }
        }
        return elements;
    }
    public static void main(String[] args) {
        int[] list = {5,4,3,2,1};
        System.out.println("Before: " + list.toString());
        InsertionSort.insertionSort(list);
        System.out.println("After: " + list.toString());
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