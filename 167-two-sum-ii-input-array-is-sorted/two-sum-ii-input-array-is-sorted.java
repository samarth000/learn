class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length-1;
        int a, b;
        while(i<j){
            a= numbers[i];
            b= numbers[j];
            if(a+b==target) break;
            if(a+b<target){
                i++;
                continue;
            }
            j--;
        }
        return new int[]{i+1,j+1};
    }
}