import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void linearSearchWithOneNumberYieldsCorrectPositiveResult() {
        assertTrue(Main.linearSearch(new int[]{1}, 1) == 0);
    }

    @Test
    void linearSearchWithOneNumberYieldsCorrectNegativeResult() {
        assertTrue(Main.linearSearch(new int[]{2}, 1) == -1);
    }

    @Test
    void linearSearchWithAllSameNumbersYieldsCorrectPositiveResult() {
        assertTrue(Main.linearSearch(new int[]{2, 2, 2, 2}, 2) == 0);
    }

    @Test
    void linearSearchWithAllSameNumbersYieldsCorrectNegativeResult() {
        assertTrue(Main.linearSearch(new int[]{2, 2, 2, 2}, 1) == -1);
    }

    @Test
    void linearSearchWithNoNumbersYieldsCorrectNegativeResult() {
        assertTrue(Main.linearSearch(new int[]{}, 1) == -1);
    }

    @Test
    void linearSearchWithRandomNumbersYieldsCorrectResult() {
        assertTrue(Main.linearSearch(new int[]{5, 8, 98, 46, 17, 3, 55, 11, 65, 87, 16}, 87) == 9);
    }

    @Test
    void binarySearchWithOneNumberYieldsCorrectPositiveResult() {
        assertTrue(Main.linearSearch(new int[]{1}, 1) == 0);
    }

    @Test
    void binarySearchWithOneNumberYieldsCorrectNegativeResult() {
        assertTrue(Main.linearSearch(new int[]{2}, 1) == -1);
    }

    @Test
    void binarySearchWithAllSameNumbersYieldsCorrectPositiveResult() {
        assertTrue(Main.linearSearch(new int[]{2, 2, 2, 2}, 2) == 0);
    }

    @Test
    void binarySearchWithAllSameNumbersYieldsCorrectNegativeResult() {
        assertTrue(Main.linearSearch(new int[]{2, 2, 2, 2}, 1) == -1);
    }

    @Test
    void binarySearchWithNoNumbersYieldsCorrectNegativeResult() {
        assertTrue(Main.linearSearch(new int[]{}, 1) == -1);
    }

    @Test
    void binarySearchWithRandomNumbersYieldsCorrectResult() {
        assertTrue(Main.linearSearch(new int[]{3, 5, 8, 11, 16, 17, 46, 55, 65, 87, 98}, 87) == 9);
    }
}