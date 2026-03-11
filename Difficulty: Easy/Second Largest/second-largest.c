int getSecondLargest(int *arr, int n) {
    
    
    // code here
    int largest = -1;
    int secondlargest = -1;
    
    for(int i =0; i<n;i++){
        if(arr[i]>largest){
            secondlargest = largest;
            largest = arr[i];
        }
        else if(arr[i] > secondlargest && arr[i]!= largest){
            secondlargest = arr[i];
        }
    }
    return secondlargest;
    
    
}
