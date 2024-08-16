package week.one;
import java.util.List;

public class PlusMinusNumberRatio {

    public static void main(String[] args) {
        Integer[] arr = {1, 1, 0, 2, 3};
        plusMinus(List.of(arr));
    }

    public static void plusMinus (List<Integer> arr) {
        int totalLength = arr.size();

        int positiveNumberCount = 0;
        int negativeNumberCount = 0;
        int zeroCount = 0;

        for(Integer number : arr) {
            if(number > 0) {
                positiveNumberCount++;
            } else if (number < 0) {
                negativeNumberCount++;
            }
            else {
                zeroCount++;
            }
        }

        //need to convert the number to double
        System.out.printf("%.6f%n", (double)positiveNumberCount/totalLength);
        System.out.printf("%.6f%n", (double)negativeNumberCount/totalLength);
        System.out.printf("%.6f%n", (double)zeroCount/totalLength);
    }
}
