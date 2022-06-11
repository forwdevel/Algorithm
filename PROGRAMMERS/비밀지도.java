class Solution {
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        // n : weight and height of map (1 <= n <= 16)
        // arr1 == map1, arr2 == map2
        
        String[] map1 = new String[n];
        String[] map2 = new String[n];
        String[] result = new String[n];
        
        for(int i = 0; i < arr1.length; i++) {
            result[i] = "";
            map1[i] = Integer.toBinaryString(arr1[i]);
            if(map1[i].length() != n){
                while(map1[i].length() < n){
                    map1[i] = "0" + map1[i];
                }
            }
            map2[i] = Integer.toBinaryString(arr2[i]);
            if(map2[i].length() != n){
                while(map2[i].length() < n){
                    map2[i] = "0" + map2[i];
                }
            }
            for(int j = 0; j < n; j++) {
                if(map1[i].charAt(j) == '1' || map2[i].charAt(j) == '1') {
                    result[i] += "#";
                } else {
                    result[i] += " ";
                }
            }
        }
                   
        return result;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        String[] result = solution(n, arr1, arr2);
        

        // int n = 6;
        // int[] arr1 = {46, 33, 33 ,22, 31, 50};
        // int[] arr2 = {27 ,56, 19, 14, 14, 10};

        for(int i = 0 ; i < n; i++){
            System.out.println(result[i]);
        }

    }
}