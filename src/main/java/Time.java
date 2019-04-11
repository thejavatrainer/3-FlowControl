public class Time {
    int hour, minute, second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public static int convetToSeconds(int minutes) {
        return minutes*60;
    }
    public boolean compareTwoTimeValues(Time a,Time b){
        return ((a.hour==b.hour)&&(a.minute==b.minute)&&(a.second==b.second));
    }

}
