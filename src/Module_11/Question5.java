package Module_11;
import java.util.*;


public class Question5 {

        public static int[] maxSlidingWindow(int[] nums, int k) {

            Deque<Integer> deque = new LinkedList<>();
            int n = nums.length;
            int[] result = new int[n - k + 1];

            int index = 0;

            for(int i = 0; i < n; i++){

                // remove elements outside window
                if(!deque.isEmpty() && deque.peek() == i - k){
                    deque.poll();
                }

                // remove smaller elements
                while(!deque.isEmpty() && nums[deque.peekLast()] < nums[i]){
                    deque.pollLast();
                }

                deque.offer(i);

                // store result
                if(i >= k - 1){
                    result[index++] = nums[deque.peek()];
                }
            }

            return result;
        }

        public static void main(String[] args) {

            int[] nums = {1,3,-1,-3,5,3,6,7};
            int k = 3;

            int[] res = maxSlidingWindow(nums, k);

            for(int num : res){
                System.out.print(num + " ");
            }
        }

}
