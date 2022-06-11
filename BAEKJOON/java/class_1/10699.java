// For Algorithm submit template
import java.text.SimpleDateFormat;
import java.util.Calendar;


class Main {
    public static void main(String[] args) {

        SimpleDateFormat form = new SimpleDateFormat("yyyy-MM-dd");

        Calendar cal = Calendar.getInstance();

        System.out.println(form.format(cal.getTime()));

    }
}