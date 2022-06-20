public class Main {
    public static void main(String[] args) {
        String result = getDurationString(65, 45);
        System.out.println(result);

        String result1 = getDurationString(3945);
        System.out.println(result1);
    }

    private static String getDurationString(int minutes, int seconds){
        if((minutes < 0) || (seconds < 0) || (seconds > 59)){
            return "Invalid Value";
        }
        int hour = minutes / 60;
        int remainingMinutes = minutes % 60;

        String hoursString = hour + "h";
        if(hour < 10){
            hoursString = "0" + hoursString;
        }

        String minutesString = remainingMinutes + "m";
        if(remainingMinutes < 10){
            minutesString = "0" + minutesString;
        }

        String secondsString = seconds + "s";
        if(seconds < 10){
            secondsString = "0" + secondsString;
        }

        return hoursString + " " + minutesString + " " + secondsString + " ";

    }

    private static String getDurationString(int seconds){
        if(seconds < 0){
            return "Invalid Value";
        }

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);
    }
}
