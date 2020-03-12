package com.tarnovskiy.HW;

import java.util.Arrays;

/**
 * @author Tarnovskiy Maksim
 */
public class Lesson06 {
    public static void main(String[] args) {
    }

    public static int[] fixArray(int[] array) {
        for (int i = array.length - 1; i >= 0 ; i--) {
            if(array[i] == 4){
                return Arrays.copyOfRange(array, i + 1, array.length);
            }
        }
        throw new RuntimeException();
    }

    public static boolean searchOneAndFour(int[] array){
        boolean oneAndFour = false;
        int count1 = 0;
        int count4 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1){
                count1++;
            }
            if(array[i] == 4){
                count4++;
            }
            if(count1 > 0 && count4 > 0){
                oneAndFour = true;
                break;
            }
        }
        return oneAndFour;
    }
}
