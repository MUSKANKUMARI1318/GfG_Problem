class Solution {
    public static int findSum(int n) {
        // code here
        if(n==0)
        return 0;
        
        int res = n*(n+1);
        int result=res/2;
        
        return result;
        
        
    }
}
