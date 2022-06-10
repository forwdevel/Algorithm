// For Algorithm submit template
import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] str = {"flower", "rose", "lily", "daffodil", "azalea"};

        char target = scanner.next().charAt(0);
        int cnt = 0;

        for(int i = 0; i < 5; i ++){
            for(int j = 1; j < 3; j++){
                if(str[i].charAt(j)==target){
                    System.out.println(str[i]);
                    cnt++;
                    break;
                }
            }
        }
        System.out.println(cnt);

        scanner.close();
    }
}