import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int[] sortNum = sortNum(nums);
        return combineNum(sortNum);
    }

    // 排序
    private static int[] sortNum(int[] nums) {
        int s;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    s = nums[i];
                    nums[i] = nums[j];
                    nums[j] = s;
                }
            }
        }
        return nums;
    }

    // 组合
    private static List<List<Integer>> combineNum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> integers = new ArrayList<>();
                        integers.add(nums[i]);
                        integers.add(nums[j]);
                        integers.add(nums[k]);
                        if (isReAdd(integers, res)) {
                            res.add(integers);
                        }
                    }
                }
            }
        }
        return res;
    }

    // 去重
    private static boolean isReAdd(List<Integer> integers, List<List<Integer>> res) {
        for (List<Integer> iList : res) {
            if (iList.equals(integers)) {
                return false;
            }
        }
        return true;
    }
}