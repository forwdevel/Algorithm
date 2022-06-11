// For Algorithm submit template
import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        int[] cnt = new int[26];

        for(int i = 0; i < cnt.length; i++){
            cnt[i] = -1;
        }

        for(int i = 0; i < str.length(); i++){
            if(cnt[str.charAt(i)-'a'] == -1) {
                cnt[str.charAt(i)-'a'] = i;
            }
        }

        for(int i = 0; i < cnt.length; i++){
            System.out.print(cnt[i]+" ");
        }

        scanner.close();
    }
}