class Solution {
    static int cntSubarrays(int arr[], int K) {
        java.util.HashMap<Integer, Integer> map = new java.util.HashMap<>();
        int sum = 0, count = 0;

        map.put(0, 1);
    
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (map.containsKey(sum - K)) {
                count += map.get(sum - K);
            }

            if (map.containsKey(sum)) {
                map.put(sum, map.get(sum) + 1);
            } else {
                map.put(sum, 1);
            }
        }

        return count;
    }
}
