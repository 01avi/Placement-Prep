package Placement;

import java.util.Arrays;

public class OccurenceNoArray {
    public static void main(String[] args) {
        int[] num = { 1, 2, 3, 2, 4, 1, 5, 3, 6, 7, 7, 8, 9, 8, 10 };
        Arrays.sort(num);
        for (int i = 0; i < num.length-1; i++) {
            int count = 1;
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] == num[j]) {
                    count++;
                } else {
                    break;
                }
            }
            System.out.println("Count of " + num[i] + " : " + count);
            i += count - 1;
        }
    }
}
