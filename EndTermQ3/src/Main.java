import date.Date;

public class Main {
    static Date  date = new Date();
    public static void main(String[] args) {
        System.out.println(date.TimeStamp2Date(System.currentTimeMillis()));
    }
}
