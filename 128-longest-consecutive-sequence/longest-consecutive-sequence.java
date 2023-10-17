class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        HashSet<Integer> seen = new HashSet<>();
        for(int num: nums){
            seen.add(num);
        }
        int longest= 1;
        for(int num :nums){
            if(!seen.contains(num-1)){
                int currentstreak= 1;
            while(seen.contains(num+1)){
                num ++;
                currentstreak++;
            }
            longest = Math.max(longest, currentstreak);
        }
        
    }
    return longest;
}
}