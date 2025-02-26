package com.example.project.Selection_Sort;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class SelectionSort {
    public static int[] selectionSort(int[] elements) {
        int[] sortedList = new int[elements.length];
        for (int i = 0; i < elements.length; i++) {
            int minIndex = -1;
            for (int j = 0; j < elements.length; j++) {
                if (elements[j] != Integer.MAX_VALUE && (minIndex == -1 || elements[j] < elements[minIndex])) {
                    minIndex = j;
                }
            }
            sortedList[i] = elements[minIndex];
            elements[minIndex] = Integer.MAX_VALUE;
        }
        return sortedList;
    }

    public static ArrayList<String> selectionSortWordList(ArrayList<String> words) {
        for (int j = 0; j < words.size() - 1; j++) {
            int minIndex = j;
            for (int k = j + 1; k < words.size(); k++) {
                if (words.get(k).compareTo(words.get(minIndex)) < 0) {
                    minIndex = k;
                }
            }
            String temp = words.get(j);
            words.set(j, words.get(minIndex));
            words.set(minIndex, temp);
        }
        return words;
    }

    //call this method to load 1000 words into list. Use it to test Part B
    public static ArrayList<String> loadWordsInto(ArrayList<String> wordList) {
        try {
            Scanner scan = new Scanner(new File("src/main/java/com/example/project/Selection_Sort/words.txt"));
            while (scan.hasNext()) {
                String word = scan.next();
                wordList.add(word);
            }
        } catch (IOException aException) {
            System.out.println(aException.getMessage());
        }
        return wordList;
    }
    public static void main(String[] args) {
        int[] list = {1, 3, 7, 5, 3, 5, 6, 2, 5, 7, 2, 5, 7, 9};
        int[] sortedList = selectionSort(list);
        System.out.println(Arrays.toString(sortedList));
    }
}
