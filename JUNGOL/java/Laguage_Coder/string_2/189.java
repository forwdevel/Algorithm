// For Algorithm submit template
import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String temp = scanner.nextLine();
        String[] str = new String[100];
        int idx = 0;
        int cnt = 0;

        for(int i = 0; i< 100; i++){
            if((idx = temp.indexOf(" "))!=-1){
                str[cnt++] = temp.substring(0, idx);
                temp = temp.substring(idx+1, temp.length());
            }else {
                str[cnt] = temp;
                break;
            }
        }

        for(int i = cnt; i >= 0; i--){
            System.out.println(str[i]);
        }

        scanner.close();
    }
}