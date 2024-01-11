import java.util.HashMap;
import java.util.Map;

public class Problem1 {
    public static int[] Problem1(int[] nums, int target){
        Map<Integer, Integer> numbers = new HashMap<>();


        for(int i = 0 ; i <= nums.length - 1; i++){
            if(numbers.containsKey(target - nums[i])){
                return new int[]{ numbers.get(target - nums[i]) , i};
            }
            numbers.put(nums[i], i);

        }

        return new int[]{};

    }
}
