class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int n = strs.length;
        int m = Math.min(strs[0].length() , strs[n - 1].length());
        String c1 = strs[0];
        String c2 = strs[n - 1];
        String ans = "";
        for(int i = 0 ; i < m ; i ++){
            if(c1.charAt(i) == c2.charAt(i)) ans += c1.charAt(i);
            else {
                break;
            }
        }
        return ans;
    }
}