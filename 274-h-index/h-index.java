class Solution {
    public int hIndex(int[] citations) {
        if (citations.length == 1) return citations[0] >= 1 ? 1 : 0;
        sort(citations);
        int arr[] = citations;
        for(int i=0; i<arr.length; i++){
            if(arr[i] >= arr.length - i){
                return arr.length - i;
            }
        }
        return 0;
    }

    public void sort(int arr[]){
        for(int i = 0; i<arr.length; i++){
            for(int j =1 ; j<arr.length; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}