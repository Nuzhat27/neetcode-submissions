class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int lcs = 0 ;
        for(int i = 0 ; i < n ; i ++){
            if(!set.contains(nums[i] - 1)){
                int currentNum = nums[i];
                int currentStreak = 1;
                while (set.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }
                lcs = Math.max(lcs, currentStreak);
            }
        }
        return lcs;
    }
}
