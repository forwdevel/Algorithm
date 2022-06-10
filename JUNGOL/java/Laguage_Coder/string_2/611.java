// For Algorithm submit template
import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        String tempInt = "";
        String tempDouble = "";
        boolean isDot = false;
        boolean isEnd = false;

        for( int i = 0; i < str.length(); i++){
            if((str.charAt(i)>='0' && str.charAt(i)<='9' && !isDot && !isEnd) || str.charAt(i) == '.' ){
                if(str.charAt(i) == '.'){
                    if(!isDot){
                        isDot = true;
                        tempDouble += str.charAt(i);
                    } else {
                        break;
                    }
                } else {
                    tempInt += str.charAt(i);
                    tempDouble += str.charAt(i);
                }
            } else if(str.charAt(i)>='0' && str.charAt(i)<='9' && isDot && !isEnd){
                    tempDouble += str.charAt(i);
            } else {
                isEnd = true;
            }
        }

        try {
            System.out.println(Integer.parseInt(tempInt)*2);
            System.out.printf("%.2f",Math.round(Double.parseDouble(tempDouble)*100)/100.0);
        } catch (NumberFormatException e) {
            //TODO: handle exception
        }

        scanner.close();
    }
}