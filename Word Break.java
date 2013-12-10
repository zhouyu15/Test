public class Solution {
    public boolean wordBreak(String s, Set<String> dict) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        //if(s.length() == 0) return true;
        boolean[] array = new boolean[s.length()+1];
        array[0] = true;
        for(int i = 1; i < s.length()+1; i++){
            for(int index = i-1; index >= 0; index--){
                if(array[index] && dict.contains(s.substring(index,i))){
                    array[i] = true;
                    break;
                }
            }
        }
        return array[s.length()];
    }
}