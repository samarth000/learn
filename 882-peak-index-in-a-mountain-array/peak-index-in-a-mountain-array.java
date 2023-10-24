class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end= arr.length-1;
        while(start<end){
            int mid= start + (end-start)/2;
            if(arr[mid]>arr[mid+1]){
                //you are in decreasing part of array
                end= mid;
            }else{
                //you are in increasing part of the array
                start = mid+1;
            }
        }
        return start;
    }
    }
