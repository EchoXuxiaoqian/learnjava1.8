package cn.echo.learn.basic;

import java.util.Arrays;
import java.util.Random;

public class ArrayType {
    public static void main(String[] args) {
        forEachState(initArray());
        copyArray();
        sortArray();
    }

    public static int[] initArray() {
        int[] ints = new int[10];
        for (int i = 0; i < 10; i++) {
            ints[i] = i;
        }
        System.out.println(Arrays.toString(ints));

        String[] strings = {"123", "abc", "ABD", ",./"};
        System.out.println(Arrays.toString(strings));
        return ints;
    }

    public static void forEachState(int[] ints) {
        for (int i : ints) {
            System.out.println(i);
        }
    }

    public static void copyArray() {
        int[] ints1 = initArray();
        int[] ints2 = ints1;
        ints2[0] = 9;
        System.out.println(Arrays.toString(ints1));
        System.out.println(Arrays.toString(ints2));
        int[] ints3 = new int[ints1.length];
        System.arraycopy(ints1, 0, ints3, 0, ints1.length);
        ints3[0] = 6;
        System.out.println(Arrays.toString(ints1));
        System.out.println(Arrays.toString(ints3));
        int[] ints4 = new int[0];
        ints4 = Arrays.copyOf(ints3, ints1.length);
    }

    public static int[] initRandomArray() {
        int[] ints = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            ints[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(ints));
        return ints;
    }

    public static void sortArray(){
        int[] ints = initRandomArray();
        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));
    }

}
