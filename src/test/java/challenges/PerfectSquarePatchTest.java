package challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Unit tests derived from https://edabit.com/challenge/7Tb7qMDQHtz3xpydd
 */
public class PerfectSquarePatchTest {

    @Test
    public void test1() {
        assertArrayEquals(PerfectSquarePatch.perfectSquarePatch(3), new int[][] {
                {3, 3, 3},
                {3, 3, 3},
                {3, 3, 3}
        });
    }

    @Test
    public void test2() {
        assertArrayEquals(PerfectSquarePatch.perfectSquarePatch(2), new int[][] {
                {2, 2},
                {2, 2}
        });
    }

    @Test
    public void test3() {
        assertArrayEquals(PerfectSquarePatch.perfectSquarePatch(4), new int[][] {
                {4, 4, 4, 4},
                {4, 4, 4, 4},
                {4, 4, 4, 4},
                {4, 4, 4, 4}
        });
    }

    @Test
    public void test4() {
        assertArrayEquals(PerfectSquarePatch.perfectSquarePatch(6), new int[][] {
                {6, 6, 6, 6, 6, 6},
                {6, 6, 6, 6, 6, 6},
                {6, 6, 6, 6, 6, 6},
                {6, 6, 6, 6, 6, 6},
                {6, 6, 6, 6, 6, 6},
                {6, 6, 6, 6, 6, 6}
        });
    }

    @Test
    public void test5() {
        assertArrayEquals(PerfectSquarePatch.perfectSquarePatch(5), new int[][] {
                {5, 5, 5, 5, 5},
                {5, 5, 5, 5, 5},
                {5, 5, 5, 5, 5},
                {5, 5, 5, 5, 5},
                {5, 5, 5, 5, 5}
        });
    }

    @Test
    public void test6() {
        assertArrayEquals(PerfectSquarePatch.perfectSquarePatch(1), new int[][]{{1}});
    }

    @Test
    public void test7() {
        assertArrayEquals(PerfectSquarePatch.perfectSquarePatch(0), new int[][]{});
    }
}
