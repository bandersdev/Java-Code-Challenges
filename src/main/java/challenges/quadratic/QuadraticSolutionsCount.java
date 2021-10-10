package challenges.quadratic;

/**
 * This class contains a method to answer the question 'how many real solutions
 * does a quadratic of the for ax^2 + bx + c = 0 have?
 *
 * Question and test class from https://edabit.com/challenge/Rs23pTNpM6k5M2ThH
 *
 */
public class QuadraticSolutionsCount {

    public static int getQuadraticSolutionsCount(int a, int b, int c) {

        // quadratic formula:
        // x = (-b +/- squrt(b^2 - 4ac))/2a)

        // results in divide by zero in quadratic formula
        if (a == 0 && b != 0) { // not a real number && (b*b != b && b != 0)) {
            return 1;
        } else if (a == 0) { // (b == 0) results in the value 0
            return 0;
        } else if(b == 0 && c == 0) { // (a != 0) results in the value 0
            return 1;
        } else if(4 * a * c > b * b) { // b^2 - 4ac results in a negative number, gives an imaginary root
            return 0;
        } else if(4 * a * c == b * b) { // b^2 = 4ac, results in the value being -b / 2ac
            return 1;
        } else { // (4 * a * c < b * b): b^2 - 4ac results in a positive number, gives a real number root for the b +- value
            return 2;
        }
    }

}
