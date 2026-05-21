class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int result = 0 , left = 0;
        for(int right = 0; right < n ; right ++){
            char ch = s.charAt(right);
            while(set.contains(ch)){
                set.remove(s.charAt(left));
                left = left + 1;
            }
            set.add(ch);
            result = Math.max(result , right - left + 1);
        }   
        return result;
    }
}
