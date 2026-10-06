class Solution {
    public boolean hasDuplicate(int[] nums) {

        int length = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0 ;i < length ;i++){
           if(map.containsKey(nums[i])){
             return true;
           }else{
            map.put(nums[i],1);
           }
        }
           return false;
        
    }
}