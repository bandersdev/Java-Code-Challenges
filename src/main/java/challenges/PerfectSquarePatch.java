package challenges;

/**
 * https://edabit.com/challenge/7Tb7qMDQHtz3xpydd
 *
 * Create a function that takes an integer and outputs an n x n square solely consisting of the integer n.
 *
 */
public class PerfectSquarePatch {

    public static int[][] perfectSquarePatch(int size) {
        int[][] squarePatch = new int[size][size];
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                squarePatch[i][j] = size;
            }
        }

        return squarePatch;
    }

}
