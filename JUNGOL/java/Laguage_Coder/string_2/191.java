// For Algorithm submit template
import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] str = new String[50];
        int cnt = 0;

        for(int i = 0 ; i < str.length; i++){
            str[i] =scanner.next();
            if(str[i].charAt(0) != '0'){
                cnt++;
            } else {
                break;
            }
        }

        System.out.println(cnt);
        for(int i = 0; i < cnt; i+=2){
            System.out.println(str[i]);
        }

        scanner.close();
    }
}