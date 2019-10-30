package gr.athtech.ioo;

public class Time {
    private int hour;
    private int min;
    private int sec;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    @Override
    public String toString() {
        return "Time{" +
                "hour=" + hour +
                ", min=" + min +
                ", sec=" + sec +
                '}';
    }

    public void setTime(int hour, int min, int sec) {
        setHour(hour);
        setMin(min);
        setSec(sec);
    }

    private String checkPmAm() {
        if (hour<12) {
            return " am";
        }
        else if (hour == 12) {
            setHour(1);
            return " pm";
        }
        else {
            setHour(hour - 12);
            return " pm";
        }
    }

    public void displayTime() {
        String ba = checkPmAm();
        System.out.println(hour + ":" + min + ":" + sec + ba);
    }
}
