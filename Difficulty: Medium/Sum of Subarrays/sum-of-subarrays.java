class Solution {
    public int subarraySum(int[] arr) {
        // code here
        int n = arr.length;
        long sum = 0;
        for(int i = 0; i<n; i++){
            sum += (long) arr[i] * (i + 1)*(n-i);
            
        }
        return(int) sum;
    }
}
