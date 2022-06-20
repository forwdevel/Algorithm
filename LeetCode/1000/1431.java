class Solution {
      public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            int max = 0;

            List<Boolean> temp = new ArrayList<Boolean>();

            // Store a max value
            for (int i = 0; i < candies.length; i++) {
                  if (max < candies[i]) {
                        max = candies[i];
                  }
                  candies[i] += extraCandies;
            }

            for (int i = 0; i < candies.length; i++) {
                  if (candies[i] < max) {
                        temp.add(false);
                  } else {
                        temp.add(true);
                  }
            }

            return temp;
      }
}