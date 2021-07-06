import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SortTest {

    int[] numbers1, numbers2;

    @Test
    void bubblesortWithRandomInputYieldsCorrectAnswer() {
        numbers1 = new int[]{2, 1, 3, 7, 4};
        numbers2 = new int[]{1, 2, 3, 4, 7};
        assertArrayEquals(Sort.bubblesort(numbers1), numbers2);
    }

    @Test
    void sumfakWithZerosYieldsCorrectAnswer() {
        numbers1 = new int[]{0, 0, 0};
        numbers2 = new int[]{0, 0, 0};
        assertArrayEquals(Sort.bubblesort(numbers1), numbers2);
    }

    @Test
    void bubblesortWithNegativeNumbersYieldsCorrectAnswer() {
        numbers1 = new int[]{-2, -1, -3, -7, -4};
        numbers2 = new int[]{-7, -4, -3, -2, -1};
        assertArrayEquals(Sort.bubblesort(numbers1), numbers2);
    }

    @Test
    void bubblesortInputYieldsCorrectAnswer() {
        numbers1 = new int[]{2, 1, 3, 7, 4};
        numbers2 = new int[]{1, 2, 3, 4, 7};
        assertArrayEquals(Sort.bubblesort(numbers1), numbers2);
    }

    @Test
    void bubblesortWithBigInputYieldsCorrectAnswer() {
        numbers1 = new int[]{578942, 7892912, 784502784, 7823, 789374592, 7980452, 34251, 2309487, 92634, 146318, 92786348, 14};
        numbers2 = new int[]{14, 7823, 34251, 92634, 146318, 578942, 2309487, 7892912, 7980452, 92786348, 784502784, 789374592};
        assertArrayEquals(Sort.bubblesort(numbers1), numbers2);
    }
}