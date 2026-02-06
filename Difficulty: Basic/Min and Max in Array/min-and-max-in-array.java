import java.util.*;

class Solution {
    ArrayList<Integer> getMinMax(int[] arr) {

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        ArrayList<Integer> res = new ArrayList<>();
        res.add(min);
        res.add(max);

        return res;
    }
}
