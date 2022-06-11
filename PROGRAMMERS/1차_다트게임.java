class Solution {
    public static int solution(String dartResult) {
        // [ Logic Ideas ]
        // Declare score(int), score_before(int), sum(int), section(char) and option(char)
        // First is must the score
        // Second is must the section
        // Third cannot sure about option (devide through char range)
        // After calculate => Initialize score, section, option
        
        int current_idx = 0;
        int[] score = new int[3];
        char section = ' ';
        
        for(int i = 0; i < dartResult.length(); i++) {
            if(dartResult.charAt(i) >= '0' && dartResult.charAt(i) <= '9') {
                if(dartResult.charAt(i+1) >= '0' && dartResult.charAt(i+1) <= '9'){
                    score[current_idx] = (int)dartResult.charAt(i) - '0';
                    i++;
                    score[current_idx] *= 10 + (int)dartResult.charAt(i) - '0';
                    i++; // next of score is must section => skip
                } else {
                    score[current_idx] = (int)dartResult.charAt(i) - '0';
                    i++; // next of score is must section => skip
                }

                section = dartResult.charAt(i);
                switch(section){
                    case 'D':
                        score[current_idx] = score[current_idx] * score[current_idx];
                        break;
                    case 'T':
                        score[current_idx] = score[current_idx] * score[current_idx] * score[current_idx];
                        break;
                }
                
                if((i + 1) < dartResult.length() && dartResult.charAt(i+1) == '*'  ){
                    if(i-1 == 0) {
                        // first try => can not find before score;
                        // Control exception
                        score[current_idx] *= 2;
                    } else {
                        score[current_idx-1] *= 2;
                        score[current_idx] *= 2;
                    }
                    if(current_idx != 2){
                        i++;
                    }
                } else if ((i + 1) < dartResult.length() && dartResult.charAt(i+1) == '#'){
                    score[current_idx] *= -1;
                    if(current_idx != 2){
                        i++;
                    }
                }
                
                if(current_idx != 2){
                    current_idx++;
                }
            }
        }

        return score[0] + score[1]+ score[2];
    }

    public static void main(String[] args) {
        // String dartResult = "1S2D*3T";
        String dartResult = "1D2S#10S";
        // String dartResult = "1D2S0T";
        // String dartResult = "1S*2T*3S";
        // String dartResult = "1D#2S*3S";
        // String dartResult = "1T2D3D#";
        // String dartResult = "1D2S3T*";

        System.out.println(solution(dartResult));
    }
}