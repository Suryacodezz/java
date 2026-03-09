package Module_9;
import java.util.*;

public class Question2 {


        static void permute(int[] nums, boolean[] used, List<Integer> current, List<List<Integer>> result) {
            if (current.size() == nums.length) {
                result.add(new ArrayList<>(current));
                return;
            }

            for (int i = 0; i < nums.length; i++) {
                if (used[i]) continue;

                used[i] = true;
                current.add(nums[i]);

                permute(nums, used, current, result);

                current.remove(current.size() - 1);
                used[i] = false;
            }
        }

        public static void main(String[] args) {
            int[] nums = {1, 2, 3};

            List<List<Integer>> result = new ArrayList<>();
            permute(nums, new boolean[nums.length], new ArrayList<>(), result);

            System.out.println(result);
        }

}
