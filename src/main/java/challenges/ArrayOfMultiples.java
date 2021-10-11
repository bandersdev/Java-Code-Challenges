package challenges;

/**
 * https://edabit.com/challenge/rzpucPyoyEtXPo2BG
 *
 * Create a function that takes two numbers as arguments (num, length) and returns an array of multiples of num until the array length reaches length.
 */
public class ArrayOfMultiples {

    public static int[] arrayOfMultiples(int value, int length) {
        int[] multiplesArray = new int[length];
        for(int i = 0; i < length; i++) {
            multiplesArray[i] = value * (i+1);
        }

        return multiplesArray;
    }
}
