
// For Algorithm submit template

class Solution {
      public static int[] solution(int[] answers) {
            int[] result = new int[3];

            int[][] student = new int[3][answers.length];

            for (int j = 0; j < answers.length; j++) {
                  // case 1
                  student[0][j] = (j % 5) + 1;
                  if (student[0][j] == answers[j]) {
                        result[0]++;
                  }

                  // case 2
                  if (j % 2 == 0) {
                        student[1][j] = 2;
                  } else {
                        if (j == 1) {
                              student[1][j] = 1;
                        } else if (student[1][j - 2] == 5) {
                              student[1][j] = 1;
                        } else {
                              student[1][j] = student[1][j - 2] + 2;
                        }
                  }
                  if (student[1][j] == answers[j]) {
                        result[1]++;
                  }

                  // case 3
                  if (j % 10 == 0) {
                        student[2][j] = 3;
                        try {
                              student[2][j + 1] = 3;
                        } catch (ArrayIndexOutOfBoundsException e) {
                        }
                  } else if (j % 10 == 2) {
                        student[2][j] = 1;
                        try {
                              student[2][j + 1] = 1;
                        } catch (ArrayIndexOutOfBoundsException e) {
                        }
                  } else if (j % 10 == 4) {
                        student[2][j] = 2;
                        try {
                              student[2][j + 1] = 2;
                        } catch (ArrayIndexOutOfBoundsException e) {
                        }
                  } else if (j % 10 == 6) {
                        student[2][j] = 4;
                        try {
                              student[2][j + 1] = 4;
                        } catch (ArrayIndexOutOfBoundsException e) {
                        }
                  } else if (j % 10 == 8) {
                        student[2][j] = 5;
                        try {
                              student[2][j + 1] = 5;
                        } catch (ArrayIndexOutOfBoundsException e) {
                        }
                  }

                  if (student[2][j] == answers[j]) {
                        result[2]++;
                  }
            }

            if (result[0] == result[1] && result[1] == result[2]) {
                  int[] ans = { 1, 2, 3 };
                  return ans;
            } else if (result[0] > result[1] && result[0] > result[2]) {
                  int[] ans = { 1 };
                  return ans;
            } else if (result[1] > result[0] && result[1] > result[2]) {
                  int[] ans = { 2 };
                  return ans;
            } else if (result[2] > result[0] && result[2] > result[1]) {
                  int[] ans = { 3 };
                  return ans;
            } else if (result[0] == result[1]) {
                  int[] ans = { 1, 2 };
                  return ans;
            } else if (result[1] == result[2]) {
                  int[] ans = { 2, 3 };
                  return ans;
            } else if (result[2] == result[0]) {
                  int[] ans = { 1, 3 };
                  return ans;
            }

            int[] ans = { 1, 2, 3 };

            return ans;
      }

      public static void main(String[] args) {
            int[] answers = { 1, 5, 2, 3, 2, 4, 2, 3, 3, 5, 2, 1, 2, 2, 3, 4, 4, 2, 1, 3, 2, };

            System.out.println();
            for (int i = 0; i < solution(answers).length; i++) {
                  System.out.print(solution(answers)[i] + " ");
            }
      }
}