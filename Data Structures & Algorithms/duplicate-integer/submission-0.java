class Solution {
    public boolean hasDuplicate(int[] nums) {
        int len = nums.length;
        HashSet<Integer> duplicate = new HashSet<>();

        for(int i=0; i<len;i++){
            int dup=nums[i];
if(duplicate.contains(dup)){
    return true;
}else{
    duplicate.add(dup);
}

        }

        return false;
    }
}