// For Algorithm submit template
import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // row
        int m = scanner.nextInt(); // column
        int b = scanner.nextInt(); // Number of Blocks in inventory
        
        int[][] ground = new int[n][m];
        
        int avg = 0;
        int min = 256;
        int max = 0;

        for(int i = 0; i < ground.length; i++){
            for(int j = 0; j < ground[i].length; j++){
                ground[i][j] = scanner.nextInt();
                avg += ground[i][j];

                if(min > ground[i][j]){
                    min = ground[i][j];
                }

                if(max < ground[i][j]){
                    max = ground[i][j];
                }
            }
        }

        avg /= n * m;

        int cnt = 0;
        int work_1 = 0; // average calculate
        int work_2 = 0; //must remove (block leck)

        for(int i = 0; i < ground.length; i++){
            for(int j = 0; j < ground[i].length; j++){
                if(avg != ground[i][j]){
                    cnt++; // check cnt
                }

                if(ground[i][j] > min){
                    // cnt is lack
                    // remove others
                    work_2 += ground[i][j] - min;
                } 
                
                if (ground[i][j] > avg){
                    // cnt is enough
                    // add others
                    work_1 += (max - ground[i][j]) * 2;
                } else {
                    work_1 += ground[i][j] - avg;
                }
            }
        }

        if(b < cnt){ // Must work2
            System.out.printf("%d %d", work_2, min);
        } else {
            System.out.printf("%d %d", work_1, avg);
        }

        scanner.close();
    }
}