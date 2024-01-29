class Solution {
    public int numberOfSteps(int n) {
        return helper(n, 0);
    }
    private int helper(int n, int steps){
        if(n==0){
            return steps;
        }
        int rem= n%2;
        if(rem==0){
            return helper(n/2, steps+1);
        }
        return helper(n-1, steps+1);
    }
}