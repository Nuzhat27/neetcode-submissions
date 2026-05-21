class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int n = people.length , boat = 0;
        int l = 0 , r = n - 1;
        while(l <= r){
            if(people[l] + people[r] <= limit){
                l ++;
                r --;
            }
            else{//Send the heaviest person alone
                r --;
            }
            boat += 1;
        }
        return boat;
    }
}