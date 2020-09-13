package com.germlin.design;

import java.util.Random;

public class ShuffleArray {
    private int[] array;
    private Random random = new Random();

    public ShuffleArray(int[] nums) {
        array = nums;
    }

    public int[] reset() {
        return array;
    }

    public int[] shuffle() {
        int[] result = array.clone();
        for(int i = 0; i< result.length;i++) {
            int randomIndex = random.nextInt(result.length - i) + i;
            int temp = result[i];
            result[i] = result[randomIndex];
            result[randomIndex] = temp;
        }
        return result;
    }

}
