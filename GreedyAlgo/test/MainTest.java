import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void greedWithTwoItemsYieldsCorrectValue() {
        assertTrue(Arrays.toString(Main.notgreed(new Gegenstand[]{new Gegenstand("A", 1), new Gegenstand("B", 2)}, 2)).equals("[B: 2.0, null]"));
    }

    @Test
    void greedWithExampleArrayYieldsCorrectValue() {
        assertTrue(Arrays.toString(Main.notgreed(new Gegenstand[]{new Gegenstand("A", 4.5),
                                                               new Gegenstand("B", 1.0),
                                                               new Gegenstand("C", 5.5),
                                                               new Gegenstand("D", 7.0),
                                                               new Gegenstand("E", 3.5),
                                                               new Gegenstand("F", 6.0)}, 2)).equals("[D: 7.0, F: 6.0, C: 5.5, B: 1.0, null, null]"));
    }
}