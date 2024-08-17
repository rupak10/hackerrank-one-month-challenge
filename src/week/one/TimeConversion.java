package week.one;

/**
 * convert 12 hour hour format time to 24 hour format time
 */
public class TimeConversion {

    public static void main(String[] args) {
        //String twelveHourFormatTime = "12:01:00PM";
       // String twelveHourFormatTime = "11:59:40PM";
        String twelveHourFormatTime = "01:59:40PM";
        //String twelveHourFormatTime = "12:01:00AM";
        //String twelveHourFormatTime = "12:00:00AM";
        //String twelveHourFormatTime = "01:00:00AM";
        timeConversion(twelveHourFormatTime);
    }

    private static void timeConversion(String twelveHourFormatTime) {
        String[] arr = twelveHourFormatTime.split(":");
        String hourPart = "";
        String twentyFourHourFormat = "";

        if(twelveHourFormatTime.contains("AM")) {
            if(Integer.parseInt(arr[0])==12){
                hourPart = "00";
            }
            else {
                int hour = Integer.parseInt(arr[0]);
                hourPart = hour < 9 ? ("0"+hour) : hour+"";
            }
            twentyFourHourFormat = hourPart + ":" + arr[1] + ":" + arr[2].substring(0, 2);
        }
        else if (twelveHourFormatTime.contains("PM")) {
            if(Integer.parseInt(arr[0])==12){
                hourPart = "12";
            }
            else {
                int hour = Integer.parseInt(arr[0]);
                hourPart = (12+hour)+"";
            }
            twentyFourHourFormat = hourPart + ":" + arr[1] + ":" + arr[2].substring(0, 2);
        }

        System.out.println(twentyFourHourFormat);
    }

}
