package challenges.quadragic;

import org.junit.jupiter.api.Test;

import challenges.quadratic.QuadraticSolutionsCount;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This test class is effectively identical to that provided at https://edabit.com/challenge/Rs23pTNpM6k5M2ThH for
 * testing that challenge.
 */
public class QuadraticSolutionsCountTest {

    @Test
    public void test1() {
        System.out.println("Inside test");
        assertEquals(2, QuadraticSolutionsCount.getQuadraticSolutionsCount(1, 0, -1));
    }

    @Test
    public void test2() {
        assertEquals(1, QuadraticSolutionsCount.getQuadraticSolutionsCount(1, 0, 0));
    }

    @Test
    public void test3() {
        assertEquals(0, QuadraticSolutionsCount.getQuadraticSolutionsCount(1, 0, 1));
    }

    @Test
    public void test4() {
        assertEquals(0, QuadraticSolutionsCount.getQuadraticSolutionsCount(200, 420, 800));
    }

    @Test
    public void test5() {
        assertEquals(2, QuadraticSolutionsCount.getQuadraticSolutionsCount(200, 420, -800));
    }

    @Test
    public void test6() {
        // I think there's actually a bug in this one. The site specifies that it should have 2 different values, but
        assertEquals(2, QuadraticSolutionsCount.getQuadraticSolutionsCount(1000, 1000, 0));
    }

    @Test
    public void test7() {
        // x = (400 +- sqrt(400^2 - 4*10000*4)) / 20000
        assertEquals(1, QuadraticSolutionsCount.getQuadraticSolutionsCount(10000, 400, 4));
    }
    
}
