class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        for(int i = 0 ; i < n ; i ++){
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            int j = i + 1 , k = n - 1;
            while(j < k){
                if(nums[i] + nums[j] + nums[k] < 0){
                    j += 1;
                }
                else if(nums[i] + nums[j] + nums[k] > 0){
                    k -= 1;
                }
                else{
                    ans.add(Arrays.asList(nums[i] , nums[j] , nums[k]));
                    if(j < k && nums[j] == nums[j + 1]) j ++;
                    if(j < k && nums[k] == nums[k - 1]) k --;
                    j++;k--;
                }
            }
        }
        return ans;
    }
}
