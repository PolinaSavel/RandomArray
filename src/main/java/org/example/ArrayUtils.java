package org.example;

import java.util.HashMap;
import java.util.Random;

public class ArrayUtils {

    // Метод для генерации массива случайного размера и значений
    public static int[] generateRandomArray() {
        Random random = new Random();
        int size = random.nextInt(20) + 1; // Случайный размер от 1 до 10
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100); // Случайные значения от 0 до 99
        }

        return array;
    }

    // Метод для поиска дубликатов в массиве
    public static Integer findDuplicate(int[] array) {
        HashMap<Integer, Integer> countMap = new HashMap<>();

        for (int num : array) {
            if (countMap.containsKey(num)) {
                return num; // Возвращаем первый найденный дубликат
            } else {
                countMap.put(num, 1);
            }
        }

        return null; // Если дубликатов нет
    }
}
