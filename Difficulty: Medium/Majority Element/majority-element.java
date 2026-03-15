class Solution {
    static int majorityElement(int arr[]) {
        int count = 0;
        int candidate = -1;

        
        for(int num : arr){
            if(count == 0){
                candidate = num;
                count = 1;
            }
            else if(num == candidate){
                count++;
            }
            else{
                count--;
            }
        }

        
        count = 0;
        for(int num : arr){
            if(num == candidate){
                count++;
            }
        }

        if(count > arr.length / 2)
            return candidate;
        else
            return -1;
    }
}