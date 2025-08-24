class Solution {
    int maxSubarraySum(int arr[]) {
        int n = arr.length;   
        int currSum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < n; i++) {
            if (currSum + arr[i] > arr[i]) {
                currSum = currSum + arr[i];
            } else {
                currSum = arr[i];
            }

            if (currSum > maxSum) {
                maxSum = currSum;
            }
        }
        return maxSum;
    }
}
