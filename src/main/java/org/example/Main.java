package org.example;

import static org.example.ArrayUtils.findDuplicate;
import static org.example.ArrayUtils.generateRandomArray;

public class Main {
    public static void main(String[] args) {
        int[] randomArray = generateRandomArray();
        System.out.print("Сгенерированный массив: ");
        for (int num : randomArray) {
            System.out.print(num + " ");
        }

        Integer duplicate = findDuplicate(randomArray);
        if (duplicate != null) {
            System.out.println("\nНайденный дубликат: " + duplicate);
        } else {
            System.out.println("\nДубликатов не найдено.");
        }
    }
}
