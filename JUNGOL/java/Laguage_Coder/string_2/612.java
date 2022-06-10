// For Algorithm submit template
import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr= new int[5];
        String str = "";

        for(int i = 0; i < 5; i++){
            arr[i] = scanner.nextInt();
            str+=arr[i];
        }

        for(int i = 1; i <= str.length(); i++){
            System.out.print(str.charAt(i-1));
            if(i % 3==0){
                System.out.println();
            }
        }

        scanner.close();
    }
}