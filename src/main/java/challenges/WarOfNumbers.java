package challenges;

/**
 * https://edabit.com/challenge/7fHsizQrTLXsPWMyH
 *
 * There's a great war between the even and odd numbers. Many numbers already lost their life in this war and it's your task to end this.
 * You have to determine which group sums larger: the even, or the odd. The larger group wins.
 *
 * Create a function that takes an array of integers, sums the even and odd numbers separately,
 * then returns the difference between sum of even and odd numbers.
 */
public class WarOfNumbers {

    public static int warOfNumbers(int[] values) {
        int evenSum = 0;
        int oddSum = 0;

        for(int value : values)  {
            if(value % 2 == 0) {
                evenSum += value;
            } else {
                oddSum += value;
            }
        }

        return Math.abs(evenSum - oddSum);
    }

}
