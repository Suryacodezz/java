package Module_9;

    import java.util.*;
public class Question1 {

        static List<List<Integer>> result = new ArrayList<>();

        static void backtrack(int[] nums, int start, List<Integer> current) {
            result.add(new ArrayList<>(current));

            for (int i = start; i < nums.length; i++) {
                current.add(nums[i]);
                backtrack(nums, i + 1, current);
                current.remove(current.size() - 1);
            }
        }

        public static void main(String[] args) {
            int[] nums = {1, 2, 3};
            backtrack(nums, 0, new ArrayList<>());
            System.out.println(result);
        }
    }

