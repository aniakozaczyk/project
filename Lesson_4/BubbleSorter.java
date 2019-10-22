package Lesson_4;

import java.util.Arrays;

public class BubbleSorter {

    public static void main(String[] args) {

        int[] numbers = {8, 9, 10, 8, 12, 15, 16, 9, 2 , 8, -2};

        int dłu = numbers.length;
        int max = numbers[0];
        int min = numbers[0];



        for (int number : numbers){
             if(max < number){
                 max = number;
             } if (min > number){
                 min = number;
            }

        }


        Arrays.sort(numbers);

        System.out.println("max liczba to: " + max);
        System.out.println("min liczba to: " + min);

    }
}
