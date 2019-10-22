package Lesson_4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Bubble {

    public static void main(String[] args) {


        int[] numbers = {7, 13, 5, -2, 6, 20, 15, 8};

        boolean isSorted = true;

        int i = 0;

        do {
            isSorted = true;
            for (int j = 1; j < numbers.length-i; j++) {
                if (numbers[j - 1] > numbers[j]) {
                    int tem = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = tem;
                    isSorted = false;
                }

            }
            i++;

        } while (!isSorted);

        System.out.println(Arrays.toString(numbers));


    }
}