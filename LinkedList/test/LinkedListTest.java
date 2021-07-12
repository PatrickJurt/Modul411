import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    LinkedList linkedList;

    @Test
    void isEmpty() {
        linkedList = new LinkedList();
        assertTrue(linkedList.isEmpty());
    }
    @Test
    void getLastNode() {
        linkedList = new LinkedList();
        linkedList.add(5);
        assertEquals(5, linkedList.getLast().getValue());
    }
    @Test
    void addToEnd() {
        linkedList = new LinkedList();
        int expected = 5;
        assertEquals(expected, linkedList.add(5));
    }
    @Test
    void getSize1() {
        linkedList = new LinkedList();
        assertEquals(0, linkedList.size());
    }
    @Test
    void getSize2() {
        linkedList = new LinkedList();
        linkedList.add(5);
        assertEquals(1, linkedList.size());
    }
    @Test
    void getSize3() {
        linkedList = new LinkedList();
        linkedList.add(5);
        linkedList.add(2);
        assertEquals(2, linkedList.size());
    }
    @Test
    void removeLastNode() {
        linkedList = new LinkedList();
        linkedList.add(5);
        linkedList.add(2);
        assertEquals(2, linkedList.remove());
        assertEquals(1, linkedList.size());
    }
    @Test
    void clearList() {
        linkedList = new LinkedList();
        linkedList.add(5);
        linkedList.add(2);
        linkedList.clear();
        assertEquals(0, linkedList.size());
    }
    @Test
    void whereIs() {
        linkedList = new LinkedList();
        linkedList.add(5);
        linkedList.add(2);
        linkedList.add(3);
        assertEquals(0, linkedList.getIndexOf(5));
        assertEquals(1, linkedList.getIndexOf(2));
        assertEquals(2, linkedList.getIndexOf(3));
        assertEquals(-1, linkedList.getIndexOf(10));
    }
    @Test
    void contains() {
        linkedList = new LinkedList();
        linkedList.add(5);
        linkedList.add(2);
        linkedList.add(3);
        assertTrue(linkedList.contains(5));
        assertTrue(linkedList.contains(2));
        assertTrue(linkedList.contains(3));
        assertFalse(linkedList.contains(10));
    }

}