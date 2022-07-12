import static org.junit.jupiter.api.Assertions.*;


class KellerspeicherMitArrayTest {

    KellerspeicherMitArray sp1 = new KellerspeicherMitArray(8);

    @org.junit.jupiter.api.Test
    void top() {
        sp1.push(3);
        assertEquals(sp1.top(),3);
        sp1.push(6);
        assertEquals(sp1.top(),6);
        assertEquals(sp1.size,2);
    }

    @org.junit.jupiter.api.Test
    void isEmpty() {
    }

    @org.junit.jupiter.api.Test
    void push() {
    }

    @org.junit.jupiter.api.Test
    void pop() {
        sp1.push(3);
        assertEquals(sp1.pop(),3);
        assertEquals(sp1.size,0);
        assertTrue(sp1.isEmpty());
        sp1.push(5);
        sp1.push(7);
        sp1.push(9);
        assertEquals(sp1.pop(),9);
        assertEquals(sp1.size,2);
    }
}