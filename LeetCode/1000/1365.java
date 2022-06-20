class Solution {
      public int[] smallerNumbersThanCurrent(int[] nums) {
            int size = nums.length;
            int[] answer = new int[size];
            int cnt = 0;

            for (int i = 0; i < size; i++) {
                  for (int j = 0; j < size; j++) {
                        if (nums[j] != nums[i] && nums[j] < nums[i]) {
                              cnt++;
                        }
                  }
                  answer[i] = cnt;
                  cnt = 0;
            }

            return answer;
      }
}