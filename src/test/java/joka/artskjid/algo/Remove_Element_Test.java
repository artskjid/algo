package joka.artskjid.algo;

import org.junit.Test;

import static org.junit.Assert.*;

public class Remove_Element_Test {
    @Test
    public void test() {
        Remove_Element r = new Remove_Element();

        assertEquals(0, r.removeElement(new int[]{}, 3));
        assertEquals(0, r.removeElement(new int[]{3, 3, 3, 3}, 3));
        assertEquals(4, r.removeElement(new int[]{3, 3, 3, 3}, 4));
        assertEquals(2, r.removeElement(new int[]{3, 2, 2, 3}, 3));
        assertEquals(5, r.removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2));
    }

}