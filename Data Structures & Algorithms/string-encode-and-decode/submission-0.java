class Solution {

    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();
        for(String s : strs){
            res.append(s.length()).append('#').append(s);
        }
        return res.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0 , j ;
        while(i < str.length()){
            j = i ; 
            while(str.charAt(j) != '#'){
                j += 1;
            }
            int length = Integer.parseInt(str.substring(i , j));
            i = j + 1;//start of string
            j = i + length ; //index of the last letter of string + 1 ..to find substring
            res.add(str.substring(i , j));

            i = j;
        }
        return res;
    }
}
