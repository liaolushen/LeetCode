import java.util.Arrays;

import sort.Quick;

public class Test {
    private static int[] randomArray(int arrayLength, int maxNum) {
        int[] array = new int[arrayLength];
        for (int index = 0; index < array.length; index++) {
            array[index] = (int)(Math.random()*maxNum);
        }
        return array;
    }

    public static void main(String[] args) {
        int[] test1 = Test.randomArray(5000, 1000);
        Quick.quickSort(test1);
        String arrayString = Arrays.toString(test1);
        System.out.println(arrayString);
    }
}