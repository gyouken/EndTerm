package date;

public class Date {
    static int mon1[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static int mon2[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static int fouryears = 1461;
    static long daysec = 86400;
    static int remain = 0;

//    public String TimeStamp2Date(long stamp) {
//
//    }

    public static String TimeStamp2Date(long stamp) {
        stamp = stamp / 1000;
        int days = (int) (stamp / daysec + 1);
        int remainS = (int) (stamp % daysec);
        int year4 = days / fouryears;
        remain = days % fouryears;
        int desYear = 1970 + year4 * 4;
        boolean leapYear = false;
        if (remain < 365) {
        } else if (remain < (365 + 365)) {
            desYear += 1;
            remain -= 365;
        } else if (remain < (365 + 365 + 365)) {
            desYear += 2;
            remain -= (365 + 365);
        } else {//润年
            desYear += 3;
            remain -= (365 + 365 + 365);
            leapYear = true;
        }
        int desMonth = GetMonth(leapYear);
        int desDay = remain;
        String time = GetTime(remainS);
        return "GMT "+desYear+"-"+desMonth+"-"+desDay+" "+time;
    }

    public static int GetMonth(boolean isleap) {
        int[] mon;
        if (isleap) {
            mon = mon2;
        } else {
            mon = mon1;
        }
        int month = 0;
        for (int i = 0; i < 12; ++i) {
            int temp = remain - mon[i];
            if (temp <= 0) {
                month = i + 1;
                break;
            }
            remain = temp;
        }
        return month;
    }

    public static String GetTime(int sec) {
        int h = sec / 3600;
        int m = sec % 3600 / 60;
        int s = sec % 60;
        return h + ":" + m + ":" + s;
    }
}
