package revision_and_boost_1_501515.Array.revision._504;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class _1_twoSum_E {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i])){
                return new int[]{i, map.get(target - nums[i])};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}
