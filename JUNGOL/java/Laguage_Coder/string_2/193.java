// For Algorithm submit template
import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] str = new String[5];
        
        for(int i = 0; i < str.length; i++){
            str[i] = scanner.next();
        }
        
        char target_char = scanner.next().charAt(0);
        String target_str = scanner.next();

        scanner.close();

        int cnt = 0;

        for(int i = 0; i < str.length; i++){
            for(int j = 0; j < str[i].length(); j++){
                if(str[i].indexOf(target_char) != -1){
                    System.out.println(str[i]);
                    cnt++;
                    break;
                }
                if(str[i].indexOf(target_str)!=-1){
                    System.out.println(str[i]);
                    cnt++;
                    break;
                }
            }
        }

        if(cnt == 0){
            System.out.println("none");
        }

    }
}