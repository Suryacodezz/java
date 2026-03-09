package Module_8;

public class Question4 {
        public static void main(String[] args) {
            int[] nums = {4, 1, 2, 1, 2};

            int result = 0;

            for (int num : nums) {
                result ^= num;
            }

            System.out.println(result);
        }

}
