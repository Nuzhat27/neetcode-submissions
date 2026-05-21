class Solution {
    public String encode(List<String> strs) {
        List<Integer> sizes = new ArrayList<>();

        for (String s : strs) {
            sizes.add(s.length());
        }

        StringBuilder ans = new StringBuilder();

        for (int num : sizes) {
            ans.append(num).append(',');
        }

        ans.append('#');

        for (String s : strs) {
            ans.append(s);
        }

        return ans.toString();
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();

        List<Integer> size = new ArrayList<>();
        int i = 0;
        while (str.charAt(i) != '#') {
            int j = i;
            while (str.charAt(j) != ',') j++;
            size.add(Integer.parseInt(str.substring(i , j)));
            i = j + 1;
        }

        int ind = i + 1;

        for(int len : size){
            ans.add(str.substring(ind , ind + len));
            ind += len;
        }

        return ans;
    }
}

