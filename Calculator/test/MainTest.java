import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void sumfakWithRandomInputYieldsCorrectAnswer() {
        assertTrue(Main.sumfak(5).equals("Fakultät: 120 || Summe: 15"));
    }

    @Test
    void sumfakWithNegativeInputYieldsErrorMessage(){
        assertTrue(Main.sumfak(-1).equals("Please give positive input."));
    }

    @Test
    void sumfakWithTooBigInputYieldsErrorMessage(){
        assertTrue(Main.sumfak(21). equals("Input too big."));
    }

    @Test
    void minmax() {
    }
}