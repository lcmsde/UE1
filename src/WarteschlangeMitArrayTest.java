import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarteschlangeMitArrayTest {

    WarteschlangeMitArray wart1 = new WarteschlangeMitArray(3);

    @Test
    void push() {
    }

    @Test
    void pop() {
        wart1.push(5);
        wart1.push(9);
        wart1.push(11);
        assertEquals(wart1.pop(),5);
    }

    @Test
    void front() {
        wart1.push(5);
        wart1.push(9);
        assertEquals(wart1.front(),5);
    }
}