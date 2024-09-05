package basic;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        int [] nums = {1,2,4};
        subsets(nums);
    }

    public static List<List<Integer>> subsets(int[] nums) {
       List<List<Integer>> resultSet = new ArrayList<>();
      subSet(nums, 0 ,resultSet , new ArrayList<Integer>());
      return resultSet;
    }

    private static void subSet(int[] nums, int i, List<List<Integer>> resultSet,  List<Integer> temp) {
      if(i==nums.length){
       resultSet.add(new ArrayList<>(temp));
        return;
      }
     for(int k =0 ;k<nums.length;k++){
        int curr = nums[k];
        temp.add(curr);
        subSet(nums, i+1, resultSet, temp);
        temp.remove(curr);
        
     }
      
}
}