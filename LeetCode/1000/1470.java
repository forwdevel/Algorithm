class Solution {
      public int[] shuffle(int[] nums, int n) {
            // nums is a array has even size
            int[] answer = new int[nums.length];

            // They share the first value and last value
            answer[0] = nums[0];
            answer[answer.length - 1] = nums[answer.length - 1];

            for (int i = 1; i < answer.length - 1; i++) {
                  if (i % 2 != 0) {
                        // odd
                        answer[i] = nums[n + (i / 2)];
                  } else {
                        // even
                        answer[i] = nums[i / 2];
                  }
            }

            return answer;
      }
}