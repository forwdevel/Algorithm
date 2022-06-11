import java.util.Calendar;

class Solution {
    public String solution(int a, int b) {
        Calendar cal = Calendar.getInstance();

        cal.set(Calendar.YEAR, 2016);
        cal.set(Calendar.MONTH, a-1);
        cal.set(Calendar.DATE, b);

        int day = cal.getTime().getDay();

        switch(day){
            case 0:
                return "SUN";
            case 1:
                return "MON";
            case 2:
                return "TUE";
            case 3:
                return "WED";
            case 4:
                return "THU";
            case 5:
                return "FRI";
            case 6:
                return "SAT";
        }
        return "error";
    }
}