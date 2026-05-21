class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n1 = word1.length();
        int n2 = word2.length();
        StringBuilder s = new StringBuilder();
        int l = 0 , r = 0;
        while(l < n1 && r < n2 ){
            s.append(word1.charAt(l));
            s.append(word2.charAt(r));
            l ++;
            r++;
        }
        while(l < n1){
            s.append(word1.charAt(l));;
            l++;
        }
        while(r < n2){
            s.append(word2.charAt(r));;
            r ++;
        }

        return s.toString();
    }
}